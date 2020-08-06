import java.util.Scanner;

public class ChartInString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=scanner.nextLine();
        System.out.println("Enter char: ");
        char chart=scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==chart){
                count++;
            }
        }
        System.out.println("Số kí tự "+chart+"trong chuỗi là: "+count);
    }
}
