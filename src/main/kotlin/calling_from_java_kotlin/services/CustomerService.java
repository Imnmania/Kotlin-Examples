package calling_from_java_kotlin.services;

import calling_from_java_kotlin.extensions.StringExtensions;
import calling_from_java_kotlin.extensions.StringExtensionsKotlinKt;
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
        Customer c = new Customer("Bob");
        //* calling kotlin extension functions
//        String initials = StringExtensionsKotlinKt.initials(c.getName());

        //* calling kotlin extension using @file:JvmName("StringExtensions")
        String initials = StringExtensions.initials(c.getName());

        System.out.println(initials);
        return c;
    }

    @NotNull
    public ArrayList<Customer> processedCustomers() {
        return new ArrayList<Customer>();
    }

}
