import java.io.*;

public class CopyFileText {
    public static void main(String[] args) throws FileNotFoundException {
        File fileSource=new File("Long.txt");
        File text=new File("CopyText1.txt");

        if (!fileSource.exists()){
            throw new FileNotFoundException("Chua co file");
        }else {
            if (text.exists()){
                System.out.println("Da ton tai");
            }else {
                try{
                    FileInputStream fileInputStream=new FileInputStream(fileSource);
                    FileOutputStream fileOutputStream=new FileOutputStream(text);

                    int str=fileInputStream.read();
                    int count=0;
                    while (str!=-1){
                        count++;
                        fileOutputStream.write((char) str);
                        str=fileInputStream.read();

                    }
                    fileInputStream.close();
                    fileOutputStream.close();
                    System.out.println(count);

                }catch (IOException e){
                    e.getStackTrace();
                }
            }
        }
    }
}
