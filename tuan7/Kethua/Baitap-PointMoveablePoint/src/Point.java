public class Point {
    float x=0.0f;
    float y=0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] arr={x,y};
        return arr;
    }

    public void setXY(float x,float y) {
        this.x=x;
        this.y = y;
    }
@Override
    public String toString(){
        String text="(";
        for (int i=0;i<getXY().length-1;i++){
            text+=getXY()[i]+",";
        }
        text+=getXY()[getXY().length-1]+")";
        return text;
    }
}
