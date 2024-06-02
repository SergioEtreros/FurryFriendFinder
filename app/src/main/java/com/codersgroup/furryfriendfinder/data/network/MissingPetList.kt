package com.codersgroup.furryfriendfinder.data.network

import com.codersgroup.furryfriendfinder.data.network.utils.toDate
import com.codersgroup.furryfriendfinder.data.network.utils.toFormattedString
import com.codersgroup.furryfriendfinder.data.network.utils.toPartialDate
import com.google.gson.annotations.SerializedName

/*
    Swagger indicates this service should return a list model, but it's not
*/
data class MissingPetListResponse(
    @SerializedName("VISIBLE")
    val visibleText: String? = null,

    @SerializedName("OCULTA")
    val hiddenText: String? = null,

    @SerializedName("id")
    val id: Int? = null,

    @SerializedName("title")
    val title: String? = null,

    @SerializedName("image")
    val image: String? = null,

    @SerializedName("ownerName")
    val ownerName: String? = null,

    @SerializedName("phoneNumber")
    val phoneNumber: String? = null,

    @SerializedName("email")
    val email: String? = null,

    @SerializedName("publicDataAuth")
    val publicDataAuth: String? = null,

    @SerializedName("active")
    val active: String? = null,

    @SerializedName("missingDate")
    val missingDate: String? = null,

    @SerializedName("zone")
    val zone: String? = null,

    @SerializedName("comments")
    val comments: String? = null,

    @SerializedName("creationDate")
    val creationDate: String? = null,

    @SerializedName("lastUpdated")
    val lastUpdated: String? = null,

    @SerializedName("visible")
    val visible: String? = null
) {
    val formattedMissingDate: String
        get() = missingDate.toDate()?.toFormattedString() ?: ""

    val formattedCreationDate: String
        get() = creationDate.toPartialDate()?.toFormattedString() ?: ""

    val formattedLastUpdated: String
        get() = lastUpdated.toPartialDate()?.toFormattedString() ?: ""
}
