package br.com.eduardo.mscustomer.validCustomer.adapter.out.persistence

import br.com.eduardo.mscustomer.validCustomer.application.port.FindCustomerByIdPort
import br.com.eduardo.mscustomer.validCustomer.model.Customer
import br.com.eduardo.mscustomer.validCustomer.model.exception.ResourceNotFoundException
import br.com.eduardo.mscustomer.validCustomer.model.mapper.CustomerDatabaseMapper
import br.com.eduardo.mscustomer.validCustomer.model.persistence.CustomerDatabase
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryAdapter(
    val dynamoDBMapper: DynamoDBMapper
) : FindCustomerByIdPort {

    override fun find(id: String): Customer {
        val customerDatabase = dynamoDBMapper.load(CustomerDatabase::class.java, id)
            ?: throw ResourceNotFoundException("Customer not found")

        return CustomerDatabaseMapper.toCustomer(customerDatabase)
    }
}