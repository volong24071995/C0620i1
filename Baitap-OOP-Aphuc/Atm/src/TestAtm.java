import java.util.Scanner;

public class TestAtm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Atm person=new Atm("Nguyễn Văn Lâm",1200000);
        System.out.println("Ngan hang ABC kinh chao Quy khach: "+person.getAccount_name());
        System.out.println("Menu:");
        System.out.println("\t1.Nhan phim A de kiem tra tai khoan");
        System.out.println("\t2.Nhan phim D de nap tien");
        System.out.println("\t3.Nhan phim W de rut tien");
        System.out.println("\t4.Nhan phim H de xem lich su 3 lan rut tien");
        System.out.println("\t5.Nhan phim X de thoat");

        int count_error=0;
        final double card_minimum_money=50000;
        double depositmoney;
        double withdrawalmonney;
        Giaodich[] giaodiches=new Giaodich[3];
        Giaodich newgiaodich;
        String chose;

        while (true){
            System.out.println("Nhap lua chon cua ban:");
            chose=scanner.next().toUpperCase();
            switch (chose){
                case "A":
                    count_error=0;
                    System.out.println("So du tai khoan khach hang la: "+person.getSurplus()+" vnd");
                    break;
                case "D":
                    count_error=0;
                    System.out.println("Giao dich Nap tien");
                    System.out.println("Vui long nhap so tien:");
                    depositmoney=check();
                    person.setSurplus(person.getSurplus()+depositmoney);
                    System.out.println("Giao dich thanh cong. Ban vua nap "+depositmoney+" thanh cong.");
                    System.out.println("So du tai khoan là: "+person.getSurplus()+" VND");
                    newgiaodich=new Giaodich("Nap tien",depositmoney);
                    newgiaodich.getHistory(giaodiches,newgiaodich);
                    break;
                case "W":
                    count_error=0;
                    System.out.println("Giao dich Rut tien:");
                    System.out.println("Vui long nhap so tien:");
                    withdrawalmonney=check();
                    while (withdrawalmonney>(person.getSurplus()-card_minimum_money)){
                        System.out.println("Giao dich khong thanh cong");
                        System.out.println("So du tai khoan khach hang la: "+person.getSurplus()+"Vnd.");
                        System.out.println("Ban khong the rut so tien hon so du tai khoan");
                        System.out.println("Vui long nhap lai so tien");
                        withdrawalmonney=check();
                    }
                    person.setSurplus(person.getSurplus()-withdrawalmonney);
                    System.out.println("Giao dich thanh cong. Ban vua rut "+withdrawalmonney+" thanh cong.");
                    System.out.println("So du tai khoan là: "+person.getSurplus());
                    newgiaodich=new Giaodich("Rut tien",withdrawalmonney);
                    newgiaodich.getHistory(giaodiches,newgiaodich);
                    break;
                case "H":
                    count_error=0;
                        for (int i=0;i<giaodiches.length;i++){
                            if (giaodiches[i]==null){
                                System.out.println("Chưa có");
                            }else System.out.println(giaodiches[i].getTengiaodich()+": "+giaodiches[i].getSotiengiaodich());
                        }
                    break;
                case "X":
                    System.out.println("Thoát khỏi chương trình");
                    System.out.println("Cam on ban da su dung dich vu ATM");
                    System.exit(0);
                default:
                    count_error++;
                    if(count_error==3){
                        System.out.println("Ban nhap sai qua nhieu");
                        System.exit(0);
                    }
            }
        }
    }
    public static double check() {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextDouble();
                check = true;
            } catch (Exception e) {
                System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
                sc.nextLine();
            }
        }
        return n;
    }
}
