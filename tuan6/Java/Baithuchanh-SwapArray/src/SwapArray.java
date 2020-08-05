import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter array length: ");
        int size=scanner.nextInt();
        while (size>20){
            size=scanner.nextInt();
        }
        int[] array=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.printf("Array"+i+" is: ");
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println("Array reverse is: ");
        for(int i=0;i<array.length;i++){
            System.out.printf(array[i]+", ");
        }
    }
}
