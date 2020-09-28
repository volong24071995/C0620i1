package com.codegym.model;

public class MissWorld {
    private String name;
    private String dob;
    private String address;
    private String phone;
    private String email;
    private String identityCard;
    private String job;
    private String educationalLevel;
    private String nation;
    private String workUnit;
    private float height;
    private float weight;
    private String gifted;
    private String image;
    private String tinh="";
    private String status="No";

    public MissWorld(String name, String dob, String address, String phone, String email, String identityCard, String job, String educationalLevel, String nation, String workUnit, float height, float weight, String gifted, String image, String tinh) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.identityCard = identityCard;
        this.job = job;
        this.educationalLevel = educationalLevel;
        this.nation = nation;
        this.workUnit = workUnit;
        this.height = height;
        this.weight = weight;
        this.gifted = gifted;
        this.image = image;
        this.tinh=tinh;
    }

    public MissWorld() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getGifted() {
        return gifted;
    }

    public void setGifted(String gifted) {
        this.gifted = gifted;
    }

    public String getImage() {
        return image;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
