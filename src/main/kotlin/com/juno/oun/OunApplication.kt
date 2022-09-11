package com.juno.oun

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OunApplication

fun main(args: Array<String>) {
	runApplication<OunApplication>(*args)
}
