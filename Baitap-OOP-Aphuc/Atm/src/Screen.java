import java.util.Scanner;

public class Screen {
    public static final String VUI_LONG_NHAP_SO_TIEN = "Vui long nhap so tien:";
    public static final String SO_DU_TAI_KHOAN_KHACH_HANG_LA = "So du tai khoan khach hang la: ";
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
        System.out.println(VUI_LONG_NHAP_SO_TIEN);
        moneySendToCard=check();
        atm.sendMoneyToCard(moneySendToCard);
        var money = card.getMoneyInCard();
        System.out.println("Giao dich thanh cong. Ban vua nap "+moneySendToCard+"thanh cong\n"
                +SO_DU_TAI_KHOAN_KHACH_HANG_LA + money +"vnd\n");
    }

    public static void getWithdrawalCard(){
        long moneyWithdrawal;
        System.out.println("Giao dich Rut tien:");
        System.out.println(VUI_LONG_NHAP_SO_TIEN);
        moneyWithdrawal=check();
        var money = card.getMoneyInCard();
        if(atm.withdrawal(moneyWithdrawal)){
            System.out.println("Giao dich thanh cong. Ban vua rut "+moneyWithdrawal+"thanh cong\n"
                    + SO_DU_TAI_KHOAN_KHACH_HANG_LA + money +"vnd\n");

        }else System.out.println("Giao dich khong thanh cong.\n"
                +SO_DU_TAI_KHOAN_KHACH_HANG_LA + money
                +"VND");
    }

    public static void updateHistoryTK(){
        boolean check=false;
        var histories = card.getHistories();
        for (int i = histories.length-1; i>=0; i--){
            if (histories[i]==null) {
                check=true;
                break;
            }else System.out.println(histories[i]);
        }
        if (!check){
            System.out.println("chua co giao dich");
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
                    Screen.updateHistoryTK();
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
