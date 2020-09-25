package entity;

public class Customer {
    private String name;
    private String birthday;
    private String address;
    private String urlImg;

    public Customer(String name, String birthday, String address, String urlImg) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.urlImg = urlImg;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
