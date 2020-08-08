import java.util.Scanner;

public class AddArrayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=check();
        while (size>20||size<0){
            System.out.println("Enter 0<size<=20: ");
            size=check();
        }
        int[] arr=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*100-50);
            System.out.printf(arr[i]+", ");
        }
        System.out.println();
//        NHAP INDEX
        System.out.println("Enter index: ");
        int index=check();
        while(index>size||index<0){
            System.out.println("Enter 0<=index<"+size+": ");
            index=check();
        }
//        NHAP VALUE
        System.out.println("Enter value ");
        int value=check();

//        TINH
        int[] newarr=new int[size+1];
        for (int i=size;i>=0;i--){
            if (i>index){
                newarr[i]=arr[i-1];
            }else if(i==index){
                newarr[index]=value;
            }else  newarr[i]=arr[i];
        }
        for (int i=0;i< newarr.length;i++){
            System.out.printf(newarr[i]+", ");
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
