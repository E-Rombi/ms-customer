package br.com.eduardo.mscustomer.validCustomer.application.port

import br.com.eduardo.mscustomer.validCustomer.model.Customer

interface FindCustomerByIdPort {

    fun find(id: String): Customer
}
