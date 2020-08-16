public class Atm {
    private String newHistory;
    private Card card;
    Atm(){};

    Atm(Card card){
        this.card=card;
    }

    public Card getcard() {
        return card;
    }

    public void checkCard(){
        System.out.println("So du tai khoan khach hang la:"+card.getMoneyInCard()+" vnd");
    }

    public void sendMoneyToCard(long amount){
        long moneyInCard = getcard().getMoneyInCard();
        card.setMoneyInCard(moneyInCard +amount);
        newHistory="Nap tien: "+amount;
        card.transactionHistory(newHistory);
    }

    public boolean withdrawal(long moneyWithdrawal){
        newHistory="Rut tien "+moneyWithdrawal;
        var money = card.getMoneyInCard();
        if(moneyWithdrawal > money -50000){
           return false;
        }else {
            card.setMoneyInCard(money-moneyWithdrawal);
            card.transactionHistory(newHistory);
           return true;
        }
    }

    public void exit(){
        System.out.println("Thoát khỏi chương trình");
        System.out.println("Cam on ban da su dung dich vu ATM");
        System.exit(0);
    }
}
