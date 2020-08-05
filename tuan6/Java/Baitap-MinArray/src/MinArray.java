import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=scanner.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter phân tử: "+i);
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for(int i=0;i<size;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        System.out.println(min+" is nhỏ nhất");
        int min2=0;
        for(int i=0;i<size;i++){
            if(min!=array[i]){
                min2=array[i];
                break;
            }
        }
        for(int i=0;i<size;i++){
            if(min2>array[i]){
                if(array[i]!=min){
                    min2=array[i];
                }
            }
        }
        System.out.println(min2+" is nhỏ hai");
    }
}
