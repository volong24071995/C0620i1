import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static final String XEM_DANH_SACH = "Xem danh sách:";
    public static final String THEM_MOI = "Thêm mới:";
    public static final String CAP_NHAT = "Cập nhât:";
    public static final String XÓA = "Xóa:";
    public static final String TIM_KIEM = "Tìm kiếm:";
    public static final String ĐOC_TU_FILE = "Đọc từ file:";
    public static final String GHI_VAO_FILE = "Ghi vào file:";
    public static final String THOÁT = "Thoát!";
    public static final String CHON_CHUC_NANG = "Chọn chức năng theo số(để tiếp tục):";
    public static final String CHUONG_TRINH = "----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----";
    public static final String NHAP_SO_ĐIEN_THOAI = "Nhập số điện thoại:";
    public static final String NHAP_SAI = "Nhập sai!";
    public static final String NHAP_GIOI_TINH = "Nhập giới tính:";
    public static final String NHẬP_HỌ_TÊN = "Nhập họ tên:";
    public static final String NHẬP_ĐỊA_CHỈ = "Nhập địa chỉ:";
    public static final String NHẬP_NGÀY_SINH = "Nhập ngày sinh:";
    public static final String NHẬP_EMAIL = "Nhập email:";
    public static final String NHẬP_NHÓM_DANH_BẠ = "Nhập nhóm danh bạ:";
    public static final String NHAP_LUA_CHON = "Nhap lua chon";
    public static final String VUI_LÒNG_NHẬP_LẠI = "Vui lòng nhập lại:";
    static ManagementPhonebook phonebooks = new ManagementPhonebook();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            menu();
            System.out.println(NHAP_LUA_CHON);
            String chose=sc.nextLine();
            switch (chose){
                case "1":
                    System.out.println(XEM_DANH_SACH);
                    getAllPhoneBook();
                    break;
                case "2":
                    System.out.println(THEM_MOI);
                    addPhoneBook();
                    break;
                case "3":
                    System.out.println(CAP_NHAT);
                    editPhonebook();
                    break;
                case "4":
                    System.out.println(XÓA);
                    deletePhonebook();
                    break;
                case "5":
                    System.out.println(TIM_KIEM);
                    searchPhoneNumber();
                    break;
                case "6":
                    System.out.println(ĐOC_TU_FILE);
                    readFilePhoneBook();
                    break;
                case "7":
                    System.out.println(GHI_VAO_FILE);
                    writeFilePhoneBook();
                    break;
                case "8":
                    System.out.println(THOÁT);
                    System.exit(8);
            }
        }
    }

    public static void menu() {
        System.out.println(CHUONG_TRINH);
        System.out.println(CHON_CHUC_NANG);
        System.out.println("1."+XEM_DANH_SACH);
        System.out.println("2."+THEM_MOI);
        System.out.println("3."+CAP_NHAT);
        System.out.println("4."+XÓA);
        System.out.println("5."+TIM_KIEM);
        System.out.println("6."+ĐOC_TU_FILE);
        System.out.println("7."+GHI_VAO_FILE);
        System.out.println("8."+ THOÁT);
    }

    public static void getAllPhoneBook(){
        phonebooks.getAll();
    }

    public static void addPhoneBook() {
        Phonebook phonebook = new Phonebook();
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = validatePhone();
        phonebook.setPhoneNumber(phoneNumber);
        System.out.println(NHẬP_NHÓM_DANH_BẠ);
        String group = validateLetters();
        phonebook.setGroup(group);
        System.out.println(NHẬP_HỌ_TÊN);
        String name = validateLetters();
        phonebook.setName(name);
        System.out.println(NHAP_GIOI_TINH);
        String gender = validateGender();
        phonebook.setGender(gender);
        System.out.println(NHẬP_ĐỊA_CHỈ);
        String address = validateLetters();
        phonebook.setAddress(address);
//        validate
        System.out.println(NHẬP_NGÀY_SINH);
        String birthDate = sc.nextLine();
        phonebook.setBirthDate(birthDate);
        System.out.println(NHẬP_EMAIL);
        String email = validateEmail();
        phonebook.setEmail(email);
        phonebooks.add(phonebook);
    }

    public static void editPhonebook() {
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = sc.nextLine();
        phonebooks.edit(phoneNumber);
    }

    public static void deletePhonebook() {
        System.out.println(NHAP_SO_ĐIEN_THOAI);
        String phoneNumber = sc.nextLine();
        phonebooks.delete(phoneNumber);
    }

    public static void readFilePhoneBook(){
        phonebooks.readFile();
    }

    public static void writeFilePhoneBook(){
        phonebooks.writeFile();
    }

    public static void searchPhoneNumber(){
        System.out.println(NHẬP_HỌ_TÊN);
        String name = sc.nextLine();
        phonebooks.contains(name);
    }
    //validate
    public static String validateGender() {
        boolean flag;
        String input = sc.nextLine();
        String genderPattern = "Nam|Nữ|nam|nữ|NAM|NỮ";
        flag = input.matches(genderPattern);
        while (!flag) {
            System.out.println(NHAP_SAI+ NHAP_GIOI_TINH);
            input = sc.nextLine();
            flag = input.matches(genderPattern);
        }
        return input;
    }

    public static String validatePhone() {
        boolean flag;
        String input = sc.nextLine();
        String phonePattern = "\\d{3}\\d{7}";
        flag = input.matches(phonePattern);
        while (!flag){
            System.out.println(NHAP_SAI +NHAP_SO_ĐIEN_THOAI);
            input = sc.nextLine();
            flag = input.matches(phonePattern);
        }
        return input;
    }

    public static String validateEmail() {
        String email = sc.nextLine();
        String EMAIL_PATTERN =
                "^[a-zA-Z][\\w-]+@gmail.com$";
        while (!Pattern.matches(EMAIL_PATTERN, email)) {
            System.out.println(NHAP_SAI+NHẬP_EMAIL);
            email = sc.nextLine();
        }
        return email;
    }

    public static String validateLetters() {
        String name=sc.nextLine();
        String regxName = "^[a-zA-Z]{2,}(?: [a-zA-Z]+)?(?: [a-zA-Z]+)?$";
        while (!Pattern.matches(regxName, name)) {
            System.out.println(NHAP_SAI+ VUI_LÒNG_NHẬP_LẠI);
            name = sc.nextLine();
        }
        return name;


    }
}
