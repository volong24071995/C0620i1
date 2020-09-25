package com.codegym.servce;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findId(int id);
    void update(int id, Customer customer);
    void remove(int id);
}
