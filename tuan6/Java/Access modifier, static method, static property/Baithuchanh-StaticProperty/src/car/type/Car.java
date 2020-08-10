package car.type;

public class Car {
    private String name;
    private String engine;
//    khoi tao 1 vung nho va giu lai gia tri
    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
//        sau 1 lan thi numberOfCars tang gia tri them 1 ma ko fai goi lai vung nho;
        numberOfCars++;
    }
}
