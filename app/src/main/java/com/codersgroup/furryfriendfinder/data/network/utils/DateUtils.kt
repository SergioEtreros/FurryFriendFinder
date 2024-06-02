package com.codersgroup.furryfriendfinder.data.network.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun Date?.toFormattedString(): String {
    return if (this != null) {
        val format = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
        format.format(this)
    } else {
        ""
    }
}

fun String?.toDate(): Date? {
    return if (this != null) {
        val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        format.timeZone = TimeZone.getTimeZone("UTC")
        format.parse(this)
    } else {
        null
    }
}

fun String?.toPartialDate(): Date? {
    return if (this != null) {
        val format = SimpleDateFormat("yyyy-MM", Locale.getDefault())
        format.parse(this)
    } else {
        null
    }
}