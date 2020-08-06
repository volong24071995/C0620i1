import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter array length: ");
        int size=scanner.nextInt();
        while (size>20){
            size=scanner.nextInt();
        }
        int[] array=new int[size];
        for (int i=0;i<array.length;i++){
//            System.out.printf("Enter array "+i+": ");
//            array[i]=scanner.nextInt();
            array[i]=(int)(Math.random()*100-50);
            System.out.printf(array[i]+", ");
        }
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("");
        System.out.println("Value max is: "+max);
    }
}
