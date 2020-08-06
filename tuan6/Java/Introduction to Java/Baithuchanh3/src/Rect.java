import java.util.Scanner;

public class Rect {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float rect=width*height;
        System.out.println("Area rect is: "+ rect);
    }
}
