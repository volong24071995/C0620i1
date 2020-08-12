public class AnimalEdibleInterface {
    public static void main(String[] args) {
        Apple apple=new Apple();
        System.out.println(apple.howToEat());
        Orange orange=new Orange();
        System.out.println(orange.howToEat());
        Chicken chicken=new Chicken();
        System.out.println(chicken.howToEat());
        System.out.println(chicken.makeSound());
        Tiger tiger=new Tiger();
        System.out.println(tiger.makeSound());
    }

}
