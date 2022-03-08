package br.com.eduardo.mscustomer.validCustomer.model.mapper

import br.com.eduardo.mscustomer.validCustomer.model.Customer
import br.com.eduardo.mscustomer.validCustomer.model.persistence.CustomerDatabase

class CustomerDatabaseMapper {

    companion object {
        fun toCustomer(customerDatabase: CustomerDatabase): Customer {
            return Customer(customerDatabase.fantasyName.orEmpty())
                .apply { id = customerDatabase.id.orEmpty() }
        }
    }
}