import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        System.out.printf("Hi Long! My name is ");
        name=scanner.nextLine();
        System.out.printf("Hello "+name+". Nice to miss you!");
    }
}
