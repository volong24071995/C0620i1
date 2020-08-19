import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class StackArray {
    public static void main(String[] args) {
        Stack<String> wStack=new Stack<>();
        wStack.push("Long");
        wStack.push("Lanh");
        wStack.push("Lấp");
        wStack.push("Lánh");
        for (String str:wStack){
            System.out.print(str+" ");
        }
        System.out.println();
        Collections.reverse(wStack);
        for (String str:wStack){
            System.out.print(str+" ");
        }
        System.out.println();
        Collections.sort(wStack);
        for (String str:wStack){
            System.out.print(str+" ");
        }
        Collections.sort(wStack);
    }
}
