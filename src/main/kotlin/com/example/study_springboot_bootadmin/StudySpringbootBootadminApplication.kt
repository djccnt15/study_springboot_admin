package com.example.study_springboot_bootadmin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableAdminServer
@SpringBootApplication
class StudySpringbootBootadminApplication

fun main(args: Array<String>) {
    runApplication<StudySpringbootBootadminApplication>(*args)
}
