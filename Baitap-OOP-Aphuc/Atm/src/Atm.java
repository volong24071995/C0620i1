public class Atm {
    private double surplus=50000;
    private String account_name;
    Atm(){};
    Atm(String account_name,double surplus){
        this.account_name=account_name;
        this.surplus=surplus;
    }

    public double getSurplus() {
        return surplus;
    }

    public void setSurplus(double surplus) {
        this.surplus = surplus;
    }

    public String getAccount_name() {
        return account_name;
    }
}
