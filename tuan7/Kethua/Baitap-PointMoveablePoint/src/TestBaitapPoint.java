public class TestBaitapPoint {
    public static void main(String[] args) {
        Point point=new Point(4,5);
        System.out.println(point.toString());
        MoveablePoint moveablePoint=new MoveablePoint(4,5);
        System.out.println(moveablePoint.toString());
        MoveablePoint moveablePoint1=new MoveablePoint(4,5,6,8);
        System.out.println(moveablePoint1.toString());
        moveablePoint1.move();
        System.out.println(moveablePoint1.toString());
        Point point1=new MoveablePoint(4,6,5,8);
        System.out.println(point1.toString());
    }
}
