import java.util.Scanner;

public class Screen {
    static Scanner sc=new Scanner(System.in);
    public static QLSP qlsp=new QLSP();

    public static void menu(){
        System.out.println("1.Them san pham");
        System.out.println("2.Hien thi san pham");
        System.out.println("3.Tim san pham");
        System.out.println("0.Thoat");
    }

    public static void addSp(){
        Sp sp=new Sp();
        System.out.println("Nhap ten san pham");
        sp.setName(sc.nextLine());
        System.out.println("Nhap nha san xuat san pham");
        sp.setNhaSX(sc.nextLine());
        System.out.println("Nhap gia san pham");
        sp.setPride(Long.parseLong(sc.nextLine()));
        System.out.println("Nhap mo ta khac ve san pham");
        sp.setMore(sc.nextLine());
        qlsp.addSp(sp);
    }

    public static void displaySp(){
        System.out.println(qlsp.display());
    }

    public static void search(){
        System.out.println("Nhap ten");
        String name=sc.nextLine();
        if(!qlsp.checkName(name)){
            System.out.println("khong tim thay");
        }
    }
    public static void main(String[] args) {
        menu();
        while (true){
            System.out.println("Nhap lua chon");
            String chose=sc.nextLine();
            switch (chose){
                case "1":
                    System.out.println("Them san pham");
                    addSp();
                    break;
                case "2":
                    System.out.println("Danh sach san pham la: ");
                    displaySp();
                    break;
                case "3":
                    System.out.println("Tim san pham:");
                    search();
                    break;
                case "0":
                    System.exit(0);
            }
        }
    }
}
