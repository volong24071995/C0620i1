public class InformationKhachHang {
    private String name;
    private  String address;
    private String phonenumber;
    private String email;
    private boolean gender;
    private int totaloder;

    public InformationKhachHang(String name, String address, String phonenumber, String email, boolean gender, int totaloder) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.email = email;
        this.gender = gender;
        this.totaloder = totaloder;
    }

    public InformationKhachHang() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getTotaloder() {
        return totaloder;
    }

    public void setTotaloder(int totaloder) {
        this.totaloder = totaloder;
    }
}
