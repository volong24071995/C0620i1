package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerService;


import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class HibernateCustomerServiceImpl implements CustomerService {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findOne(Long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Customer save(Customer customer) {
        if (customer.getId() != null) {
            em.merge(customer);
        } else {
           em.persist(customer);
        }
        return customer;
    }


    @Override
    public void delete(Long id) {
        Customer customer = findOne(id);
        if (customer != null) {
            em.remove(customer);
        }
    }
}