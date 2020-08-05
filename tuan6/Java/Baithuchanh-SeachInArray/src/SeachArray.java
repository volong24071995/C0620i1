import java.util.Scanner;

public class SeachArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.printf("Enter name search: ");
        String name=scanner.nextLine();
        boolean isExist = false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(name)) {
                System.out.println("Name ở vi trí: "+i);
                isExist=true;
                break;
            }
        }
        if(!isExist) System.out.println("Name không có trong danh sách ");

    }
}
