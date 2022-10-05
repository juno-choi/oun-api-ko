package com.juno.oun.service.oauth.kakao

import com.juno.oun.dto.oauth.kakao.LoginRequest

interface LoginService {
    fun kakaoLogin(loginRequest: LoginRequest)
}