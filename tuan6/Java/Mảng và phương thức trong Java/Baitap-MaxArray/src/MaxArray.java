import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Độ dài mảng");
        int size=scanner.nextInt();
        int length;
        int[][] array = new int[size][];
        for (int i=0;i<size;i++){
            System.out.println("Độ dài phần tử mảng "+i+": ");
            array[i]=new int[scanner.nextInt()];
        }

        for (int i=0;i<size;i++){
            System.out.println("phan tu mang "+i+": ");
            for (int j=0;j<array[i].length;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        int maxmum=max(array[0]);
        for (int i=0;i<size;i++){
            if(maxmum<max(array[i])){
                maxmum=max(array[i]);
            }
        }
        System.out.println("Giá trị lớn nhất là: "+maxmum);
    }
    public static int max(int a[]){
        int max=a[0];
        for (int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
