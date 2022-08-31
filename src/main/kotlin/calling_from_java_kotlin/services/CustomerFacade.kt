package calling_from_java_kotlin.services

class CustomerFacade(customerService: CustomerService) {

    init {
        //* the "!" here means Platform Type, since we are calling Java code here
        val customer = customerService.customerFromSocial("@exampleUsername")
        val customers = customerService.processedCustomers()
    }

}