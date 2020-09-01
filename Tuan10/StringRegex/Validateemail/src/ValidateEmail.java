import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap mail:");
        String email=scanner.nextLine();
        Pattern pattern=Pattern.compile(EMAIL_REGEX);
        Matcher matcher= pattern.matcher(email);
        if (matcher.matches()){
            System.out.println("OK");
        }else System.out.println("False");
    }
}
