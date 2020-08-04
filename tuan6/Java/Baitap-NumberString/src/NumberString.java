import java.util.Scanner;

public class NumberString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number;
        String text="";
        number=scanner.nextInt();
        if(number>=0&& number<10){
            switch (number) {
                case 0 -> text = "zero";
                case 1 -> text = "one";
                case 2 -> text = "two";
                case 3 -> text = "three";
                case 4 -> text = "four";
                case 5 -> text = "five";
                case 6 -> text = "six";
                case 7 -> text = "seven";
                case 8 -> text = "eight";
                case 9 -> text = "nine";
            }
        }else if(number<20){
            text = switch (number) {
                case 10 -> "ten";
                case 11 -> "eleven";
                case 12 -> "twelve";
                case 13 -> "thirteen";
                case 14 -> "fourteen";
                case 15 -> "fifteen";
                case 16 -> "sixteen";
                case 17 -> "seventeen";
                case 18 -> "eightteen";
                case 19 -> "nineteen";
                default -> text;
            };
        }else if(number<100){
            String hangchuc="",hangdv="";
            int chuc=number/10;
            switch (chuc) {
                case 2 -> hangchuc = "twenty";
                case 3 -> hangchuc = "thirty";
                case 4 -> hangchuc = "forty";
                case 5 -> hangchuc = "fifty";
                case 6 -> hangchuc = "sixty";
                case 7 -> hangchuc = "seventy";
                case 8 -> hangchuc = "eighty";
                case 9 -> hangchuc = "ninety";
            }
            int donvi=number%10;
            switch (donvi) {
                case 0 -> hangdv = "";
                case 1 -> hangdv = "one";
                case 2 -> hangdv = "two";
                case 3 -> hangdv = "three";
                case 4 -> hangdv = "four";
                case 5 -> hangdv = "five";
                case 6 -> hangdv = "six";
                case 7 -> hangdv = "seven";
                case 8 -> hangdv = "eight";
                case 9 -> hangdv = "nine";
            }
            text=hangchuc+" "+hangdv;
        }else if(number<1000){
            text="doi hoc ham lam luon";
        }
        System.out.printf(text);
    }
}
