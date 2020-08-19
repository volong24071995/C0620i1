import java.util.Stack;

public class MyStack {

    public Stack convertBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        return stack;
    }

    public static void main(String[] args) {
        int decimalNumber = 123456789;
        System.out.print("Hệ nhị phân của " + decimalNumber + " là :");
        Stack<Integer> stack = new MyStack().convertBinary(decimalNumber);
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
        Stack<String> newstack = new MyStack().convertBinary(decimalNumber);
    }
}


