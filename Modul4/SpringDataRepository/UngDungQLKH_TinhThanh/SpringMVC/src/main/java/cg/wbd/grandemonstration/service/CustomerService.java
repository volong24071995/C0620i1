package cg.wbd.grandemonstration.service;

import cg.wbd.grandemonstration.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {

    Iterable<Customer> findAll();


    Customer findOne(Long id);

    Customer save(Customer customer);

    void delete(Long id);

    void remove(Long id);

    Iterable<Customer> findAll(long id);
}
