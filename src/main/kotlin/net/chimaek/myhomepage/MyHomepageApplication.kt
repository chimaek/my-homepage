package net.chimaek.myhomepage

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class MyHomepageApplication

fun main(args: Array<String>) {
    runApplication<MyHomepageApplication>(*args)
}
