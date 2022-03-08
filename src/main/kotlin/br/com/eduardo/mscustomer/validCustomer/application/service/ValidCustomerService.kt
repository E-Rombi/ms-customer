package br.com.eduardo.mscustomer.validCustomer.application.service

import br.com.eduardo.mscustomer.validCustomer.application.port.FindCustomerByIdPort
import br.com.eduardo.mscustomer.validCustomer.application.port.ValidCustomerUseCase
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ValidCustomerService(
    val findCustomerByIdPort: FindCustomerByIdPort
) : ValidCustomerUseCase {

    private val logger = LoggerFactory.getLogger(ValidCustomerUseCase::class.java)

    override fun validate(customerId: String, cId: String) {
        findCustomerByIdPort.find(customerId)
    }
}