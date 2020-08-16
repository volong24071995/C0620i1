import java.util.ArrayList;

public class CustomerManagement {
    private ArrayList<Customer> listOfCustomers = new ArrayList<>();

    //tim theo customer
    public boolean checkInformation(Customer customer) {
        boolean check = false;
        for (Customer listOfCustomer : listOfCustomers) {
            if (customer.getEmail().equals(listOfCustomer.getEmail()) && customer.getPhoneNumber().equals(listOfCustomer.getPhoneNumber())) {
                check = true;
                break;
            }
        }
        return check;
    }

    public boolean addCustomer(Customer customer) {
        if (checkInformation(customer)) {
            System.out.println("Khach hang da ton tai.He thong vua update thong tin");
            return false;
        } else {
            listOfCustomers.add(customer);
            System.out.println("Ban vua them moi khach hang " + customer.getName() + " thanh cong ");
            return true;
        }
    }

    public boolean checkPhone(String phoneNumber) {
        for (Customer listOfCustomer : listOfCustomers) {
            if (phoneNumber.equals(listOfCustomer.getPhoneNumber())) {
                System.out.printf(listOfCustomer.toString());
                return true;
            }
        }
        return false;
    }

    public void searchHasOdder(String phoneNumber) {
        if (checkPhone(phoneNumber)) {
            for (Customer listOfCustomer : listOfCustomers) {
                if (phoneNumber.equals(listOfCustomer.getPhoneNumber())) {
                    System.out.printf(" tong don hang " + listOfCustomer.getTotalOder());
                    break;
                }
            }
        } else System.out.println("khong co khach hang");
    }

    public void allDisplay() {
        for (Customer listOfCustomer : listOfCustomers) {
            System.out.println(listOfCustomer.toString());
        }
        System.out.println("Tong khach hang la " + listOfCustomers.size());
    }

    public void addOrder(String phoneNumber) {
        if (checkPhone(phoneNumber)) {
            for (Customer listOfCustomer : listOfCustomers) {
                if (phoneNumber.equals(listOfCustomer.getPhoneNumber())) {
                    listOfCustomer.setTotalOder(listOfCustomer.getTotalOder() + 1);
                    System.out.printf(" tong don hang " + listOfCustomer.getTotalOder());
                }
            }
        } else System.out.println("khong co khach hang");
    }

    public void exit() {
        System.out.println("He thong Quan ly khach hang vua shutdown.");
        System.exit(0);
    }
}
