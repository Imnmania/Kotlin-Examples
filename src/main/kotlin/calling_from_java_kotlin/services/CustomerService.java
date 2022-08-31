package calling_from_java_kotlin.services;

import calling_from_java_kotlin.models.Customer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CustomerService {

    public void processCustomer(Customer customer) {
        customer.customerHasLongName();
    }

    @NotNull
    public Customer customerFromSocial(String handle) {
        // social api
        return new Customer("Bob");
    }

    @NotNull
    public ArrayList<Customer> processedCustomers() {
        return new ArrayList<Customer>();
    }

}
