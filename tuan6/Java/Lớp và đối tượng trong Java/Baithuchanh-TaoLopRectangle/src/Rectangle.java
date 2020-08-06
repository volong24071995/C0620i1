public class Rectangle {
    double wight,height;

    public Rectangle(){
    }

    public Rectangle(double wight, double height){
        this.wight=wight;
        this.height=height;
    }
    public double getArea(){
        return this.wight*this.height;
    }
    public double getPrimmetter(){
        return (height+wight)*2;
    }
    public String display(){
        return "Rectangle{ wight= "+wight+",height= "+height+"}";

    }
}
