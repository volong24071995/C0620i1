package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepository;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;


import javax.transaction.Transactional;


@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findOne(Long id) {
        return customerRepository.findOne(id);
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(findOne(id));
    }
}