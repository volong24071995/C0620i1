public class EvenThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("A: " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
