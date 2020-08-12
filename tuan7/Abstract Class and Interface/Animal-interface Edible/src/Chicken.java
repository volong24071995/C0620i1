public class Chicken extends Animals implements Edible{
    @Override
    public String makeSound() {
        return "Cuc Cuc Cuc";
    }
    @Override
    public String  howToEat(){
      return "chicken KFC";
    }
}
