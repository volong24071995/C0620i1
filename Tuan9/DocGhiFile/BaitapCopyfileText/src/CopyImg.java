import java.io.*;

public class CopyImg {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream = new FileInputStream(new File("ai.jpg"));
            outStream = new FileOutputStream(new File("ai2.jpg"));
            byte[] buffer = new byte[1024];
            while ((inStream.read(buffer)) > 0) {
                outStream.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
