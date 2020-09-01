import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static String regex="^[_a-z0-9]{6,}$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap User:");
        String user=scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(user);
        if (matcher.matches()){
            System.out.println("OK");
        }else System.out.println("False");
    }
}
