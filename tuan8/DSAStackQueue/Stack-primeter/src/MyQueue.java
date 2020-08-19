import java.util.EmptyStackException;

public class MyQueue {
    // định nghĩa kích thước của hàng đợi
    int size = 10;
    // đánh dấu vị trí đầu hàng đợi
    int front = 0;
    // đánh dấu vị trí cuối hàng đợi
    int rear = -1;
    // khai báo 1 mảng để tạo hàng đợi
    int[] queue=new int[10];

    public boolean isEmpty() {
        return (front < 0 || front > rear) ? true : false;
    }

    public boolean isFull() {
        return rear == size - 1 ? true : false;
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }
        rear++;
        queue[rear] = item;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        queue[front] = 0;
        front++;
    }

    public int peek() {
        return queue[front];
    }
}
