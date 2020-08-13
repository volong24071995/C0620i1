import java.util.Scanner;

public class Screen {
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
        String chose;
        while (true){
            System.out.println("Nhap lua chon cua ban:");
            chose=scanner.next().toUpperCase();
            switch (chose){
                case "A":
                    count_error=0;
                    person.checkCard();
                    break;
                case "D":
                    count_error=0;
                    person.sendMoneyToCard();
                    break;
                case "W":
                    person.withdrawal();
                    break;
                case "H":
                    count_error=0;
                    person.transactionHistory();
                    break;
                case "X":
                   person.exit();
                default:
                    count_error++;
                    if(count_error==3){
                        System.out.println("Ban nhap sai qua nhieu");
                        System.exit(0);
                    }
            }
        }
    }

}
