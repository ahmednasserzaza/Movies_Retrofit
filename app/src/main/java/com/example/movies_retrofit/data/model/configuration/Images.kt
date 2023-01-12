package com.example.movies_retrofit.data.model.configuration


import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("backdrop_sizes")
    val backdropSizes: List<String?>? = null,
    @SerializedName("base_url")
    val baseUrl: String? = null,
    @SerializedName("logo_sizes")
    val logoSizes: List<String?>? = null,
    @SerializedName("poster_sizes")
    val posterSizes: List<String?>? = null,
    @SerializedName("profile_sizes")
    val profileSizes: List<String?>? = null,
    @SerializedName("secure_base_url")
    val secureBaseUrl: String? = null,
    @SerializedName("still_sizes")
    val stillSizes: List<String?>? = null
)