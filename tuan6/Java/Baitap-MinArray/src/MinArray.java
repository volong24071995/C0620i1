import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter phân tử: " + i);
            array[i] = scanner.nextInt();
        }
        int min1 = array[0];
        int min2;
        for (int i = 0; i < size; i++) {
            if (min1 != array[i]) {
                min2 = array[i];
                for (int j = 0; j < size; j++) {
                    if (min1 > array[j]) {
                        min1 = array[j];
                    }
                    if (min2 > array[j]) {
                        if (array[j] != min1) {
                            min2 = array[j];
                        }
                    }
                }
                System.out.println(min1 + " is nhỏ nhất");
                System.out.println(min2 + " is nhỏ hai");
                break;
            }
            if (i == size - 1) {
                System.out.println("Chỉ có 1 min1 " + min1);
            }
        }
    }
}
