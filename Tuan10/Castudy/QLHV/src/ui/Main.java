package ui;

import dao.ManagementStudents;
import entity.Student;

import java.util.Scanner;

public class Main {
    public static final String NHAP_LUA_CHON = "Nhập lựa chọn:";
    public static final String XEM_DANH_SACH_HOC_VIEN = "Xem danh sách học viên";
    public static final String THEM_HOC_VIEN = "Thêm học viên";
    public static final String SUA_THONG_TIN_HOC_VIEN = "Sửa thông tin học viên";
    public static final String XOA_HOC_VIEN = "Xoá học viên";
    public static final String NHAP_SUA_DIEM_HOC_VIEN = "Nhập điểm/Sửa điểm học viên:";
    public static final String XEP_LOAI = "Xếp loại học viên:";
    public static final String KET_THUC_CHUONG_TRINH = "Kết thúc chương trình!";
    public static final String NHAP_ID = "Nhập id hoc viên";
    public static final String NHAP_SO_DIEN_THOAI = "Nhập số điện thoại";
    public static final String NHAP_GIOI_TINH = "Nhập giới tính";
    public static final String NHAP_TEN = "Nhập tên học viên:";
    public static final String NHAP_SAI = "Nhập sai!";

    static ManagementStudents management = new ManagementStudents();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            showMenu();
            System.out.println(NHAP_LUA_CHON);
            String chose = sc.nextLine();
            switch (chose) {
                case "1":
                    System.out.println(XEM_DANH_SACH_HOC_VIEN);
                    displayAll();
                    break;
                case "2":
                    System.out.println(THEM_HOC_VIEN);
                    addStudent();
                    break;
                case "3":
                    System.out.println(SUA_THONG_TIN_HOC_VIEN);
                    editStudent();
                    break;
                case "4":
                    System.out.println(XOA_HOC_VIEN);
                    deleteStudent();
                    break;
                case "5":
                    System.out.println(NHAP_SUA_DIEM_HOC_VIEN);
                    editMark();
                    break;
                case "6":
                    System.out.println(XEP_LOAI);
                    sorttbMon();
                    break;
                case "0":
                    System.out.println(KET_THUC_CHUONG_TRINH);
                    System.exit(0);
            }
        }
    }

    public static void showMenu() {
        System.out.println("1."+XEM_DANH_SACH_HOC_VIEN);
        System.out.println("2."+THEM_HOC_VIEN);
        System.out.println("3."+SUA_THONG_TIN_HOC_VIEN);
        System.out.println("4."+XOA_HOC_VIEN);
        System.out.println("5."+ NHAP_SUA_DIEM_HOC_VIEN);
        System.out.println("6."+XEP_LOAI);
        System.out.println("0."+KET_THUC_CHUONG_TRINH);
    }

    public static void addStudent() {
        Student student = new Student();
        System.out.println(NHAP_TEN);
        String name = sc.nextLine();
        student.setName(name);
        System.out.println(NHAP_GIOI_TINH);
        String gender = validateGender();
        student.setGender(gender);
        System.out.println(NHAP_SO_DIEN_THOAI);
        String phoneNumber = validatePhone();
        student.setPhoneNumber(phoneNumber);
        management.add(student);
    }

    public static void editStudent() {
        System.out.println(NHAP_ID);
        int id = validateId();
        management.edit(id);
    }

    public static void deleteStudent() {
        System.out.println(NHAP_ID);
        int id = validateId();
        management.delete(id);
    }

    public static void displayAll() {
        management.getAll();
    }

    public static void editMark() {
        System.out.println(NHAP_ID);
        int id = validateId();
        management.editMark(id);
    }

    public static void sorttbMon() {
        management.sort();
    }

    //    Validate
    public static int validateId() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = sc.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println(NHAP_ID);
                sc.nextLine();
            }
        }
        return n;
    }

    public static String validatePhone() {
        boolean flag;
        String input = sc.nextLine();
        String phonePattern = "\\d{10}";
        flag = input.matches(phonePattern);
        while (!flag){
            System.out.println(NHAP_SAI +NHAP_SO_DIEN_THOAI);
            input = sc.nextLine();
            flag = input.matches(phonePattern);
        }
        return input;
    }

    public static String validateGender() {
        boolean flag;
        String input = sc.nextLine();
        String genderPattern = "Nam|Nữ|nam|nữ|NAM|NỮ";
        flag = input.matches(genderPattern);
        while (!flag){
            System.out.println(NHAP_SAI+NHAP_GIOI_TINH);
            input = sc.nextLine();
            flag = input.matches(genderPattern);
        }
        return input;
    }
}
