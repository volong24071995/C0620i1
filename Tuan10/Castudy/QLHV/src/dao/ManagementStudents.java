package dao;

import entity.Student;
import ui.Main;

import java.util.*;

public class ManagementStudents implements ManagementStudentsDao {
    public static final String UPDATE_THANH_CONG = "Update thành công";
    public static final String KHONG_CO_HOC_VIEN_NAY = "Không có học viên này";
    public static final String DIEM_KIEM_TRA_MIENG = "Điểm kiểm tra miệng:";
    public static final String DIEM_KIEM_TRA_15 = "Điểm kiểm tra 15':";
    public static final String DIEM_KIEM_TRA_1_TIET = "Điểm kiểm tra 1 tiết:";
    public static final String DIEM_KIEM_TRA_HOC_KI = "Điểm kiểm tra học kì:";
    public static final String KET_THUC = "Kết thúc chương trình!";
    public static final String SDT_DA_TON_TAI = "Số điên thoai đã có vui lòng kiểm tra lại thông tin";
    public static final String SPACE = " ";
    public static final String NHAP_SAI = "Nhập sai!";
    public static final String NHAP_LAI = "\"Vui lòng nhập lại:\"";
    Map<Integer, Student> listStudent = IOBanary.ReaderFile();
    Scanner sc = new Scanner(System.in);
    static int lengthId = 2;
    static int lengthName = 4;

    public int id() {
        int index = 0;
        for (Student student : listStudent.values()) {
            index = student.getId();
        }
        return index;
    }

    @Override
    public void add(Student student) {
        boolean check = false;
        for (Student values : listStudent.values()) {
            if (student.getPhoneNumber().equals(values.getPhoneNumber())) {
                System.out.println(SDT_DA_TON_TAI);
                check = true;
                break;
            }
        }
        if (!check) {
            int id = id() + 1;
            student.setId(id);
            listStudent.put(id, student);
            maxLength(student);
            IOBanary.WriteFile(listStudent);
            System.out.println(UPDATE_THANH_CONG);
        }
    }

    @Override
    public void edit(int id) {
        var key = checkStudent(id);
        if (key >= 0) {
            Student student=listStudent.get(key);
            System.out.println(Main.NHAP_TEN);
            String name=sc.nextLine();
            student.setName(name);
            System.out.println(Main.NHAP_GIOI_TINH);
            String gender= Main.validateGender();
            student.setGender(gender);
            System.out.println(Main.NHAP_SO_DIEN_THOAI);
            String phone=Main.validatePhone();
            boolean check=false;
            for (Student values : listStudent.values()) {
                var phoneNumber = values.getPhoneNumber();
                var studentPhone = student.getPhoneNumber();
                if(phone.equals(phoneNumber) && !phone.equals(studentPhone)){
                    System.out.println(SDT_DA_TON_TAI);
                    check=true;
                    break;
                }
            }
            if (!check){
                student.setPhoneNumber(phone);
                IOBanary.WriteFile(listStudent);
                System.out.println(UPDATE_THANH_CONG);
            }
        } else System.out.println(KHONG_CO_HOC_VIEN_NAY);

    }

    @Override
    public void delete(int id) {
        var key = checkStudent(id);
        if (key >= 0) {
            listStudent.remove(key);
            IOBanary.WriteFile(listStudent);
            System.out.println(UPDATE_THANH_CONG);
        } else System.out.println(KHONG_CO_HOC_VIEN_NAY);
    }

    @Override
    public void getAll() {
        List<Student> list = new ArrayList<>(listStudent.values());
        showTable(list);
        System.out.println();
    }

    public static void menuMark() {
        System.out.println("1." + DIEM_KIEM_TRA_MIENG);
        System.out.println("2." + DIEM_KIEM_TRA_15);
        System.out.println("3." + DIEM_KIEM_TRA_1_TIET);
        System.out.println("4." + DIEM_KIEM_TRA_HOC_KI);
        System.out.println("0." + KET_THUC);
    }

    public void editMark(int id) {
        if (checkStudent(id) >= 0) {
            boolean check = true;
            while (check) {
                menuMark();
                System.out.println(Main.NHAP_LUA_CHON);
                String chose = sc.nextLine();
                switch (chose) {
                    case "1":
                        System.out.println(DIEM_KIEM_TRA_MIENG);
                        double kTraMieng = validateMark();
                        listStudent.get(id).setkTraMieng(kTraMieng);
                        break;
                    case "2":
                        System.out.println(DIEM_KIEM_TRA_15);
                        double kTra15p = validateMark();
                        listStudent.get(id).setkTra15p(kTra15p);
                        break;
                    case "3":
                        System.out.println(DIEM_KIEM_TRA_1_TIET);
                        double kTra1Tiet = validateMark();
                        listStudent.get(id).setkTra1Tiet(kTra1Tiet);
                        break;
                    case "4":
                        System.out.println(DIEM_KIEM_TRA_HOC_KI);
                        double kTraHocKi = validateMark();
                        listStudent.get(id).setkTraHocKi(kTraHocKi);
                        break;
                    case "0":
                        check = false;
                        System.out.println(UPDATE_THANH_CONG);
                        IOBanary.WriteFile(listStudent);
                }
            }
        } else System.out.println(KHONG_CO_HOC_VIEN_NAY);
    }

