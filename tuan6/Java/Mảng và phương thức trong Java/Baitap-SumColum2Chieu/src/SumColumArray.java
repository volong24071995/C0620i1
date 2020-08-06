import java.util.Scanner;

public class SumColumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài mảng");
        int size = scanner.nextInt();
        int length;
        int[][] array = new int[size][];
        for (int i = 0; i < size; i++) {
            System.out.println("Độ dài phần tử mảng " + i + ": ");
            array[i] = new int[scanner.nextInt()];
        }

        for (int i = 0; i < size; i++) {
            System.out.println("phan tu mang " + i + ": ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter colum cần tính sum: ");
        int colum=scanner.nextInt();
        int sumcols=sumcols(array,colum);
        System.out.println(sumcols);
    }
    public static int sumcols(int a[][],int j){
        int sumcolsj=0;
        for (int i=0;i<a.length;i++){
            sumcolsj+=a[i][j];
        }
        return  sumcolsj;
    }
}
