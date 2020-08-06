import java.util.Scanner;

public class Array {
//    Viết chương trình cho phép tạo ra một ma trận 2 chiều (vuông) có
//    kích cỡ n x n được nhập vào từ bàn phím,
//    gồm các giá trị số nguyên được sinh ngẫu nhiên từ 10 đến 90.
//  1. Tính tổng các số chẵn trong ma trận
//  2. Tính tổng các giá trị trên đường chéo chính
//  3. Tính tổng các giá trị trên đường chéo phụ
//  4. Tính tổng các giá trị trên đường biên
//  5. Hiển thị ma trận
//  6. Hiển trị ma trận tam giác dưới
//  7. Hiển thị ma trân tam giác trên

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter canh n am tran: ");
        String n = scanner.nextLine();
        while (!isNumeric(n)) {
            System.out.printf("Enter canh n am tran: ");
            n = scanner.nextLine();
        }
        int x = Integer.parseInt(n);
        System.out.println(x);
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                arr[i][j] = (int) (Math.random() * 80 + 10);
                System.out.printf(arr[i][j]+", ");
            }
        }
        System.out.println();
        System.out.println("Menu");
        System.out.println("1.Tính tổng các số chẵn trong ma trận");
        System.out.println("2. Tính tổng các giá trị trên đường chéo chính");
        System.out.println("3. Tính tổng các giá trị trên đường chéo phụ");
        System.out.println("4. Tính tổng các giá trị trên đường biên");
        System.out.println("5. Hiển thị ma trận");
        System.out.println("6. Hiển trị ma trận tam giác dưới");
        System.out.println("7. Hiển thị ma trân tam giác trên");
        System.out.println("0. Exit");
        System.out.println("Enter choise: ");
        while (true) {
            int enter = scanner.nextInt();
            //                    in thieu khuc
            switch (enter) {
                case 1 -> {
                    System.out.println("1.Tính tổng các số chẵn trong ma trận");
                    double sumchan = 0;
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < x; j++) {
                            if (arr[i][j] % 2 == 0) {
                                sumchan += arr[i][j];
                            }
                        }
                    }
                    System.out.println("Sum các số chẵn trong ma trận" + sumchan);
                }
                case 2 -> {
                    System.out.println("2. Tính tổng các giá trị trên đường chéo chính");
                    double sumcheochinh = 0;
                    for (int i = 0; i < x; i++) {
                        sumcheochinh += arr[i][i];
                    }
                    System.out.println("Sum đường chéo chính" + sumcheochinh);
                }
                case 3 -> {
                    System.out.println("3. Tính tổng các giá trị trên đường chéo phụ");
                    double sumcheophu = 0;
                    for (int i = 0; i < x; i++) {
                        sumcheophu += arr[i][x - 1 - i];
                    }
                    System.out.println("Tính tổng các giá trị trên đường chéo phụ " + sumcheophu);
                }
                case 4 -> {
                    System.out.println("4. Tính tổng các giá trị trên đường biên");
                    double sumbien = 0;
                    for (int i = 0; i < x; i++) {
                        if (i == 0 || i == x - 1) {
                            for (int j = 0; j < x; j++) {
                                sumbien += arr[i][j];
                            }
                        } else sumbien = sumbien + arr[i][0] + arr[i][x - 1];
                    }
                    System.out.println("Tổng các giá trị trên đường biên " + sumbien);
                }
                case 5 -> {
                    System.out.println("5. Hiển thị ma trận");
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j < x; j++) {
                            System.out.printf(arr[i][j] + ", ");
                        }
                        System.out.println();
                    }
                }
                case 6 -> {
                    System.out.println("6. Hiển trị ma trận tam giác dưới");
                    for (int i = 0; i < x; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
                case 7 -> {
                    System.out.println("7. Hiển thị ma trân tam giác trên");
                    for (int i = 0; i < x; i++) {
                        for (int k = 0; k < i; k++) {
                            System.out.printf("   ");
                        }
                        for (int j = i; j < x; j++) {
                            System.out.printf(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                }
                case 0 -> System.exit(0);
                default -> System.out.println("chon lai");
            }
        }
    }
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
