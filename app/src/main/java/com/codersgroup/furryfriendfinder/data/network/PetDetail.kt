package com.codersgroup.furryfriendfinder.data.network

import com.codersgroup.furryfriendfinder.data.network.utils.toDate
import com.codersgroup.furryfriendfinder.data.network.utils.toFormattedString
import com.google.gson.annotations.SerializedName

data class PetDetailResponse(
    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("ficha")
    val fileNumber: String? = null,

    @SerializedName("raza")
    val breed: String? = null,

    @SerializedName("sexo")
    val sex: String? = null,

    @SerializedName("fechaNac")
    val birthDate: String? = null,

    @SerializedName("edad")
    val age: String? = null,

    @SerializedName("tamagno")
    val size: String? = null,

    @SerializedName("peso")
    val weight: String? = null,

    @SerializedName("observaciones")
    val observations: String? = null,

    @SerializedName("nombre")
    val name: String? = null,

    @SerializedName("especie")
    val species: String? = null,

    @SerializedName("color")
    val color: String? = null,

    @SerializedName("chenil")
    val kennel: String? = null,

    @SerializedName("peligroso")
    val dangerous: Boolean? = null,

    @SerializedName("microchip")
    val microchip: String? = null,

    @SerializedName("cartilla")
    val medicalCard: String? = null,

    @SerializedName("rabia")
    val rabiesVaccinated: Boolean? = null,

    @SerializedName("fechaRabia")
    val rabiesVaccinationDate: String? = null,

    @SerializedName("esterilizado")
    val sterilized: Boolean? = null,

    @SerializedName("perdido")
    val lost: Boolean? = null,

    @SerializedName("evaluacion")
    val evaluation: String? = null,

    @SerializedName("caracter")
    val temperament: String? = null,

    @SerializedName("observacionesVet")
    val vetObservations: String? = null,

    @SerializedName("fechaIngreso")
    val admissionDate: String? = null,

    @SerializedName("formaEntrada")
    val entryMethod: String? = null,

    @SerializedName("entrada")
    val entry: String? = null,

    @SerializedName("urgencias")
    val emergency: Boolean? = null,

    @SerializedName("horaUrgencias")
    val emergencyHour: String? = null,

    @SerializedName("numPolicia")
    val policeNumber: String? = null,

    @SerializedName("nombreSolicitante")
    val applicantFirstName: String? = null,

    @SerializedName("apellidosSolicitante")
    val applicantLastName: String? = null,

    @SerializedName("dniSolicitante")
    val applicantDni: String? = null,

    @SerializedName("telefonoSolicitante")
    val applicantPhone: String? = null,

    @SerializedName("domicilioSolicitante")
    val applicantAddress: String? = null,

    @SerializedName("mailSolicitante")
    val applicantEmail: String? = null,

    @SerializedName("disponible")
    val available: String? = null,

    @SerializedName("fechaAdopcion")
    val adoptionDate: String? = null,

    @SerializedName("nombreInteresado")
    val interestedFirstName: String? = null,

    @SerializedName("apellidosInteresado")
    val interestedLastName: String? = null,

    @SerializedName("dniInteresado")
    val interestedDni: String? = null,

    @SerializedName("telefonoInteresado")
    val interestedPhone: String? = null,

    @SerializedName("mailInteresado")
    val interestedEmail: String? = null,

    @SerializedName("direccionInteresado")
    val interestedAddress: String? = null,

    @SerializedName("tasa")
    val fee: String? = null,

    @SerializedName("importe")
    val amount: Double? = null,

    @SerializedName("pago")
    val payment: String? = null,

    @SerializedName("bloquear")
    val blocked: Boolean? = null,

    @SerializedName("desbloquear")
    val unblocked: Boolean? = null,

    @SerializedName("fechaBloqueo")
    val blockDate: String? = null
) {
    val formattedBirthDate: String
        get() = birthDate.toDate()?.toFormattedString() ?: ""

    val formattedRabiesVaccinationDate: String
        get() = rabiesVaccinationDate.toDate()?.toFormattedString() ?: ""

    val formattedAdmissionDate: String
        get() = admissionDate.toDate()?.toFormattedString() ?: ""

    val formattedAdoptionDate: String
        get() = adoptionDate.toDate()?.toFormattedString() ?: ""

    val formattedBlockDate: String
        get() = blockDate.toDate()?.toFormattedString() ?: ""
}
