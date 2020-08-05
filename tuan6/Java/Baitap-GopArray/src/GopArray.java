import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size aray1: ");
        int size1=scanner.nextInt();
        int[] aray1=new int[size1];
        for (int i=0;i<size1;i++){
            System.out.printf("Enter value1: ");
            aray1[i]=scanner.nextInt();
        }
        System.out.println("Enter size aray2: ");
        int size2=scanner.nextInt();
        int[] aray2=new int[size2];
        for (int i=0;i<size2;i++){
            System.out.printf("Enter value2: ");
            aray2[i]=scanner.nextInt();
        }
        int[] Array=new int[size1+size2];
    }


}
