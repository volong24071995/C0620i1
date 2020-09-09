public class Phonebook {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String birthDate;
    private String gender;
    private String group;

    public Phonebook(String name, String phoneNumber, String address, String email, String birthDate, String gender, String group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.birthDate = birthDate;
        this.gender = gender;
        this.group = group;
    }

    public Phonebook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString(){
        return name+","+gender+","+phoneNumber+","+address+","+email+","+ birthDate +","+group+"\n";
    }
}
