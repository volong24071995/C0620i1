public class Main {
    static Customer customer = new Customer(1000);
    public static void main(String[] args) throws InterruptedException {
//        ThreadRunnable threadRunnable=new ThreadRunnable("A");
//        Thread thread1=new Thread(threadRunnable);
//
//        ThreadThread threadThread=new ThreadThread();
//        thread1.start();
//        thread1.join();
//        threadThread.start();

        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            customer.ruttien(1999);
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            customer.napTien(1999);
        }
    }
}
