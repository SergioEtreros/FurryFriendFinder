package com.codersgroup.furryfriendfinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.codersgroup.furryfriendfinder.data.network.PetResponse
import com.codersgroup.furryfriendfinder.network.INetwork
import com.codersgroup.furryfriendfinder.network.Network
import com.codersgroup.furryfriendfinder.network.NetworkConfig
import com.codersgroup.furryfriendfinder.ui.theme.FurryFriendFinderTheme
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      FurryFriendFinderTheme {


        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
          //TODO: delete this implementation after successfully passing all test cases for network module

          NetworkConfig.setup(
              backendBaseUrl = "https://www.zaragoza.es/sede/",
          )

          val network: INetwork = Network()

          network.getPetDetails("642").enqueue(object : Callback<PetResponse> {
            override fun onResponse(call: Call<PetResponse>, response: Response<PetResponse>) {
              if (response.isSuccessful) {
                val responseBody = response.body()
                println("Response: $responseBody")
              } else {
                val errorBody = response.errorBody()?.string()
                println("Error: $errorBody")
              }
            }

            override fun onFailure(call: Call<PetResponse>, t: Throwable) {
              println("Failure: ${t.message}")
            }
          })



        }
      }
    }
  }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  FurryFriendFinderTheme {
    Greeting("Android")
  }
}