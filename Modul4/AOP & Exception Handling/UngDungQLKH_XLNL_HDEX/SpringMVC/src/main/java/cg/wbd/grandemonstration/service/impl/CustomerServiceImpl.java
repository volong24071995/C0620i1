package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.repository.CustomerRepository;
import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.DuplicateEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
}

    @Override
    public Customer findOne(Long id) {
        Customer customer=customerRepository.findById(id).orElse(null);
        if (customer == null) {
            try {
                throw new Exception("customer not found!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return customer;
    }

    @Override
    public Customer save(Customer customer)throws DuplicateEmailException {
        try {
            return customerRepository.save(customer);
        } catch (DataIntegrityViolationException e) {
            throw new DuplicateEmailException();
        }
    }

    @Override
    public void delete(Long id) {

    }
    @Override
    public void remove(Long id) {
        customerRepository.delete(findOne(id));
    }

    @Override
    public Iterable<Customer> findAll(long id) {
        return null;
    }

    @Override
    public Page<Customer> findAllByNameContaining(String name, Pageable pageable) {
        return customerRepository.findAllByNameContaining(name, pageable);
    }
}