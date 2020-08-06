import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Checksnt {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        boolean check=true;
        System.out.printf("Enter số cần kiểm tra: ");
        n=scanner.nextInt();

        if(n <2 ){
            check = false;
        }else if(n%2==0 && n!=2){
            check = false;
        }
        if(check) {
            for (int i = 2; i < Math.floor(Math.sqrt(n)); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if(check){
            System.out.printf("%d là số nguyên tố ",n);
        }else System.out.printf("%d không là số nguyên tố ",n);

    }
}
