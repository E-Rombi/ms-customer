package br.com.eduardo.mscustomer.validCustomer.adapter.`in`.web

import br.com.eduardo.mscustomer.validCustomer.application.port.ValidCustomerUseCase
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/customers")
class ValidCustomerController(
    val validCustomerUseCase: ValidCustomerUseCase
) {

    private val logger = LoggerFactory.getLogger(ValidCustomerController::class.java)

    @GetMapping("/{customerId}/valid")
    fun validCustomer(
        @RequestHeader(required = false, name = "Correlation-id") correlationId: String?,
        @PathVariable customerId: String
    ): ResponseEntity<Any> {
        val cId = correlationId ?: UUID.randomUUID().toString()

        validCustomerUseCase.validate(customerId, cId)

        logger.info("action=validCustomer, customerId=$customerId, status=${HttpStatus.OK}, cId=$cId")
        return ResponseEntity.ok().build()
    }
}