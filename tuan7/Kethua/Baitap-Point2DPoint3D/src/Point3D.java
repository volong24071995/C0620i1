public class Point3D extends Point2D{
    float z=0.0f;
    Point3D(){
    }
    Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr={getX(),getY(),z};
        return arr;
    }

    public void setXYZ(float x,float y,float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    @Override
    public String toString(){
        String text="(";
        for (int i=0;i<getXYZ().length-1;i++){
            text+=getXYZ()[i]+",";
        }
        text+=getXYZ()[getXYZ().length-1]+")";
        return text;
    }
}
