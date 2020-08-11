public class Circle {
    double radius;
    String color;
    Circle(){
        radius=1.0;
        color="blue";
    };
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    };

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
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return this.radius*this.radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A circle: radius= "+radius+" color is: "+color;
    }
}
