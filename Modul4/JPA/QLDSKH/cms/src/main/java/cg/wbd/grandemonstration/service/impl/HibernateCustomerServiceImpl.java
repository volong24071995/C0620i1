package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerService;

import javax.ejb.EJB;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@EJB
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
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public Customer save(Customer customer) {
        if(customer.getId() != null){
            em.merge(customer);
        } else {
            em.persist(customer);
        }
        return customer;
    }


    @Override
    public void delete(Long id) {
        Customer customer = findOne(id);
        if(customer != null){
            em.remove(customer);
        }
    }

//    @Override
//    public Customer add(Customer customer) {
//        return null;
//    }
//
//    @Override
//    public List<Customer> save(List<Customer> customers) {
//        return null;
//    }
//
//    @Override
//    public boolean exists(Long id) {
//        return false;
//    }
//
//    @Override
//    public List<Customer> findAll(List<Long> ids) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//
//
//    @Override
//    public void delete(Customer customer) {
//
//    }
//
//    @Override
//    public void delete(List<Customer> customers) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }

//    private static SessionFactory sessionFactory;
//    private static EntityManager entityManager;
//    public static long id=0;
//    static {
//        try {
//             sessionFactory = new Configuration()
//                    .configure("hibernate.conf.xml")
//                    .buildSessionFactory();
//            sessionFactory.close();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        }
//    }
//
//    static {
//        try {
//            sessionFactory = new Configuration()
//                    .configure("hibernate.conf.xml")
//                    .buildSessionFactory();
//            entityManager = sessionFactory.createEntityManager();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public List<Customer> findAll() {
//        String queryStr = "SELECT c FROM Customer AS c";
//        TypedQuery<Customer> query = entityManager.createQuery(queryStr, Customer.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public Customer findOne(Long id) {
//         String queryStr = "SELECT c FROM Customer AS c WHERE c.id = :id";
//        TypedQuery<Customer> query = entityManager.createQuery(queryStr, Customer.class);
//        query.setParameter("id", id);
//        return query.getSingleResult();
//    }
//
//    @Override
//    public Customer save(Customer customer) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            Customer origin = findOne(customer.getId());
//            origin.setName(customer.getName());
//            origin.setEmail(customer.getEmail());
//            origin.setAddress(customer.getAddress());
//            session.saveOrUpdate(origin);
//            transaction.commit();
//            return origin;
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return null;
//    }
//    @Override
//    public Customer add(Customer customer) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            session.saveOrUpdate(customer);
//            transaction.commit();
//            return customer;
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public List<Customer> save(List<Customer> customers) {
//        return null;
//    }
//
//    @Override
//    public boolean exists(Long id) {
//        return false;
//    }
//
//    @Override
//    public List<Customer> findAll(List<Long> ids) {
//        return Collections.emptyList();
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void delete(Long id) {
//    }
//
//    @Override
//    public void delete(Customer customer) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = sessionFactory.openSession();
//            transaction = session.beginTransaction();
//            session.delete(customer);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }
//
//    @Override
//    public void delete(List<Customer> customers) {
//    }
//
//    @Override
//    public void deleteAll() {
//    }
}