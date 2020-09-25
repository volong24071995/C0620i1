package severice;

import entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class ListCustomerService {
    public static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer customer1=new Customer("Long","24/7/1995","Hue","anh1.jpg");
        Customer customer2=new Customer("Hiep","12/4/1994","Dang Nag","anh2.jpg");
        Customer customer3=new Customer("Phuc","6/9/1995","Sai Gon","anh3.jpg");
        Customer customer4=new Customer("Huong","4/6/1989","Hue","anh4.jpg");
        Customer customer5=new Customer("Tin","7/9/1995","Sai Gon","anh5.jpg");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer3);
    }

}
