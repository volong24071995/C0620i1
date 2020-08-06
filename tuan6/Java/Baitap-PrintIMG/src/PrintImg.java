import java.util.Scanner;

public class PrintImg {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("    1.Print the square triangle-top-left");
        System.out.println("    2.Print the square triangle-top-right");
        System.out.println("    3.Print the square triangle-botton-left");
        System.out.println("    4.Print the square triangle-botton-right");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
        while (true){
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw the square");
                    for (int i=0;i<3;i++){
                        for (int j=0;j<7;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Enter your choice triangle:");
                    int choicertriangle=scanner.nextInt();
                    switch (choicertriangle){
                        case 1:
                            System.out.println("Print the square triangle-top-left");
                            for (int i=4;i>=0;i--){
                                for(int j=0;j<=i;j++){
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            System.out.println("Print the square triangle-top-right");
                            for (int i=0;i<5;i++){
                                for (int j=1;j<=i;j++){
                                    System.out.print(" ");
                                }
                                for (int k=4;k>=i;k--) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            System.out.println("Print the square triangle-botton-left");
                            for (int i=0;i<5;i++){
                                for (int j=0;j<=i;j++){
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            System.out.println("Print the square triangle-botton-right");
                            for (int i=0;i<5;i++){
                                for (int k=3;k>=i;k--) {
                                    System.out.print(" ");
                                }
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i=1;i<5;i++){
                        for (int j=1;j<5-i;j++){
                            System.out.printf(" ");
                        }
                        for (int k=1;k<=2*i-1;k++){
                            System.out.printf("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
