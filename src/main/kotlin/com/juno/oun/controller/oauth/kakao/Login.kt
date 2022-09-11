package com.juno.oun.controller.oauth.kakao

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = arrayOf("/v1/oauth/kakao"))
class Login {
    @GetMapping("/login")
    fun login(
        @RequestParam code: String,
    ): String{
        print("kakao login 호출 code = "+ code)
        return ""
    }
}