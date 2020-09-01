import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static String regex="^[0-9]{2}-0[0-9]{9}$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String phoneNumber=scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(phoneNumber);
        if (matcher.matches()){
            System.out.println("ok");
        }else System.out.println("False");
    }
}
