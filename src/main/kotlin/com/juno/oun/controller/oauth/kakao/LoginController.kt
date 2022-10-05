package com.juno.oun.controller.oauth.kakao

import com.juno.oun.dto.oauth.kakao.LoginRequest
import com.juno.oun.service.oauth.kakao.LoginService
import mu.KotlinLogging
import org.springframework.web.bind.annotation.*

private val log = KotlinLogging.logger {}
@RestController
@RequestMapping(value = arrayOf("/v1/oauth/kakao"))
class LoginController (
    private val loginService: LoginService,
){

    @PostMapping("/login")
    fun login(
        @RequestBody loginRequest: LoginRequest,
    ): String{
        log.debug { "kakao login 호출" }
        loginService.kakaoLogin(loginRequest)
        return ""
    }
}