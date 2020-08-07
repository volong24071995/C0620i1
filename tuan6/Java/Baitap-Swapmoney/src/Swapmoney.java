import java.util.Scanner;

public class Swapmoney {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double rate=23000;
        double usd;
        System.out.printf("Enter số tiền: ");
        usd=scanner.nextDouble();
        double vnd=usd*rate;
        System.out.printf(usd+"quy đổi ra được: "+vnd);
    }
}
