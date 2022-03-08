package br.com.eduardo.mscustomer.validCustomer.application.port

interface ValidCustomerUseCase {

    fun validate(customerId: String, cId: String)
}