    public void sort() {
        List<Student> list = new ArrayList<>(listStudent.values());
        list.sort(Comparator.comparingInt(student -> (int) student.getTbMon()));
        Collections.reverse(list);
        showTable(list);
    }

    public int checkStudent(int id) {
        return listStudent.containsKey(id) ? id : -1;
    }

    public String getSpaceByInt(int i) {
        return SPACE.repeat(Math.max(0, i));
    }

    public String getStringByInt(int j) {
        return "-".repeat(Math.max(0, j));
    }

    public void maxLength(Student student) {
        var length = student.getName().length();
        if (length > lengthName) {
            lengthName = length;
        }
        var str = String.valueOf(student.getId());
        var length1 = str.length();
        if (lengthId > length1) {
            lengthId = length1;
        }
    }


    public void showTable(List<Student> studentList) {
        System.out.println(getStringByInt(92 + lengthName + lengthId));
        System.out.print(" Id" + getSpaceByInt(lengthId + 1) + "|");
        System.out.print(" Name" + getSpaceByInt(lengthName - 1) + "|");
        System.out.print(" Gender" + getSpaceByInt(3) + "|");
        System.out.print(" Phone" + getSpaceByInt(8) + "|");
        System.out.print(" Mark1" + getSpaceByInt(3) + "|");
        System.out.print(" Mark2" + getSpaceByInt(3) + "|");
        System.out.print(" Mark3" + getSpaceByInt(3) + "|");
        System.out.print(" Mark4" + getSpaceByInt(3) + "|");
        System.out.print(" AverageMark" + getSpaceByInt(3)+ "|");
        System.out.println();

        for (Student student : studentList) {
            var id = student.getId();
            String strId = String.valueOf(id);
            var length = strId.length();
            System.out.print(SPACE + id + getSpaceByInt(lengthId + 3 - length) + "|");
            var name = student.getName();
            System.out.print(SPACE + name + getSpaceByInt(lengthName + 3 - name.length()) + "|");
            var gender = student.getGender();
            System.out.print(SPACE + gender + getSpaceByInt(9 - gender.length()) + "|");
            var phoneNumber = student.getPhoneNumber();
            System.out.print(SPACE + phoneNumber + getSpaceByInt(3) + "|");
            var kiemTraMieng = student.getkTraMieng();
            String strMark1 = String.valueOf(kiemTraMieng);
            var lengthMark1 = strMark1.length();
            System.out.print(SPACE + kiemTraMieng + getSpaceByInt(8 - lengthMark1) + "|");
            var kTra15p = student.getkTra15p();
            String strMark2 = String.valueOf(kTra15p);
            var lengthMark2 = strMark2.length();
            System.out.print(SPACE + kTra15p + getSpaceByInt(8 - lengthMark2) + "|");
            var ktra1tiet = student.getkTra1Tiet();
            String strMark3 = String.valueOf(ktra1tiet);
            var lengthMark3 = strMark3.length();
            System.out.print(SPACE + ktra1tiet + getSpaceByInt(8 - lengthMark3) + "|");
            var kTraHocKi = student.getkTraHocKi();
            String strMark4 = String.valueOf(kTraHocKi);
            var lengthMark4 = strMark4.length();
            System.out.print(SPACE + kTraHocKi + getSpaceByInt(8 - lengthMark4) + "|");
            var tbMon = student.getTbMon();
            String strTbMon = String.valueOf(tbMon);
            var lengthTbMon = strTbMon.length();
            System.out.print(SPACE + tbMon + getSpaceByInt(14 - lengthTbMon)+ "|");
            System.out.println();
        }
    }

    //    VALIDATE
    public static Double validateMark() {
        Scanner sc = new Scanner(System.in);
        double n = 0.0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextDouble();
                if (n < 0 || n > 10) {
                    throw new ArithmeticException();
                }
                check = true;
            } catch (Exception e) {
                System.out.println(NHAP_SAI+NHAP_LAI);
                sc.nextLine();
            }
        }
        return n;
    }

}
