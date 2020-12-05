package com.qb.kubilogs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KubilogsApplication

fun main(args: Array<String>) {
    runApplication<KubilogsApplication>(*args)
}
