package com.juno.oun.service.oauth.kakao

import com.juno.oun.dto.oauth.kakao.LoginRequest
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val log = KotlinLogging.logger {}
@Service
class LoginServiceImpl(): LoginService{
    override fun kakaoLogin(loginRequest: LoginRequest) {
        log.debug { "access_token = ${loginRequest.access_token}" }
        log.debug { "refresh_token = ${loginRequest.refresh_token}" }
    }
}