public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0] =new Circle(3,"red",true);
        shapes[1] =new Rectangle(4,5,"yellow",true);
        shapes[2] =new Square(5,"blue",true);
        for (int i=0;i<shapes.length;i++){
            if(shapes[i]instanceof Circle){
                Circle circle=(Circle)shapes[i];
                System.out.printf("Area Circle before: %6f \n",circle.getArea());
                System.out.printf("Area Circle after: %6f \n",circle.resize(Math.random()*99+1));
            }else if(shapes[i]instanceof Rectangle) {
                if (((Rectangle) shapes[i]).getLength() != ((Rectangle) shapes[i]).getWidth()) {
                    Rectangle rectangle = (Rectangle) shapes[i];
                    System.out.printf("Area Rectangle before: %6f \n", rectangle.getArea());
                    System.out.printf("Area Rectangle after: %6f \n", rectangle.resize(Math.random() * 99 + 1));
                } else {
                    Square square = (Square) shapes[i];
                    System.out.printf("Area Square before: %6f \n", square.getArea());
                    System.out.printf("Area Square after: %6f \n", square.resize(Math.random() * 99 + 1));
                    square.howToColor();
                }
            }
        }
    }
}
