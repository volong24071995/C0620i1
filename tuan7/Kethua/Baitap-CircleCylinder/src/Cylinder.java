public class Cylinder extends Circle {
    double height;
    Cylinder(){
        super();
        height=1.0;
    }
    Cylinder(double height){
        this.height=height;
    }
    Cylinder(double radius,String color,double height){
        setRadius(radius);
        setColor(color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return super.getArea()*2+ super.getPerimeter()*height;
    }

    public double getVolumetric(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return super.toString()+" height= "+height;
    }
}
