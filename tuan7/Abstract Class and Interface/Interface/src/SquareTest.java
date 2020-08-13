import java.util.Arrays;

public class SquareTest {
    public static void main(String[] args) {
        Square[] squares=new Square[3];
        squares[0]=new Square(3,"red",true);
        squares[1]=new Square();
        squares[2]=new Square(7,"blue",true);
        System.out.println("Before sort:");
        for (int i=0;i<3;i++) {
            System.out.println(squares[i].toString());
        }
        Arrays.sort(squares);
        System.out.println("After sort:");
        for (int i=0;i<3;i++){
            System.out.println(squares[i].toString());
        }
    }
}
