package Kiosk.repository;

import Kiosk.Domain.Customer;

import java.util.HashMap;

public class CustomerRepository {
    HashMap<String, Customer> store = new HashMap<>();
    public void  save(Customer customer){
        store.put(customer.getPhonenumber(), customer);
    }
}
