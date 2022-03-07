package br.com.eduardo.mscustomer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsCustomerApplication

fun main(args: Array<String>) {
    runApplication<MsCustomerApplication>(*args)
}
