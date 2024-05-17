package com.nqmgaming.shoseshop.data.model.signUp

data class SignUpRequest (
    val email: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val address: String,
    val phoneNumber: String
)