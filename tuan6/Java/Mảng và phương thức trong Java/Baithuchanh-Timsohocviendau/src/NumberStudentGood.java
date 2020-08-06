import java.util.Scanner;

public class NumberStudentGood {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.printf("Enter mark student "+i+": ");
            array[i]=scanner.nextInt();
            while (array[i]>10){
                System.out.printf("Enter mark student again "+i+": ");
                array[i]=scanner.nextInt();
            }
        }
        int count=0;
        for (int i=0;i<size;i++){
            if(array[i]>=5){
                count++;
            }
        }
        System.out.println("Number student good is: "+count);
    }
}
