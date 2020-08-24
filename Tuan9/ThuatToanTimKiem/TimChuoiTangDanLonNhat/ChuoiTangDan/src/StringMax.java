import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao chuoi");
        String text=sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(text.charAt(i));
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) > list.getLast()) {
                    list.add(text.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
        System.out.println();
    }
}
