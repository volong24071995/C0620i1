import java.util.Scanner;

public class GopArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size1: ");
        int size1=check();
        while (size1>20||size1<0){
            System.out.println("Enter 0<size<=20: ");
            size1=check();
        }
        int[] arr1=new int[size1];
        for (int i=0;i<size1;i++){
            arr1[i]=(int)(Math.random()*100-50);
            System.out.printf(arr1[i]+", ");
        }
        System.out.println();
        System.out.println("Enter size2: ");
        int size2=check();
        while (size2>20||size1<0){
            System.out.println("Enter 0<size<=20: ");
            size2=check();
        }
        int[] arr2=new int[size2];
        for (int i=0;i<size2;i++){
            arr2[i]=(int)(Math.random()*100-50);
            System.out.printf(arr2[i]+", ");
        }
        System.out.println();
        System.out.println("Arr3 is: ");
        int[] arr3=new int[size1+size2];
        int j=0;
        for (int i=0;i<arr3.length;i++){
            if (i<size1){
                arr3[i]=arr1[i];
            }else {
                arr3[i]=arr2[j];
                j++;
            }
            System.out.printf(arr3[i]+", ");
        }

    }
    //      ham kiem tra so nguyen
    public static int check() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("ban nhap sai kieu du lieu \n moi nhap lai : ");
                sc.nextLine();
            }
        }
        return n;
    }

}

