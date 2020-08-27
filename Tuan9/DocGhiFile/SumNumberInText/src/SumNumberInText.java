import java.io.*;

public class SumNumberInText {
    public static void main(String[] args) {
        sumText("Number.txt");
    }

    public static void sumText(String url) {
        try {
            File fileRead = new File(url);
            File fileWrite = new File("Write.txt");
            if (!fileRead.exists()) {
                throw new FileNotFoundException("Chua co file");
            } else {
                if (fileWrite.exists()) {
                    System.out.println("File ton tai roi");
                } else {
                    FileReader fileReader = new FileReader(fileRead);
                    BufferedReader br = new BufferedReader(fileReader);
                    String str = "";
                    int sum = 0;
                    while ((str = br.readLine()) != null) {
                        sum += Integer.parseInt(str);
                    }
                    System.out.println(sum);
                    br.close();
                    fileReader.close();
                }
            }
        }catch(Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}


