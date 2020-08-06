import java.util.Scanner;

public class SumcheoArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=scanner.nextInt();
        while (size>20||size<0){
                System.out.println("Enter size again: ");
                size=scanner.nextInt();
        }
        int[][] array=new int[size][size];
        for (int i=0;i<size;i++){
            System.out.println("Enter value "+i+":");
            for (int j=0;j<size;j++){
//                Nhap tay:
//                array[i][j]=scanner.nextInt();
                array[i][j]=(int)(Math.random()*10);
                System.out.printf(array[i][j]+", ");
            }
            System.out.println();
        }
        int sumcheo=0;
        for (int i=0;i<size;i++){
            sumcheo+=array[i][i];
        }
        System.out.println("Tổng đường chéo là: "+sumcheo);
    }
}
