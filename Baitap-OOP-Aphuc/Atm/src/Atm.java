import java.util.Scanner;

public class Atm {
    private String newHistory;
    private Card card;
    Atm(){};
    Atm(Card card){
        this.card=card;
    }

    public Card getCard() {
        return card;
    }

    public void checkCard(){
        System.out.println("So du tai khoan khach hang la:"+getCard().getMoneyInCard()+" vnd");
    }

    public void sendMoneyToCard(long moneySendToCard){
        getCard().setMoneyInCard(getCard().getMoneyInCard()+moneySendToCard);
        newHistory="Nap tien: "+moneySendToCard;
        getCard().transactionHistory(getCard().getHistory(),newHistory);
    }
    public boolean withdrawal(long moneyWithdrawal){
        newHistory="Rut tien "+moneyWithdrawal;
        if(moneyWithdrawal >getCard().getMoneyInCard()-50000){
           return false;
        }else {
            getCard().setMoneyInCard(getCard().getMoneyInCard()-moneyWithdrawal);
            getCard().transactionHistory(getCard().getHistory(),newHistory);
           return true;
        }
    }

    public void exit(){
        System.out.println("Thoát khỏi chương trình");
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
    }
}
