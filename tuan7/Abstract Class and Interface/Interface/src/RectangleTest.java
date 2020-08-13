import java.util.Arrays;

public class RectangleTest{
    public static void main(String[] args) {
        Rectangle[] rectangles=new Rectangle[3];
        rectangles[0]=new Rectangle(3,4,"red",true);
        rectangles[1]=new Rectangle();
        rectangles[2]=new Rectangle(7,6);
        System.out.println("Before sort:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
        Arrays.sort(rectangles);
        System.out.println("After sort:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
    }
}
