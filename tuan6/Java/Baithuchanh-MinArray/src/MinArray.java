import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter size array: ");
        int size=scanner.nextInt();
        while (size>20){
            size=scanner.nextInt();
        }
        int[] array=new int[size];
        System.out.println("Mảng array is: ");
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100-50);
            System.out.printf(array[i]+", ");
        }
        int min =valuemin(array);
        System.out.println("");
        System.out.println("Value array min is: "+min);
        }
        public static int valuemin(int a[]){
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
}
