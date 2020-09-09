import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IOBanary {
    private static final String PHONEBOOK ="PHONEBOOK.txt";
    static File file=new File(PHONEBOOK);

    public static void WriteFile(List<Phonebook> list){
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter=new FileWriter(PHONEBOOK);
            for (Phonebook phonebook:list) {
                fileWriter.append(phonebook.toString());
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Phonebook> ReaderFile(){
        File file=new File(PHONEBOOK);
        List<Phonebook> list=new ArrayList<>();
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader=new FileReader(file);
            BufferedReader buff=new BufferedReader(fileReader);
            String line;
            while ((line=buff.readLine())!=null){
                Phonebook phonebook=new Phonebook();
                String[] str=line.split(",");
                phonebook.setName(str[0]);
                phonebook.setGender(str[1]);
                phonebook.setPhoneNumber(str[2]);
                phonebook.setAddress(str[3]);
                phonebook.setEmail(str[4]);
                phonebook.setBirthDate(str[5]);
                phonebook.setGroup(str[6]);
                list.add(phonebook);
            }
            buff.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}