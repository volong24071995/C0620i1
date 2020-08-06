import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double c,f;
        int choise;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.printf("Enter độ F: ");
                    f=scanner.nextDouble();
                    System.out.println("Swap độ F sang C is: "+fahrenheitToCelsius(f));
                    break;
                case 2:
                    System.out.printf("Enter độ C: ");
                    c=scanner.nextDouble();
                    System.out.println("Swap độ C sang F is: "+celsiusToFahrenheit(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choise != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

