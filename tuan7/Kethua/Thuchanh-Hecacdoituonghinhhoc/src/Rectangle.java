public class Rectangle extends Shape {
    double width,length;
    Rectangle(){
        super();
        width=1.0;
        length=1.0;
    }

    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }

    Rectangle(double width,double length, String color,boolean filled){
        setColor(color);
        setFilled(filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return (this.width+this.length)*2;
    }

    @Override
        public String toString (){
        return  "A Rectangle with width= "+width+" and length= "+length+", which is a subclass of "+super.toString();
    }

}
