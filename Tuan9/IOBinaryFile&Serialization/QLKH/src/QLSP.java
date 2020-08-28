import java.io.*;

public class QLSP {
    private static final String FILENAME = "QLSP.txt";
    public static File file = new File(FILENAME);
    private static int id=0;

    public void addSp(Sp sp) {
        if (checkName(sp.getName())) {
            System.out.println("San pham nay da co");
        } else {
            id++;
            sp.setId(id);
            String old = display();
            try {
                FileWriter fileWriter = new FileWriter(file);
                String str = sp.toString();
                if (old == null) {
                    old = str;
                } else {
                    old += "\n" + str;
                }
                fileWriter.write(old);
                fileWriter.close();
                System.out.println("Da update");
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }

    public String display() {
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String str = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (str == null) {
                    str = line;
                } else {
                    str += "\n" + line;
                }
            }
            return str;
        } catch (Exception e) {
            e.getStackTrace();
            return null;
        }
    }

    public boolean checkName(String name) {
        boolean check = false;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str[1].equals(name)) {
                    String text="";
                    for (int i=0;i<str.length;i++){
                        text+=str[i]+" ";
                    }
                    System.out.println(text);
                    check = true;
                    break;
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        return check;
    }
}
