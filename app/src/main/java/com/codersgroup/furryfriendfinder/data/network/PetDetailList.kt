package com.codersgroup.furryfriendfinder.data.network

import com.google.gson.annotations.SerializedName

data class PetDetailListResponse(
    @SerializedName("totalCount")
    val totalCount: Int? = null,

    @SerializedName("start")
    val start: Int? = null,

    @SerializedName("rows")
    val rows: Int? = null,

    @SerializedName("result")
    val result: List<PetDetailResponse>? = null
)