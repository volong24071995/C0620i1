import java.util.Stack;

public class TestStackComputer {
    public static void main(String[] args) {
        Stack<Integer> myLong=new Stack<>();
        myLong.push(5);
        myLong.push(6);
        myLong.push(9);
        myLong.push(8);
        System.out.println(myLong.empty());
    }
}
