package com.codersgroup.furryfriendfinder.network

object NetworkConfig {

    private var baseUrl: String? = null

    fun setup(
        backendBaseUrl: String
    ): NetworkConfig {
        this.baseUrl = backendBaseUrl
        return this
    }


    fun getBackendBaseUrl(): String {
        return baseUrl ?: throw IllegalStateException("Call NetworkConfig.setup(...) before use!")
    }

}
