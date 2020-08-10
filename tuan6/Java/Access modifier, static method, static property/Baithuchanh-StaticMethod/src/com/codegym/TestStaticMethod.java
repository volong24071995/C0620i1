package com.codegym;

public class TestStaticMethod {
    public static void main(String args[]) {
        Student.change();
//khoi tao
        Student s1 = new Student(123, "Nguyen");
        Student s2 = new Student(124, "Tin");
        Student s3 = new Student(125, "Hiep");
//        goi dtuong
        s1.display();
        s2.display();
        s3.display();
    }

}
