import java.util.Scanner;

public class SntBe100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Số nguyên tố bé hơn 100: ");
        int i = 2;
        while (i < 100) {
            int dem1 = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem1++;
                }
            }
            if (dem1 == 2){
                System.out.printf(i + ", ");
                i++;
            }
            else i++;
        }
    }
}

