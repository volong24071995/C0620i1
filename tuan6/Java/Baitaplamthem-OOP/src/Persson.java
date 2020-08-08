import java.util.Scanner;

public class Persson {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter table: ");
        int numtable=scanner.nextInt();
        System.out.println("Menu");
        System.out.println("1. Nuoc cam");
        System.out.println("2. Nuoc loc");
        System.out.println("3. Nuoc Oi");
        System.out.println("0.Chua muon uong");
        int count=0;
        while (true){
            System.out.println("Enter mon");
            int sttmon=scanner.nextInt();
            switch (sttmon){
                case 1:
                    count++;
                    System.out.println("Nuoc cam");
                    break;
                case 2:
                    count++;
                    System.out.println("Nuoc loc");
                    break;
                case 3:
                    count++;
                    System.out.println("Nuoc Oi");
                    System.out.println(count);
                    break;
                case 0:
                    System.out.println("Chua muon uong");
                    System.exit(0);
                    count=0;
                default:
                    System.out.println("thoi oder");
                    System.exit(0);
            }
        }
    }
}
