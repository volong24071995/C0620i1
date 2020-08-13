public class Rectangle extends Shape implements Comparable<Rectangle>,Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
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

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + "\n, which is a subclass of "
                + super.toString();
    }

    @Override
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea()) return 1;
        else if (getArea() < o.getArea()) return -1;
        else return 1;
    }

    @Override
    public double resize(double percent) {
        setLength(getLength()*percent/100+getLength());
        setWidth(getWidth()*percent/100+getWidth());
        return getArea();
    }
}
