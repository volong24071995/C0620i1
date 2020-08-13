import java.util.Scanner;

public class Atm {
    private String newHistory;
    private Card card;
    Atm(){};
    Atm(Card card){
        this.card=card;
    }

    public void checkCard(){
        System.out.println("So du tai khoan khach hang la:"+card.getMoneyInCard()+" vnd");
    }

    public void sendMoneyToCard(){
        long moneySendToCard;
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien:");
        moneySendToCard=check();
        card.setMoneyInCard(card.getMoneyInCard()+moneySendToCard);
        newHistory="Nap tien: "+moneySendToCard;
        card.transactionHistory(card.getHistory(),newHistory);

    }
    public void withdrawal(){
        long moneyWithdrawal;
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        moneyWithdrawal=check();
        newHistory="Rut tien "+moneyWithdrawal;
        if(moneyWithdrawal >card.getMoneyInCard()-50000){
            System.out.println("Giao dich khong thanh cong.\n"
                    +"So du tai khoan khach hang la: "+card.getMoneyInCard()
                    +"VND");
        }else {
            card.setMoneyInCard(card.getMoneyInCard()-moneyWithdrawal);
            card.transactionHistory(card.getHistory(),newHistory);
            System.out.println("Giao dich thanh cong. Ban vua rut "+moneyWithdrawal+"thanh cong\n"
                    +"So du tai khoan khach hang la: "+card.getMoneyInCard()+"vnd\n");
        }
    }

    public void transactionHistoryTK(){
        for (int i=2;i>=0;i--){
            if (card.getHistory()[i]==null)continue;
            System.out.println(card.getHistory()[i]);
        }
    }
    public void exit(){
        System.out.println("Thoát khỏi chương trình");
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
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
