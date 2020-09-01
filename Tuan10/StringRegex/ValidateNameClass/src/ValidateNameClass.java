import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    public static String regex="^[ACP]\\d{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten lop hoc:");
        String nameClass=scanner.nextLine();
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(nameClass);
        if (matcher.matches()){
            System.out.println("Ok");
        }else System.out.println("False");
    }
}
