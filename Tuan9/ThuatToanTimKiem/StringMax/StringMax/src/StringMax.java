import java.util.LinkedList;
import java.util.Scanner;

public class StringMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String text=scanner.nextLine();
        LinkedList<Character> list=new LinkedList<>();
        LinkedList<Character> max=new LinkedList<>();
        for (int i=0;i<text.length();i++){
            if (list.size()>1&&text.charAt(i)<=list.getLast()&&list.contains(text.charAt(i))){
                list.clear();
            }
            list.add(text.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
