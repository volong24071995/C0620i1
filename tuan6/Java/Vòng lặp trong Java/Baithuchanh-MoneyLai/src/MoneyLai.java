import java.util.Scanner;

public class MoneyLai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double monney;
        double rate;
        int month;
        System.out.printf("Enter money: ");
        monney=scanner.nextDouble();
        System.out.printf("Enter rate: ");
        rate=scanner.nextDouble();
        System.out.printf("Enter month: ");
        month= scanner.nextInt();
        double lai=0;
        for (int i=0;i<month;i++){
            lai+=monney*(rate/100)/12*month;
        }
        System.out.printf("Money lãi sau là "+lai);
    }
}
