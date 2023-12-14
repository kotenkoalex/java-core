package com.kotenko.spring.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao {
    private static final List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer alex = new Customer(0, "Alex", "alex@gmail.com", 22);
        Customer max = new Customer(1, "Max", "max@gmail.com", 22);
        customers.add(alex);
        customers.add(max);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream()
                .filter(it -> it.getId().equals(id))
                .findFirst();
    }
}
