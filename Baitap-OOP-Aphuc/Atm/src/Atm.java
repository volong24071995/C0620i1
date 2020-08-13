import java.util.Scanner;

public class Atm {
    private long moneyInCard =50000;
    private String account_name;
    private String[] history=new String[3];
    private String newHistory;
    Atm(){};
    Atm(String account_name, long moneyInCard){
        this.account_name=account_name;
        this.moneyInCard =moneyInCard;
    }

    public long getMoneyInCard() {
        return moneyInCard;
    }

    public long setMoneyInCard(long moneyInCard) {
        this.moneyInCard = moneyInCard;
        return moneyInCard;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void checkCard(){
        System.out.println("So du tai khoan khach hang la:"+this.getMoneyInCard()+" vnd");
    }

    public void sendMoneyToCard(){
        long moneySendToCard;
        System.out.println("Giao dich Nap tien");
        System.out.println("Vui long nhap so tien:");
        moneySendToCard=check();
        this.setMoneyInCard(this.getMoneyInCard()+moneySendToCard);
        newHistory="Nap tien: "+moneySendToCard;
        getHistory(history,newHistory);
        System.out.println("Giao dich thanh cong.Ban vua nap "+moneySendToCard+" thanh cong.\n"
                + "So du tai khoan khach hang la: " +this.getMoneyInCard()
                +"vnd");
    }
    public void withdrawal(){
        long moneyWithdrawal;
        System.out.println("Giao dich Rut tien:");
        System.out.println("Vui long nhap so tien:");
        moneyWithdrawal=check();
        newHistory="Rut tien "+moneyWithdrawal;
        if(moneyWithdrawal >this.getMoneyInCard()-50000){
            System.out.println("Giao dich khong thanh cong.\n"
                    +"So du tai khoan khach hang la: "+this.getMoneyInCard()
                    +"VND");
        }else {
            this.setMoneyInCard(this.getMoneyInCard()-moneyWithdrawal);
            getHistory(history,newHistory);
            System.out.println("Giao dich thanh cong. Ban vua rut "+moneyWithdrawal+"thanh cong\n"
                    +"So du tai khoan khach hang la: "+this.getMoneyInCard()+"vnd\n");
        }
    }

    public void transactionHistory(){
        for (int i=2;i>=0;i--){
            System.out.println(history[i]);
        }
    }
    public void exit(){
        System.out.println("Thoát khỏi chương trình");
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
    }

    public String[] getHistory(String[] history, String newhistory){
        if(history[history.length-1]!=null){
            for (int i=0;i<history.length-1;i++){
                history[i]=history[i+1];
            }
            history[history.length-1]=newhistory;
        }else {
            for (int i=0;i<history.length;i++){
                if (history[i]==null){
                    history[i]=newhistory;
                    break;
                }
            }
        }
        return history;
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
