import java.util.Scanner;

public class Screen {
    final double card_minimum_money=50000;
    public static  Card card =new Card("Nguyễn Văn Lâm",1200000);
    public static Atm atm=new Atm(card);

    public static void menu(){
        System.out.println("Ngan hang ABC kinh chao Quy khach: "+card.getAccount_name());
        System.out.println("Menu:");
        System.out.println("\t1.Nhan phim A de kiem tra tai khoan");
        System.out.println("\t2.Nhan phim D de nap tien");
        System.out.println("\t3.Nhan phim W de rut tien");
        System.out.println("\t4.Nhan phim H de xem lich su 3 lan rut tien");
        System.out.println("\t5.Nhan phim X de thoat");
    }
    public static void getMoneySendToCard(){
        long moneySendToCard;
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien:");
        moneySendToCard=check();
        atm.sendMoneyToCard(moneySendToCard);
        System.out.println("Giao dich thanh cong. Ban vua nap "+moneySendToCard+"thanh cong\n"
                +"So du tai khoan khach hang la: "+card.getMoneyInCard()+"vnd\n");
    }
    public static void getWithdrawalCard(){
        long moneyWithdrawal;
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        moneyWithdrawal=check();
        if(atm.withdrawal(moneyWithdrawal)){
            System.out.println("Giao dich thanh cong. Ban vua rut "+moneyWithdrawal+"thanh cong\n"
                    +"So du tai khoan khach hang la: "+card.getMoneyInCard()+"vnd\n");

        }else System.out.println("Giao dich khong thanh cong.\n"
                +"So du tai khoan khach hang la: "+card.getMoneyInCard()
                +"VND");
    }

    public static void transactionHistoryTK(){
        for (int i=2;i>=0;i--){
            if (card.getHistory()[0]==null) {
                System.out.println("chua co giao dich");
                break;
            }else if (card.getHistory()[i]==null){
                continue;
            }else System.out.println(card.getHistory()[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Card card=new Card("Nguyễn Văn Lâm",1200000);
        Atm atm=new Atm(card);
        int count_error=0;
        Screen.menu();
        String chose;
        while (true){
            System.out.println("Nhap lua chon cua ban:");
            chose=scanner.next().toUpperCase();
            switch (chose){
                case "A":
                    count_error=0;
                    atm.checkCard();
                    break;
                case "D":
                    count_error=0;
                    Screen.getMoneySendToCard();
                    break;
                case "W":
                    Screen.getWithdrawalCard();
                    break;
                case "H":
                    count_error=0;
                    Screen.transactionHistoryTK();
                    break;
                case "X":
                    atm.exit();
                default:
                    count_error++;
                    if(count_error==3){
                        System.out.println("Ban nhap sai qua nhieu");
                        System.exit(0);
                    }
            }
        }
    }

    //Ham validate
    public static long check() {
        Scanner sc = new Scanner(System.in);
        long n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextLong();
                check = true;
            } catch (Exception e) {
                System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
                sc.nextLine();
            }
        }
        return n;
    }
}
