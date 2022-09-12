package com.juno.oun.controller.oauth.kakao

import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private val log = KotlinLogging.logger {}
@RestController
@RequestMapping(value = arrayOf("/v1/oauth/kakao"))
class Login {

    @GetMapping("/login")
    fun login(
        @RequestParam code: String,
    ): String{
        log.debug { "kakao login 호출 code = $code" }
        return ""
    }
}