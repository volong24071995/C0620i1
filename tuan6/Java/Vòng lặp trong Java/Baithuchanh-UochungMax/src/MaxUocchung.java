import java.util.Scanner;

public class MaxUocchung {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.printf("Enter số a: ");
        a = scanner.nextInt();
        System.out.printf("Enter số b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0&&b==0){
            System.out.printf("Hai số không có ước chung");
        }else if (a==0||b==0){
            int c=a+b;
            System.out.printf("Hai số có ước chung là: "+c);
        }
        else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.printf("Hai số có ước chung là: " + a);
        }
    }
}
