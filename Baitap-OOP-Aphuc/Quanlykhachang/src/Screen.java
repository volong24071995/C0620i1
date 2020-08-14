import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    static Scanner scanner=new Scanner(System.in);
    private static String name,address,email,phoneNumber;
    private static boolean gender;
    private static int totalOder;
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
        System.out.println("Nhập tên:");
        name = scanner.next();
        System.out.println("Nhập dia chi:");
         address = scanner.next();
        System.out.println("Nhap email:");
         email = scanner.next();
        System.out.println("Nhap sdt:");
         phoneNumber = scanner.next();
        System.out.println("Nhap gioi tinh:");
         gender = scanner.nextBoolean();
        customerManagement.addCustomer(name,address,email,phoneNumber,gender,totalOder);
    }
//    Search sdt ko co odder
    public static void searchCustomer(){
        System.out.println("Nhap sdt khach hang:");
        phoneNumber = scanner.next();
        System.out.println("Hẹ thong dang tim kiem");
        System.out.println("Ket qua:");
        customerManagement.search(phoneNumber);
    }
//    Search sdt co odder
    public static void searchCustomerHasOder(){
    System.out.println("Nhap sdt khach hang:");
    phoneNumber = scanner.next();
    customerManagement.searchHasOdder(phoneNumber);
}

// Display all
    public static void displayAll(){
    customerManagement.allDisplay();
    }
// them odder
    public static void addOdder(){
        System.out.println("Nhap sdt khach hang:");
        phoneNumber = scanner.next();
        customerManagement.addOrder(phoneNumber);
    }
    public static void main(String[] args) {
        Screen.menu();
        String chose;
        while (true){
            System.out.println("Lua chon:");
            chose=scanner.next();
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
                    chose=scanner.next();
            }
        }
    }
}
