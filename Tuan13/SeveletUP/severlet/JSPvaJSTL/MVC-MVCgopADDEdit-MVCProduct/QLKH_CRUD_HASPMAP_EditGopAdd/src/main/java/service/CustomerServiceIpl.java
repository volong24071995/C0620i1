package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceIpl implements CustomerService {

    private static Map<Integer, Customer> listCustomers;
    static int id=6;

    static {
        listCustomers = new HashMap<>();
        listCustomers.put(1, new Customer(1, "John", "Hanoi","john@codegym.vn"));
        listCustomers.put(2, new Customer(2, "Bill", "Danang", "bill@codegym.vn"));
        listCustomers.put(3, new Customer(3, "Alex", "Saigon", "alex@codegym.vn"));
        listCustomers.put(4, new Customer(4, "Adam", "Beijin", "adam@codegym.vn"));
        listCustomers.put(5, new Customer(5, "Sophia", "Miami", "sophia@codegym.vn"));
        listCustomers.put(6, new Customer(6, "Rose", "Newyork", "rose@codegym.vn"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(listCustomers.values());
    }

    @Override
    public void save(Customer customer) {
        id=id+1;
        customer.setId(id);
        listCustomers.put(id, customer);
    }

    @Override
    public Customer findById(int id) {
        return listCustomers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        listCustomers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        listCustomers.remove(id);
    }

    public boolean checkEmail(String email){
        ArrayList<Customer> list=new ArrayList<>(listCustomers.values());
        for (Customer customer : list) {
            if (customer.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
}
