import java.util.Date;
public class StopWatch {
    private double startTime,endTime;

    StopWatch(){
        Date date=new Date();
        startTime=date.getTime();
    }

    public StopWatch(double startTime,double endTime){
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public double getterstartTime(){
        return  this.startTime;
    }

    public double getterendTime(){
        return  this.endTime;
    }

    public void start() {
        Date date=new Date();
        this.startTime=date.getTime();
    }

    public void stop(){
        Date date=new Date();
        this.endTime=date.getTime();
    }

    public double getElapsedTime(){
        return (getterendTime()-getterstartTime());
    }

}

