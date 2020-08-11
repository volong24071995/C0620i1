public class MoveablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setYSpeed(float xSpeed,float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[]arr={xSpeed,ySpeed};
        return arr;
    }
    @Override
    public String toString(){
        String text="speed=(";
        for (int i=0;i< getSpeed().length-1;i++){
            text+=getSpeed()[i]+",";
        }
        text+=getSpeed()[getSpeed().length-1]+")";
        return super.toString()+", "+text;
    }

    public MoveablePoint move(){
        x+=xSpeed;
        y+=ySpeed;
        return this;
    }

}
