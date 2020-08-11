public class Triangle extends Shape {
    double side1,side2,side3;
    Triangle(){
        super();
        side1=1.0;
        side2=1.0;
        side3=1.0;
    }
    Triangle(double side1,double side2,double side3,String color,boolean filled){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getPerimeter(){
        return (side1+side2+side3);
    }

    public double getArea(){
        double halfPerimeter=getPerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter-side1)*(halfPerimeter-side2)*(halfPerimeter-side3));
    }
    @Override
    public String toString(){
        return "Triangle co cac canh lan luot la: side1="+side1+" side2="+side2+" side3="+side3
                +" Area: "+getArea()
                +" Perimeter: "+getPerimeter()
                +" "+super.toString();
    }
}
