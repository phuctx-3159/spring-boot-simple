package com.apress.springbootsimple

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootSimpleApplication

fun main(args: Array<String>) {
	runApplication<SpringBootSimpleApplication>(*args)
}
