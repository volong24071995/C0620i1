public class Max2 {
    public static void main(String[] args) {
        int a=6;
        int b=5;
        if (a>b){
            b=a-b;
            a=a-b;
            b=b+a;
            System.out.println(a+" "+b);
        }
        else{
            a=b-a;
            b=b-a;
            a=a+b;
            System.out.println(a+" "+b);
        }
    }
}
