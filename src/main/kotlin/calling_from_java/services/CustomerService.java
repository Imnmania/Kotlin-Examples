package calling_from_java.services;

import calling_from_java.models.Customer;

public class CustomerService {

    public void processCustomer(Customer customer) {
        customer.customerHasLongName();
    }

}
