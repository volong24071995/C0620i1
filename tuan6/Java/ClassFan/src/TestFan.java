public class TestFan {
    public static void main(String[] args) {
        Fan fan1=new Fan(true,10,"yellow",Fan.FAST);
        Fan fan2=new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
