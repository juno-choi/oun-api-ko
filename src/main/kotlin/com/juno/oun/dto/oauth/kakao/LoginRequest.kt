package com.juno.oun.dto.oauth.kakao

class LoginRequest (
    val access_token: String,
    val token_type: String,
    val refresh_token: String,
    val expires_in: Number,
    val scope: String,
    val refresh_token_expires_in: Number,
)