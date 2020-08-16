public class Customer{

    private String name;
    private  String address;
    private String phoneNumber;
    private String email;
    private boolean gender;
    private int totalOder;
    Customer(){};
    public Customer(String name, String address, String phoneNumber, String email, boolean gender) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.totalOder = 0;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getTotalOder() {
        return totalOder;
    }

    public void setTotalOder(int totalOder) {
        this.totalOder = totalOder;
    }

    @Override
    public String toString(){
        return "Khach hang "+getName() +", Dia chi:"+getAddress()
                +", Email: "+getEmail()
                +" , Sdt: "+getPhoneNumber()
                +", Gioi tinh: "+isGender();
    }
}

