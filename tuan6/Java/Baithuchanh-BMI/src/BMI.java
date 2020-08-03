import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float weight;
        System.out.printf("Enter Weight: ");
        weight=scanner.nextFloat();
        float height;
        System.out.printf("Enter Height: ");
        height=scanner.nextFloat();
        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
