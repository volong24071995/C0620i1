package dao;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementCustomersDAO implements IManagementDAO<Customer>{
    private static Map<Integer,Customer> list=new HashMap<>();
    private static int autoId=0;
    static {
        list.put(1,new Customer(1, "T", "t@codegym.vn", "Da Nang"));
        list.put(2,new Customer(2, "Nhat", "nhat@codegym.vn", "Quang Tri"));
        list.put(3, new Customer(3, "Trang", "trang@codegym.vn", "Ha Noi"));
    }


    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Customer customer) {
        list.put(customer.getId(),customer);
    }

    @Override
    public void deleteById(int id) {
        list.remove(id);
    }

    @Override
    public void update(Customer customer) {
        list.put(customer.getId(),customer);
    }

    @Override
    public Customer findOne(int id) {
        return list.get(id);
    }
}
