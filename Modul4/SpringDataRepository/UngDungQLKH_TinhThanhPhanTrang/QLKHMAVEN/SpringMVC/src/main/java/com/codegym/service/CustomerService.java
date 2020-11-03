package com.codegym.service;

import com.codegym.model.Customer;

import java.util.List;

public interface CustomerService {

    Iterable<Customer> findAll();

    Customer findOne(Long id);

    Customer save(Customer customer);
    void delete(Long id);

    void remove(Long id);
}
