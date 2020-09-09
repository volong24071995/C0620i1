import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementPhonebook {
    public static final String KHONG_TIM_THAY = "Khong tim thay";
    public static final String GHI_VÀO_THÀNH_CÔNG = "Ghi vào thành công";
    public static final String ĐỌC_THÀNH_CÔNG = "Đọc thành công";
    public static final String XÓA_THÀNH_CÔNG = "Xóa thành công";
    public static final String BẠN_CÓ_MUỐN_XÓA_KHÔNG = "Bạn có muốn xóa không";
    public static final String UPDATE_THÀNH_CÔNG = "Update thành công";
    public static final String NHẬP_NHÓM_DANH_BẠ = "Nhập nhóm danh bạ:";
    public static final String ĐÃ_TỒN_TẠI = "Đã tồn tại";
    public static final String DELETE = "Delete";
    List<Phonebook> phonebooks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

//sualai
    public void getAll(){
        for (Phonebook phonebook:phonebooks) {
            System.out.print(phonebook.toString());
        }
    }

    public void add(Phonebook phonebook) {
        if (checkPhone(phonebook.getPhoneNumber()) >= 0) {
            System.out.println(ĐÃ_TỒN_TẠI);
        } else {
            phonebooks.add(phonebook);
            System.out.println(UPDATE_THÀNH_CÔNG);
        }
    }

    public void edit(String phoneNumber) {
        var index = checkPhone(phoneNumber);
        if (index >= 0) {
            var phonebook = phonebooks.get(index);
            System.out.println(NHẬP_NHÓM_DANH_BẠ);
            String group = Main.validateLetters();
            phonebook.setGroup(group);
            System.out.println(Main.NHẬP_HỌ_TÊN);
            String name = Main.validateLetters();
            phonebook.setName(name);
            System.out.println(Main.NHAP_GIOI_TINH);
            String gender = Main.validateGender();
            phonebook.setGender(gender);
            System.out.println(Main.NHẬP_ĐỊA_CHỈ);
            String address = Main.validateLetters();
            phonebook.setAddress(address);
            System.out.println(Main.NHẬP_NGÀY_SINH);
            String birthDate = sc.nextLine();
            phonebook.setBirthDate(birthDate);
            System.out.println(Main.NHẬP_EMAIL);
            String email = Main.validateEmail();
            phonebook.setEmail(email);
            System.out.println(UPDATE_THÀNH_CÔNG);
        } else {
            System.out.println(KHONG_TIM_THAY);
        }
    }

    public void delete(String phoneNumber) {
        var index = checkPhone(phoneNumber);
        if (index >= 0) {
            boolean check = true;
            System.out.println(BẠN_CÓ_MUỐN_XÓA_KHÔNG);
            System.out.println("Y."+ DELETE);
            System.out.println("Enter."+Main.THOÁT);
            while (check) {
                String chose = sc.nextLine();
                switch (chose.toUpperCase()) {
                    case "Y":
                        phonebooks.remove(index);
                        System.out.println(XÓA_THÀNH_CÔNG);
                        check=false;
                        break;
                    default:
                        check = false;
                }
            }
        } else System.out.println(KHONG_TIM_THAY);
    }

    public void readFile() {
        phonebooks=IOBanary.ReaderFile();
        System.out.println(ĐỌC_THÀNH_CÔNG);
    }

    public void writeFile() {
        IOBanary.WriteFile(phonebooks);
        System.out.println(GHI_VÀO_THÀNH_CÔNG);
    }

    public int checkPhone(String phoneNumber) {
        for (int i = 0; i < phonebooks.size(); i++) {
            if (phoneNumber.equals(phonebooks.get(i).getPhoneNumber())) {
                System.out.println(phonebooks.get(i).toString());
                return i;
            }
        }
        return -1;
    }

    public void contains(String name){
        boolean check=false;
        for (Phonebook phonebook:phonebooks) {
            if (phonebook.getName().contains(name)){
                check=true;
                System.out.print(phonebook.toString());
            }
        }
        if (!check){
            System.out.println(KHONG_TIM_THAY);
        }
    }
}
