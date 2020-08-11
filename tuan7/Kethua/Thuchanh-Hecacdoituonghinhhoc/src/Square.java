public class Square extends Rectangle{
    double side;
    Square() {
        side=2.0;
        width =side;
        length=side;
    }

    Square(double side){
        super(side,side);
        this.side=side;
    }

    Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString(){
        return "A Square with side= "+side+", which is a subclass of "+super.toString();
    }
}
