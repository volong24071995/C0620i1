import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date date=new Date();
        StopWatch time=new StopWatch();
        time.start();
        int i=0;
        int count=0;
        while (i<1000000){
            if(i%2==0){
                System.out.println(count++);
            }
            i+=1;
        }
        time.stop();
        System.out.println(time.getElapsedTime());

    }
}
