public class FizzBuzz {
    public static String translate(int number){
        String result="";
        int hangChuc=number/10;
        if (number>0){
            if (number%3==0){
                if (number%5==0){
                        result="FizzBuzz";
                }else result="Fizz";
            }else if (number%5==0){
                result="Buzz";
            }else result=ReadNumber.read(number);
        }else result="Loi";
        if(number%10==3||hangChuc==3){
            result+=" Fizz";
        }
        if (number%10==5||hangChuc==5){
            result+=" Buzz";
        }
        return result;
    }
}
