public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){
    }

    protected Circle(double radius){
        color="red";
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return  getRadius()*getRadius()*Math.PI;
    }
//    protected double getRadius() {
//        return radius;
//    }
//
//    protected double getArea() {
//        return  getRadius()*getRadius()*Math.PI;
//    }
}
