import java.util.Scanner;

public class Persson {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] table=new int[10];
        System.out.println("Menu");
        System.out.println("1. Nuoc cam");
        System.out.println("2. Nuoc loc");
        System.out.println("3. Nuoc Oi");
        System.out.println("0.Chua muon uong");

        System.out.println("Enter table: ");
        int number=scanner.nextInt();

        int count=0;
        System.out.println("Enter mon");
        while (true){

            int sttmon=scanner.nextInt();
            int sl = 0;
            switch (sttmon){
                case 1:
                    int pire1=2000;
                    System.out.println("Nuoc cam "+pire1+"/ly");
                    System.out.printf("So luong:");
                    sl = scanner.nextInt();
                    count+=sl;
                    break;
                case 2:
                    int pire2=3000;
                    System.out.println("Nuoc loc "+pire2+"/chai");
                    System.out.printf("So luong:");
                    sl = scanner.nextInt();
                    count+=sl;
                    break;
                case 3:
                    int pire3=4000;
                    System.out.println("Nuoc Oi "+pire3+"/ly");
                    System.out.printf("So luong:");
                    sl = scanner.nextInt();
                    count+=sl;
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
