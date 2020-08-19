import java.util.EmptyStackException;

public class MyStack {
    // định nghĩa kích thước của ngăn xếp
    int size = 100;
    // tạo 1 biến để xác định vị trí đầu ngăn xếp
    int top = 0;
    // khai báo 1 mảng để tạo ngăn xếp
    int[] stack=new int[100];

    public boolean isEmpty() {
        return top == 0 ? true : false;
    }

    public boolean isFull() {
        return top == size ? true : false;
    }

    public void push(int item) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }
        top++;
        stack[top] = item;
    }

    public void pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        stack[top] = 0;
        top--;
    }

    public int peek() {
        return stack[top];
    }
}
