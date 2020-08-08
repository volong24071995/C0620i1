import java.util.Scanner;

public class DeleArrayi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size=scanner.nextInt();
        while (size>20||size<0){
            System.out.println("Enter array length <=20: ");
            size=scanner.nextInt();
        }
        int[] array=new int[size];
        int j=0;
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*100-50);
            System.out.println("Value array "+i+": "+array[i]);
        }
        System.out.println();
        System.out.println("Enter X cần xóa: ");
        int x=scanner.nextInt();
        int[] newarray=new int[size];
        int dem=0;
        for (int i=0;i< array.length;i++){
            if (array[i]==x){
                dem++;
                continue;
            }
            newarray[j]=array[i];
            j++;
        }
        array=newarray;
        if(dem==0){
            System.out.println(x+" không có trong mảng: ");
        }
        else {
            System.out.println("Array sau khi xóa is: ");
            for (int i=0;i<array.length-dem;i++){
                System.out.printf(array[i]+", ");
            }
        }
    }
}
