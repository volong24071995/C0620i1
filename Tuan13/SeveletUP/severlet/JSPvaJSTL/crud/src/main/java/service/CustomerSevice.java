package service;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerSevice {
    public static Map<Integer, Customer> lisCustomers=new HashMap<>();
    static int id=0;

    public void add(String name,String address,String email){
        Customer customer=new Customer();
        customer.setName(name);
        customer.setAddress(address);
        customer.setEmail(email);
        id=id+1;
        customer.setId(id);
        lisCustomers.put(id,customer);
    }

    public void delete(int id){
        lisCustomers.remove(id);
    }
    public boolean checkEmail(String email){
        for (Map.Entry<Integer, Customer> list:lisCustomers.entrySet()){
            if (list.getValue().getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public Customer findById(int id){
        return lisCustomers.get(id);
    }

    public void edit(String name,String address,String email, int index){
        Customer customer = lisCustomers.get(index);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setName(name);
    }


}
