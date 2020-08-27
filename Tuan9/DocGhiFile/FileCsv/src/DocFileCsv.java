import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DocFileCsv {
    public static void main(String[] args)  {
        try {
            File file = new File("Text.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String[] list=line.split(",");
                System.out.println("Quoc gia: "+list[list.length-1]);
            }
        } catch (Exception e){
            System.out.println("Loi file khong ton tai");
        }
    }
}
