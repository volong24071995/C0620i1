import java.util.Scanner;

public class Areaday {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter month: ");
        int n=scanner.nextInt();
        switch (n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Month "+n+" has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Month "+n+" has 30 day");
                break;
            case 2:
                System.out.printf("Month "+n+" has 28 or 29 day");
                break;
        }
    }
}
