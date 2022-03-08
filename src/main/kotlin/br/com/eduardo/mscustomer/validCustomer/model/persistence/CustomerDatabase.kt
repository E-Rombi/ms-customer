package br.com.eduardo.mscustomer.validCustomer.model.persistence

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable

@DynamoDBTable(tableName = "customer")
class CustomerDatabase {
    @field:DynamoDBHashKey var id: String? = null
    @field:DynamoDBAttribute var fantasyName: String? = null
}

