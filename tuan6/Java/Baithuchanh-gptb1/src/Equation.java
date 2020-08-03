import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        float a;
        float b;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a: ");
        a=scanner.nextFloat();
        System.out.printf("Enter b: ");
        b=scanner.nextFloat();
        if(a==0){
            if (b==0) {
                System.out.printf("Phương trình có vô số nghiệm");
            }
            else System.out.printf("Phương trình có vô nghiệm");
        }else System.out.printf("Phương trình có nghiệm x = "+(-b/a));
    }
}
