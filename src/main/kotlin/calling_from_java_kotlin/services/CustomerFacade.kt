package calling_from_java_kotlin.services

import calling_from_java_kotlin.extensions.initials

class CustomerFacade(customerService: CustomerService) {

    init {
        //* the "!" here means Platform Type, since we are calling Java code here
        val customer = customerService.customerFromSocial("@exampleUsername")
        val customers = customerService.processedCustomers()

        var initials = customer.name.initials()
    }

}