package com.example.movies_retrofit.data.model.configuration


import com.google.gson.annotations.SerializedName

data class ConfigurationResponse(
    @SerializedName("change_keys")
    val changeKeys: List<String?>? = null,
    @SerializedName("images")
    val images: Images? = null
)