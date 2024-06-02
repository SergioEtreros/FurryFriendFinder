package com.codersgroup.furryfriendfinder.network

import retrofit2.Call
import com.codersgroup.furryfriendfinder.data.network.*

interface INetwork {

    fun getPetDetails(
        id: String,
        attributes: String? = null,
        format: String? = null
    ): Call<PetResponse>

    fun getAnimalDetails(
        id: String,
        attributes: String? = null,
        format: String? = null
    ): Call<ProtectedPetResponse>

    fun getMissingPetDetails(
        id: String,
        attributes: String? = null,
        format: String? = null,
        accountId: String? = null
    ): Call<MissingPetResponse>

    fun queryAnimals(
        attributes: String? = null,
        format: String? = null,
        start: Int? = 0,
        rows: Int? = 50,
        sort: String? = "title asc",
        query: String? = null,
        title: String? = null,
        fq: String? = null
    ): Call<PetDetailResponse>

    fun listAnimals(
        attributes: String? = null,
        format: String? = null,
        logger: String? = null,
        available: String? = null,
        notAvailable: String? = null,
        notAdoptable: String? = null,
        lost: String? = null,
        fosterHome: String? = null,
        id: Int? = null,
        title: String? = null,
        species: String? = null,
        breed: String? = null,
        sex: String? = null,
        dangerous: String? = null,
        birthDate: String? = null,
        coat: String? = null,
        size: String? = null,
        description: String? = null,
        photo: String? = null,
        fileArray: Set<String>? = null,
        location: String? = null,
        space: String? = null,
        kennel: String? = null,
        availability: String? = null,
        identifiedAtIntake: String? = null,
        microchip: String? = null,
        medicalCard: String? = null,
        passportISO: String? = null,
        passportNumber: String? = null,
        rabies: String? = null,
        rabiesDate: String? = null,
        sterilized: String? = null,
        sterilizationLocation: String? = null,
        sterilizationDate: String? = null,
        temperament: String? = null,
        inCMPA: String? = null,
        entries: Set<String>? = null,
        creationDate: String? = null,
        lastUpdated: String? = null,
        start: Int? = 0,
        rows: Int? = 50,
        q: String? = null
    ): Call<PetDetailListResponse>

    fun listPets(
        attributes: String? = null,
        format: String? = null,
        id: Int? = null,
        fileNumber: String? = null,
        breed: String? = null,
        sex: String? = null,
        birthDate: String? = null,
        age: String? = null,
        size: String? = null,
        weight: String? = null,
        observations: String? = null,
        photo: String? = null,
        name: String? = null,
        species: String? = null,
        color: String? = null,
        kennel: String? = null,
        dangerous: Boolean? = null,
        microchip: String? = null,
        medicalCard: String? = null,
        rabies: Boolean? = null,
        rabiesDate: String? = null,
        sterilized: Boolean? = null,
        lost: Boolean? = null,
        evaluation: String? = null,
        temperament: String? = null,
        vetObservations: String? = null,
        admissionDate: String? = null,
        entryMethod: String? = null,
        entry: String? = null,
        emergency: Boolean? = null,
        emergencyHour: String? = null,
        policeNumber: String? = null,
        applicantFirstName: String? = null,
        applicantLastName: String? = null,
        applicantDni: String? = null,
        applicantPhone: String? = null,
        applicantAddress: String? = null,
        applicantEmail: String? = null,
        available: String? = null,
        adoptionDate: String? = null,
        interestedFirstName: String? = null,
        interestedLastName: String? = null,
        interestedDni: String? = null,
        interestedPhone: String? = null,
        interestedEmail: String? = null,
        interestedAddress: String? = null,
        fee: String? = null,
        amount: Double? = null,
        payment: String? = null,
        blocked: Boolean? = null,
        unblocked: Boolean? = null,
        blockDate: String? = null,
        start: Int? = 0,
        rows: Int? = 50,
        q: String? = null
    ): Call<PetListResponse>

    fun listMissingPets(
        attributes: String? = null,
        format: String? = null,
        visible: String? = null,
        hidden: String? = null,
        id: Int? = null,
        title: String? = null,
        image: String? = null,
        ownerName: String? = null,
        phoneNumber: String? = null,
        email: String? = null,
        publicDataAuth: String? = null,
        active: String? = null,
        missingDate: String? = null,
        zone: String? = null,
        comments: String? = null,
        creationDate: String? = null,
        lastUpdated: String? = null,
        visibility: String? = null,
        fileArray: Set<String>? = null,
        mediaName: String? = null,
        mediaBody: String? = null,
        owned: Boolean? = null,
        start: Int? = 0,
        rows: Int? = 50,
        q: String? = null,
        accountId: String? = null
    ): Call<MissingPetListResponse>
}