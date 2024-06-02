package com.codersgroup.furryfriendfinder.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import com.codersgroup.furryfriendfinder.data.network.*
class Network : INetwork {

    companion object {
        private const val TIMEOUT = 30L

        private val retrofit: Retrofit by lazy {
            val logging = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }

            val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                .build()

            Retrofit.Builder()
                .baseUrl(NetworkConfig.getBackendBaseUrl())
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api: NetworkAPI by lazy {
            retrofit.create(NetworkAPI::class.java)
        }
    }

    override fun getPetDetails(id: String, attributes: String?, format: String?): Call<PetResponse> {
        return api.getPetDetails(id, attributes, format, "application/json")
    }

    override fun getAnimalDetails(id: String, attributes: String?, format: String?): Call<ProtectedPetResponse> {
        return api.getAnimalDetails(id, attributes, format, "application/json")
    }

    override fun getMissingPetDetails(id: String, attributes: String?, format: String?, accountId: String?): Call<MissingPetResponse> {
        return api.getMissingPetDetails(id, attributes, format, accountId, "application/json")
    }

    override fun queryAnimals(
        attributes: String?, format: String?, start: Int?, rows: Int?, sort: String?,
        query: String?, title: String?, fq: String?
    ): Call<PetDetailResponse> {
        return api.queryAnimals(attributes, format, start, rows, sort, query, title, fq, "application/json")
    }

    override fun listAnimals(
        attributes: String?, format: String?, logger: String?, available: String?, notAvailable: String?,
        notAdoptable: String?, lost: String?, fosterHome: String?, id: Int?, title: String?,
        species: String?, breed: String?, sex: String?, dangerous: String?, birthDate: String?,
        coat: String?, size: String?, description: String?, photo: String?, fileArray: Set<String>?,
        location: String?, space: String?, kennel: String?, availability: String?, identifiedAtIntake: String?,
        microchip: String?, medicalCard: String?, passportISO: String?, passportNumber: String?, rabies: String?,
        rabiesDate: String?, sterilized: String?, sterilizationLocation: String?, sterilizationDate: String?,
        temperament: String?, inCMPA: String?, entries: Set<String>?, creationDate: String?, lastUpdated: String?,
        start: Int?, rows: Int?, q: String?
    ): Call<PetDetailListResponse> {
        return api.listAnimals(
            attributes, format, logger, available, notAvailable, notAdoptable, lost, fosterHome, id, title,
            species, breed, sex, dangerous, birthDate, coat, size, description, photo, fileArray, location,
            space, kennel, availability, identifiedAtIntake, microchip, medicalCard, passportISO, passportNumber,
            rabies, rabiesDate, sterilized, sterilizationLocation, sterilizationDate, temperament, inCMPA, entries,
            creationDate, lastUpdated, start, rows, q, "application/json"
        )
    }

    override fun listPets(
        attributes: String?, format: String?, id: Int?, fileNumber: String?, breed: String?, sex: String?,
        birthDate: String?, age: String?, size: String?, weight: String?, observations: String?, photo: String?,
        name: String?, species: String?, color: String?, kennel: String?, dangerous: Boolean?, microchip: String?,
        medicalCard: String?, rabies: Boolean?, rabiesDate: String?, sterilized: Boolean?, lost: Boolean?,
        evaluation: String?, temperament: String?, vetObservations: String?, admissionDate: String?, entryMethod: String?,
        entry: String?, emergency: Boolean?, emergencyHour: String?, policeNumber: String?, applicantFirstName: String?,
        applicantLastName: String?, applicantDni: String?, applicantPhone: String?, applicantAddress: String?,
        applicantEmail: String?, available: String?, adoptionDate: String?, interestedFirstName: String?,
        interestedLastName: String?, interestedDni: String?, interestedPhone: String?, interestedEmail: String?,
        interestedAddress: String?, fee: String?, amount: Double?, payment: String?, blocked: Boolean?,
        unblocked: Boolean?, blockDate: String?, start: Int?, rows: Int?, q: String?
    ): Call<PetListResponse> {
        return api.listPets(
            attributes, format, id, fileNumber, breed, sex, birthDate, age, size, weight, observations, photo, name,
            species, color, kennel, dangerous, microchip, medicalCard, rabies, rabiesDate, sterilized, lost, evaluation,
            temperament, vetObservations, admissionDate, entryMethod, entry, emergency, emergencyHour, policeNumber,
            applicantFirstName, applicantLastName, applicantDni, applicantPhone, applicantAddress, applicantEmail,
            available, adoptionDate, interestedFirstName, interestedLastName, interestedDni, interestedPhone,
            interestedEmail, interestedAddress, fee, amount, payment, blocked, unblocked, blockDate, start, rows, q,
            "application/json"
        )
    }

    override fun listMissingPets(
        attributes: String?, format: String?, visible: String?, hidden: String?, id: Int?, title: String?,
        image: String?, ownerName: String?, phoneNumber: String?, email: String?, publicDataAuth: String?,
        active: String?, missingDate: String?, zone: String?, comments: String?, creationDate: String?, lastUpdated: String?,
        visibility: String?, fileArray: Set<String>?, mediaName: String?, mediaBody: String?, owned: Boolean?, start: Int?,
        rows: Int?, q: String?, accountId: String?
    ): Call<MissingPetListResponse> {
        return api.listMissingPets(
            attributes, format, visible, hidden, id, title, image, ownerName, phoneNumber, email, publicDataAuth, active,
            missingDate, zone, comments, creationDate, lastUpdated, visibility, fileArray, mediaName, mediaBody, owned,
            start, rows, q, accountId, "application/json"
        )
    }
}
