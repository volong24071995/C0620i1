import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Shape shape=new Shape("red",false);
        System.out.println(shape.toString());
        double a,b,c;
        System.out.println("Enter canh a:");
        a=scanner.nextDouble();
        System.out.println("Enter canh b:");
        b=scanner.nextDouble();
        System.out.println("Enter canh c:");
        c=scanner.nextDouble();
        while (a+b<c||b+c<a||a+c<b){
            System.out.println("Enter canh a:");
            a=scanner.nextDouble();
            System.out.println("Enter canh b:");
            b=scanner.nextDouble();
            System.out.println("Enter canh c:");
            c=scanner.nextDouble();
        }
        System.out.println("Enter color Triangle:");
        String color=scanner.next();
        System.out.println("Enter filled Triangle:");
        boolean filled=scanner.nextBoolean();
        Triangle triangle=new Triangle(a,b,c,color,filled);
        System.out.println(triangle.toString());
    }
}
