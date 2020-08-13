public class Card {
    private long moneyInCard =50000;
    private String account_name;
    private String[] history=new String[3];

    public String[] getHistory() {
        return history;
    }
    public Card() {
    }
    public Card( String account_name,long moneyInCard) {
        this.moneyInCard = moneyInCard;
        this.account_name = account_name;
    }

    public long getMoneyInCard() {
        return moneyInCard;
    }

    public void setMoneyInCard(long moneyInCard) {
        this.moneyInCard = moneyInCard;
    }

    public String getAccount_name() {
        return account_name;
    }

    public String[] transactionHistory(String[] history, String newhistory){
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
}
