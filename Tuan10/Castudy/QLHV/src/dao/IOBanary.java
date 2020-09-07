package dao;

import entity.Student;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class IOBanary {
    private static final String QuanLyHocVien ="QLHV.txt";
    static File file=new File(QuanLyHocVien);

    public static void WriteFile(Map<Integer, Student> list){
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter=new FileWriter(QuanLyHocVien);
            for (Student student:list.values()) {
                fileWriter.append(student.toString());
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer,Student> ReaderFile(){
        File file=new File(QuanLyHocVien);
        Map<Integer,Student> list=new HashMap<>();
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader=new FileReader(file);
            BufferedReader buff=new BufferedReader(fileReader);
            String line;
            while ((line=buff.readLine())!=null){
                Student student=new Student();
                String[] str=line.split(",");
                student.setId(Integer.parseInt(str[0]));
                student.setName(str[1]);
                student.setGender(str[2]);
                student.setPhoneNumber(str[3]);
                student.setkTraMieng(Double.parseDouble(str[4]));
                student.setkTra15p(Double.parseDouble(str[5]));
                student.setkTra1Tiet(Double.parseDouble(str[6]));
                student.setkTraHocKi(Double.parseDouble(str[7]));
                list.put(student.getId(),student);
            }
            buff.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
