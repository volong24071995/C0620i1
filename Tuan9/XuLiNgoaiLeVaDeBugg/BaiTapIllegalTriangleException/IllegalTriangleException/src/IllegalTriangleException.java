import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap canh a");
            int a = sc.nextInt();
            System.out.println("Nhap canh b");
            int b = sc.nextInt();
            System.out.println("Nhap canh c");
            int c = sc.nextInt();
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new ArithmeticException("Do dai canh phai lon hon 0: "+a+" "+" "+b+" "+c);
            }
            if (a + b <= c || a + c <= b || c + b <= a) {
                throw new ArithmeticException("Khong phai tam giac");
            }
        } catch (Exception ex) {
            System.out.println("xay ra ngoai le: "+ex.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

