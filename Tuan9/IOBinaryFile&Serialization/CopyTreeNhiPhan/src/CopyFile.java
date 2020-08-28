import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap target file:");
        String targetFile=scanner.nextLine();

        try {
            InputStream fileInput=new FileInputStream(targetFile);
            OutputStream fileOutput=new FileOutputStream("Copyfile");
            int i;
            while ((i=fileInput.read())!=-1){
                fileOutput.write(i);
            }
        }catch (Exception e){
            System.out.println("File loi or khong ton tai");
        }
    }
}
