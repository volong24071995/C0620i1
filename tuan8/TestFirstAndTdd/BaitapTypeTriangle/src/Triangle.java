public class Triangle {
    public static String typeTriangle(int a,int b, int c){
        String result="";
        if (a <= 0 || b <= 0 || c <= 0) {
            result="Not a Triangle";
        } else {
            if(a+b>c&&b+c>a&&a+c>b){
                if (a==b&&a==c){
                    result="Equilateral Triangle";
                }else if (a==b||b==c||c==a){
                    result="Isosceles Triangle";
                }else result="Normal Triangle";
            }else result="Not a Triangle";
        }
        return result;
    }
}
