public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread old=new OddThread();
        Thread thread1=new Thread(old);
        EvenThread even=new EvenThread();
        Thread thread2=new Thread(even);
        thread1.start();
        thread1.join();
        thread2.start();
    }

}
