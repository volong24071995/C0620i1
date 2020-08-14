import java.util.Scanner;
import java.util.ArrayList;
public class CustomerManagement {
    private ArrayList<Customer> listOfCustomers = new ArrayList<Customer>();

//tim theo customer
    public boolean checkInformation(Customer customer){
        boolean check=false;
        for (int i=0;i<listOfCustomers.size();i++){
            if (customer.getEmail().equals(listOfCustomers.get(i).getEmail()) && customer.getPhoneNumber().equals(listOfCustomers.get(i).getPhoneNumber())){
                check= true;
                break;
            }
        }
        return check;
    }

    public boolean addCustomer(String name,String address,String email,String phoneNumber,boolean gender,int totalOder){
        Customer customer=new Customer(name,address,email,phoneNumber,gender);
        if (checkInformation(customer)){
            System.out.println("Khach hang da ton tai.He thong vua update thong tin");
            return false;
        }else  {
            listOfCustomers.add(customer);
            System.out.println("Ban vua them moi khach hang "+customer.getName()+" thanh cong ");
            return true;
        }
    }

    public boolean searchPhone(String phoneNumber) {
        boolean check=false;
        for (int i = 0; i < listOfCustomers.size(); i++) {
            if (phoneNumber.equals(listOfCustomers.get(i).getPhoneNumber())) {
                check=true;
                break;
            }else check =false;
        }
        return check;
    }
//    tim theo sdt ko odder
    public void search(String phoneNumber) {
        if (searchPhone(phoneNumber)){
            for (int i = 0; i < listOfCustomers.size(); i++) {
                if (phoneNumber.equals(listOfCustomers.get(i).getPhoneNumber())) {
                    System.out.println(listOfCustomers.get(i).toString());
                    break;
                }
            }
        }else System.out.println("khong co khach hang");

    }
//        tim theo sdt co odder
    public void searchHasOdder(String phoneNumber){
        if (searchPhone(phoneNumber)){
            for (int i = 0; i < listOfCustomers.size(); i++) {
                if (phoneNumber.equals(listOfCustomers.get(i).getPhoneNumber())) {
                    System.out.println(listOfCustomers.get(i).toString()+" tong don hang "+listOfCustomers.get(i).getTotalOder());
                    break;
                }
            }
        }else System.out.println("khong co khach hang");
    }

    public void allDisplay(){
        for (int i=0;i<listOfCustomers.size();i++){
            System.out.println(listOfCustomers.get(i).toString());
        }
        System.out.println("Tong khach hang la "+listOfCustomers.size());
    }

    public void addOrder(String phoneNumber) {
        if (searchPhone(phoneNumber)){
            for (int i = 0; i < listOfCustomers.size(); i++) {
                if (phoneNumber.equals(listOfCustomers.get(i).getPhoneNumber())) {
                    listOfCustomers.get(i).setTotalOder(listOfCustomers.get(i).getTotalOder() + 1);
                    System.out.println(listOfCustomers.get(i).toString()+" tong don hang "+listOfCustomers.get(i).getTotalOder());
                }
            }
        }else System.out.println("khong co khach hang");
    }
    public void exit(){
        System.out.println("He thong Quan ly khach hang vua shutdown.");
        System.exit(0);
    }
}
