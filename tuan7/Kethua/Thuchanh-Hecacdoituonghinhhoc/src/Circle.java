public class Circle extends Shape {
    double radius;
    Circle(){
        super();
        radius=1.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle( double radius,String color,boolean filled){
        setColor(color);
        setFilled(filled);
        this.radius=radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString(){
        return "A Circle with radius= " +radius+", which is a subclass of "+super.toString();
    }

}
