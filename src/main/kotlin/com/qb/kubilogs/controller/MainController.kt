package com.qb.kubilogs.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class MainController {

    @GetMapping("/welcome")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) {
        val s = "hi bitches";
    }
}