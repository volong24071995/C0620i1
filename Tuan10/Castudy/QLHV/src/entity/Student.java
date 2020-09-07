package entity;

import java.text.DecimalFormat;

public class Student {
    private String name;
    private String gender;
    private String phoneNumber;
    private int id;
    private double kTraMieng;
    private double kTra15p;
    private double kTra1Tiet;
    private double kTraHocKi;

    public double getTbMon() {
        var TbMonFormat = String.format("%.2f", (kTraMieng + kTra15p + kTra1Tiet * 2 + kTraHocKi * 3) / 7);
        double tbMon = Double.parseDouble(TbMonFormat);
        return tbMon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getkTraMieng() {
        return kTraMieng;
    }

    public void setkTraMieng(double kTraMieng) {
        this.kTraMieng = kTraMieng;
    }

    public double getkTra15p() {
        return kTra15p;
    }

    public void setkTra15p(double kTra15p) {
        this.kTra15p = kTra15p;
    }

    public double getkTra1Tiet() {
        return kTra1Tiet;
    }

    public void setkTra1Tiet(double kTra1Tiet) {
        this.kTra1Tiet = kTra1Tiet;
    }

    public double getkTraHocKi() {
        return kTraHocKi;
    }

    public void setkTraHocKi(double kTraHocKi) {
        this.kTraHocKi = kTraHocKi;
    }

    public Student(String name,String gender,String phoneNumber) {
        this.name = name;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return id + "," + name + ","+ gender + ","+ phoneNumber + ","
                + kTraMieng + "," + kTra15p + "," + kTra1Tiet + "," + kTraHocKi + ","
                + this.getTbMon() + "\n";
    }
}
