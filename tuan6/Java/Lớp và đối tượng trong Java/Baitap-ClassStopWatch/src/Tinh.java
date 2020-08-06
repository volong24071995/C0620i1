import java.util.Scanner;

public class Tinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a,b,c la tham so cua phuong trinh ax^2+bX+c=0: ");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
//validate???
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.printf("Nghiem 1 la: %.6f",quadraticEquation.getRoot1());
            System.out.println();
            System.out.printf("Nghiem 1 la: %.6f",quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.printf("Phuong trinh co 1 nghiem la:%.6f",quadraticEquation.getRoot1());
        }else System.out.println( "The equation has no roots");
    }
}
