import java.util.Scanner;

public class CustomerManagement {
    private String name;
    private  String address;
    private String phoneNumber;
    private String email;
    private boolean gender;
    private int totaloder;

    public CustomerManagement(String name, String address, String phoneNumber, String email, boolean gender, int totaloder) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.totaloder = totaloder;
    }

    public CustomerManagement() {
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

    public int getTotaloder() {
        return totaloder;
    }

    public void setTotaloder(int totaloder) {
        this.totaloder = totaloder;
    }

    public CustomerManagement inputCustomer(){
        System.out.println("Nhập tên:");

    }
}
