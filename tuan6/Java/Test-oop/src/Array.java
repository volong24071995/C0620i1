import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[]a={3,1,2,6};

        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length-1;j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int j : a) {
            System.out.printf(j + ", ");
        }
    }
}
