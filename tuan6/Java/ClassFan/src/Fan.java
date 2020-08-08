public class Fan {
    public static final int SLOW=1;
    public static final int MEDIUM=2;
    public static final int FAST =3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.on=false;
        this.radius=5;
        this.speed=SLOW;
        this.color="blue";
    }

    public Fan(boolean on, double radius, String color, int speed){
        this.on=on;
        this.radius=radius;
        this.color=color;
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (isOn()){
            return "Speed: "+getSpeed()+", color: "+getColor()+", radius: "+getRadius()+" fan is on";
        }else return "Speed: "+getSpeed()+", color: "+getColor()+", radius: "+getRadius()+" fan is off";
    }
}
