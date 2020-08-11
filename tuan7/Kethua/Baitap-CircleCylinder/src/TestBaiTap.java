public class TestBaiTap {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder.toString());

        Circle cyclinder1=new Cylinder();
        System.out.println(cyclinder1.toString());

        Cylinder cylinder2=(Cylinder) cyclinder1;
        System.out.println(cylinder2.toString());

        Cylinder cylinder3=new Cylinder(3,"Red",8);
        System.out.println(cylinder3.toString());

        Circle cylinder4=new Cylinder(4,"Grenn",7);
        System.out.println(cylinder4.toString());


    }
}
