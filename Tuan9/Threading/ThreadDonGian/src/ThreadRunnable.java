public class ThreadRunnable implements Runnable {
    String name;

    public ThreadRunnable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0;i<=10;i++){
            System.out.println(this.getName()+" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
