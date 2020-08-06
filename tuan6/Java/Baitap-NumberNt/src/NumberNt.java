import java.util.Scanner;

public class NumberNt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter số lượng số nguyên tố: ");
        int number = scanner.nextInt();
        int dem = 0;
        int i = 2;
        while (dem < number) {
            int dem1 = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem1++;
                }
            }
            if (dem1 == 2) {
                dem++;
                System.out.printf(i + ", ");
                i++;
            }
            else i++;
        }
    }
}
