package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.repository.CustomerRepository;
import cg.wbd.grandemonstration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

//    @Override
//    public Page<Customer> findAll(Pageable pageable) {
//            return customerRepository.findAll(pageable);
//}

    @Override
    public Customer findOne(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
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
}