import java.util.ArrayList;
import java.util.Scanner;

public class TestKhachHang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("Bấm 1 để nhập khách hang");
        System.out.println("Bấm 2 để tim kiem khach hang");
        System.out.println("Bam 3 để in thong khach hang");
        System.out.println("Bam 4 để in toan bo danh sach khach hang");
        System.out.println("Bam 5 để tang so don hang cho khach");
        System.out.println("Bam 0 để thoat");
        String name,address,email,phoneNumber;
        boolean gender;
        int toltaloder,chose;
        ArrayList<CustomerManagement> informationKhachHangs = new ArrayList<CustomerManagement>();
        boolean check = false;
        while (true){
            System.out.println("Lua chon:");
            chose=scanner.nextInt();
            switch (chose) {
                case 1:
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
                    System.out.println("Tong don cua khach hang:");
                    toltaloder = scanner.nextInt();
                    CustomerManagement newInformation = new CustomerManagement(name, address, phoneNumber, email, gender, toltaloder);
                    informationKhachHangs.add(newInformation);
                    break;
                case 4:
                    for (int i=0;i<informationKhachHangs.size();i++){
                        System.out.println(informationKhachHangs.get(i).getName());
                    }
            }
        }


    }
}
