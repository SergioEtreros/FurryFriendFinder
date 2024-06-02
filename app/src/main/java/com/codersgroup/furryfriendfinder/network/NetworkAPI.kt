package com.codersgroup.furryfriendfinder.network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import com.codersgroup.furryfriendfinder.data.network.*
import retrofit2.http.Header

interface NetworkAPI {

    @GET("servicio/mascotas/{id}")
    fun getPetDetails(
        @Path("id") id: String,
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<PetResponse>

    @GET("servicio/proteccion-animal/{id}")
    fun getAnimalDetails(
        @Path("id") id: String,
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<ProtectedPetResponse>

    @GET("servicio/proteccion-animal/mascota-perdida/{id}")
    fun getMissingPetDetails(
        @Path("id") id: String,
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Query("account_id") accountId: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<MissingPetResponse>

    @GET("servicio/proteccion-animal/query")
    fun queryAnimals(
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Query("start") start: Int? = 0,
        @Query("rows") rows: Int? = 50,
        @Query("sort") sort: String? = "title asc",
        @Query("query") query: String? = null,
        @Query("title") title: String? = null,
        @Query("fq") fq: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<PetDetailResponse>

    @GET("servicio/proteccion-animal")
    fun listAnimals(
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Query("logger") logger: String? = null,
        @Query("ANIMAL_DISPONIBILIDAD_DISPONIBLE") available: String? = null,
        @Query("ANIMAL_DISPONIBILIDAD_NO_DISPONIBLE") notAvailable: String? = null,
        @Query("ANIMAL_DISPONIBILIDAD_NO_ADOPTABLE") notAdoptable: String? = null,
        @Query("ANIMAL_DISPONIBILIDAD_PERDIDO") lost: String? = null,
        @Query("ANIMAL_LUGAR_CASA_ACOGIDA") fosterHome: String? = null,
        @Query("id") id: Int? = null,
        @Query("title") title: String? = null,
        @Query("especie") species: String? = null,
        @Query("raza") breed: String? = null,
        @Query("sexo") sex: String? = null,
        @Query("peligroso") dangerous: String? = null,
        @Query("fechaNacimiento") birthDate: String? = null,
        @Query("capa") coat: String? = null,
        @Query("tamagno") size: String? = null,
        @Query("description") description: String? = null,
        @Query("foto") photo: String? = null,
        @Query("file_array") fileArray: Set<String>? = null,
        @Query("lugar") location: String? = null,
        @Query("espacio") space: String? = null,
        @Query("chenil") kennel: String? = null,
        @Query("disponibilidad") availability: String? = null,
        @Query("identificadoIngreso") identifiedAtIntake: String? = null,
        @Query("microchip") microchip: String? = null,
        @Query("cartilla") medicalCard: String? = null,
        @Query("pasaporteISO") passportISO: String? = null,
        @Query("pasaporteNum") passportNumber: String? = null,
        @Query("rabia") rabies: String? = null,
        @Query("fechaRabia") rabiesDate: String? = null,
        @Query("esterilizado") sterilized: String? = null,
        @Query("lugarEsterilizacion") sterilizationLocation: String? = null,
        @Query("fechaEsterilizacion") sterilizationDate: String? = null,
        @Query("caracter") temperament: String? = null,
        @Query("enCMPA") inCMPA: String? = null,
        @Query("entradas") entries: Set<String>? = null,
        @Query("creationDate") creationDate: String? = null,
        @Query("lastUpdated") lastUpdated: String? = null,
        @Query("start") start: Int? = 0,
        @Query("rows") rows: Int? = 50,
        @Query("q") q: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<PetDetailListResponse>

    @GET("servicio/mascotas")
    fun listPets(
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Query("id") id: Int? = null,
        @Query("ficha") fileNumber: String? = null,
        @Query("raza") breed: String? = null,
        @Query("sexo") sex: String? = null,
        @Query("fechaNac") birthDate: String? = null,
        @Query("edad") age: String? = null,
        @Query("tamagno") size: String? = null,
        @Query("peso") weight: String? = null,
        @Query("observaciones") observations: String? = null,
        @Query("foto") photo: String? = null,
        @Query("nombre") name: String? = null,
        @Query("especie") species: String? = null,
        @Query("color") color: String? = null,
        @Query("chenil") kennel: String? = null,
        @Query("peligroso") dangerous: Boolean? = null,
        @Query("microchip") microchip: String? = null,
        @Query("cartilla") medicalCard: String? = null,
        @Query("rabia") rabies: Boolean? = null,
        @Query("fechaRabia") rabiesDate: String? = null,
        @Query("esterilizado") sterilized: Boolean? = null,
        @Query("perdido") lost: Boolean? = null,
        @Query("evaluacion") evaluation: String? = null,
        @Query("caracter") temperament: String? = null,
        @Query("observacionesVet") vetObservations: String? = null,
        @Query("fechaIngreso") admissionDate: String? = null,
        @Query("formaEntrada") entryMethod: String? = null,
        @Query("entrada") entry: String? = null,
        @Query("urgencias") emergency: Boolean? = null,
        @Query("horaUrgencias") emergencyHour: String? = null,
        @Query("numPolicia") policeNumber: String? = null,
        @Query("nombreSolicitante") applicantFirstName: String? = null,
        @Query("apellidosSolicitante") applicantLastName: String? = null,
        @Query("dniSolicitante") applicantDni: String? = null,
        @Query("telefonoSolicitante") applicantPhone: String? = null,
        @Query("domicilioSolicitante") applicantAddress: String? = null,
        @Query("mailSolicitante") applicantEmail: String? = null,
        @Query("disponible") available: String? = null,
        @Query("fechaAdopcion") adoptionDate: String? = null,
        @Query("nombreInteresado") interestedFirstName: String? = null,
        @Query("apellidosInteresado") interestedLastName: String? = null,
        @Query("dniInteresado") interestedDni: String? = null,
        @Query("telefonoInteresado") interestedPhone: String? = null,
        @Query("mailInteresado") interestedEmail: String? = null,
        @Query("direccionInteresado") interestedAddress: String? = null,
        @Query("tasa") fee: String? = null,
        @Query("importe") amount: Double? = null,
        @Query("pago") payment: String? = null,
        @Query("bloquear") blocked: Boolean? = null,
        @Query("desbloquear") unblocked: Boolean? = null,
        @Query("fechaBloqueo") blockDate: String? = null,
        @Query("start") start: Int? = 0,
        @Query("rows") rows: Int? = 50,
        @Query("q") q: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<PetListResponse>

    @GET("servicio/proteccion-animal/mascota-perdida")
    fun listMissingPets(
        @Query("fl") attributes: String? = null,
        @Query("rf") format: String? = null,
        @Query("VISIBLE") visible: String? = null,
        @Query("OCULTA") hidden: String? = null,
        @Query("id") id: Int? = null,
        @Query("title") title: String? = null,
        @Query("image") image: String? = null,
        @Query("ownerName") ownerName: String? = null,
        @Query("phoneNumber") phoneNumber: String? = null,
        @Query("email") email: String? = null,
        @Query("publicDataAuth") publicDataAuth: String? = null,
        @Query("active") active: String? = null,
        @Query("missingDate") missingDate: String? = null,
        @Query("zone") zone: String? = null,
        @Query("comments") comments: String? = null,
        @Query("creationDate") creationDate: String? = null,
        @Query("lastUpdated") lastUpdated: String? = null,
        @Query("visible") visibility: String? = null,
        @Query("file_array") fileArray: Set<String>? = null,
        @Query("media_name") mediaName: String? = null,
        @Query("media_body") mediaBody: String? = null,
        @Query("owned") owned: Boolean? = null,
        @Query("start") start: Int? = 0,
        @Query("rows") rows: Int? = 50,
        @Query("q") q: String? = null,
        @Query("account_id") accountId: String? = null,
        @Header("Accept") accept: String = "application/json"
    ): Call<MissingPetListResponse>
}