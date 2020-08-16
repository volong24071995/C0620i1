import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    static Scanner scanner=new Scanner(System.in);
    private static CustomerManagement customerManagement=new CustomerManagement();

    public static void menu(){
        System.out.println("Menu");
        System.out.println("Bấm 1 để nhập khách hang");
        System.out.println("Bấm 2 để tim kiem khach hang");
        System.out.println("Bam 3 để in thong khach hang");
        System.out.println("Bam 4 để in toan bo danh sach khach hang");
        System.out.println("Bam 5 để tang so don hang cho khach");
        System.out.println("Bam 0 để thoat");
    }
    public static void addNewCustomer(){
        Customer customer=new Customer();
        System.out.println("Nhập tên:");
        customer.setName(scanner.nextLine());
        System.out.println("Nhập dia chi:");
        customer.setAddress(scanner.nextLine());
        System.out.println("Nhap email:");
        customer.setEmail(scanner.nextLine());
        System.out.println("Nhap sdt:");
        customer.setPhoneNumber(scanner.nextLine());
        System.out.println("Nhap gioi tinh:");
        customer.setGender(Boolean.parseBoolean(scanner.nextLine()));
        customerManagement.addCustomer(customer);
    }
//    Search sdt ko co odder
    public static void searchCustomer(){
        System.out.println("Nhap sdt khach hang:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Hẹ thong dang tim kiem");
        System.out.println("Ket qua:");
        if ( !customerManagement.checkPhone(phoneNumber)){
            System.out.println("khong co khach hang");
        }

    }
//    Search sdt co odder
    public static void searchCustomerHasOder(){
    System.out.println("Nhap sdt khach hang:");
    String phoneNumber = scanner.nextLine();
    customerManagement.searchHasOdder(phoneNumber);
}

// Display all
    public static void displayAll(){
    customerManagement.allDisplay();
    }
// them odder
    public static void addOdder(){
        System.out.println("Nhap sdt khach hang:");
        String phoneNumber = scanner.nextLine();
        customerManagement.addOrder(phoneNumber);
    }
    public static void main(String[] args) {
        Screen.menu();
        String chose;
        while (true){
            System.out.println();
            System.out.println("Lua chon:");
            chose=scanner.nextLine();
            switch (chose) {
                case "1":
                    Screen.addNewCustomer();
                    break;
                case "2":
                    Screen.searchCustomer();
                    break;
                case "3":
                    Screen.searchCustomerHasOder();
                    break;
                case "4":
                    Screen.displayAll();
                    break;
                case "5":
                    Screen.addOdder();
                    break;
                case "0":
                    customerManagement.exit();
                default:
                    chose=scanner.nextLine();
            }
        }
    }
}
