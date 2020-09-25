package com.codegym.servce;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerServiceIml implements CustomerService {
    private static Map<Integer,Customer> customers;
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findId(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
