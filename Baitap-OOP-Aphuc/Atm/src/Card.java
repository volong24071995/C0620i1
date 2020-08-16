public class Card {
    private long moneyInCard = 50000;
    private String account_name;
    private String[] histories = new String[3];

    public String[] getHistories() {
        return histories;
    }

    public Card() {
    }

    public Card(String account_name, long moneyInCard) {
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

    public void transactionHistory(String newhistory) {
        var length = histories.length;
        for (int i = 0; i < length - 1; i++) {
            histories[i] = histories[i + 1];
        }
        histories[length - 1] = newhistory;
    }
}
