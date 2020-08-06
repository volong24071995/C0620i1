import java.util.Scanner;

public class AddArrayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = scanner.nextInt();
        while (size > 20) {
            System.out.println("Enter size array<=20: ");
            size = scanner.nextInt();
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.printf(array[i] + ", ");
        }
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        System.out.println("Enter value: ");
        int x = scanner.nextInt();
        int[] newarray=new int[size+1];
        for (int i=0;i<index;i++){
            newarray[i]=array[i];
        }
        for (int i=index;i<array.length;i++){
            newarray[i+1]=array[i];
        }
        newarray[index]=x;
        for(int i=0;i<newarray.length;i++){
            System.out.printf(newarray[i]+", ");
        }
    }
}