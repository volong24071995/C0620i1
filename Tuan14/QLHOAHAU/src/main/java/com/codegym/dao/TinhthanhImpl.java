package com.codegym.dao;

import com.codegym.model.Tinhthanh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TinhthanhImpl implements TinhthanhDao {
    private  static Map<Integer,Tinhthanh> tinhthanhList;
    static {
        tinhthanhList=new HashMap<>();
        tinhthanhList.put(1,new Tinhthanh(1,"An Giang"));
        tinhthanhList.put(2,new Tinhthanh(2,"Ba ria – Vung tau"));
        tinhthanhList.put(3,new Tinhthanh(3,"Bac Giang"));
        tinhthanhList.put(4,new Tinhthanh(4,"Bac Kan"));
        tinhthanhList.put(5,new Tinhthanh(5,"Bac Lieu"));
        tinhthanhList.put(6,new Tinhthanh(6,"Bac Ninh"));
        tinhthanhList.put(7,new Tinhthanh(7,"Ben Tre"));
        tinhthanhList.put(8,new Tinhthanh(8,"Binh Dinh"));
        tinhthanhList.put(9,new Tinhthanh(9,"Binh Duong"));
        tinhthanhList.put(10,new Tinhthanh(10,"Binh Phuoc"));
        tinhthanhList.put(11,new Tinhthanh(11,"Binh Thuan"));
        tinhthanhList.put(12,new Tinhthanh(12,"Ca Mau"));
        tinhthanhList.put(13,new Tinhthanh(13,"Can Tho"));
        tinhthanhList.put(14,new Tinhthanh(14,"Cao Bang"));
        tinhthanhList.put(15,new Tinhthanh(15,"Da Nang"));
        tinhthanhList.put(16,new Tinhthanh(16,"Dak Lak"));
        tinhthanhList.put(17,new Tinhthanh(17,"Dak Nong"));
        tinhthanhList.put(18,new Tinhthanh(18,"Dien Bien"));
        tinhthanhList.put(19,new Tinhthanh(19,"Dong Nai"));
        tinhthanhList.put(20,new Tinhthanh(20,"Dong Thap"));
        tinhthanhList.put(21,new Tinhthanh(21,"Gia Lai"));
        tinhthanhList.put(22,new Tinhthanh(22,"Ha Giang"));
        tinhthanhList.put(23,new Tinhthanh(23,"Ha Nam"));
        tinhthanhList.put(24,new Tinhthanh(24,"Ha Noi"));
        tinhthanhList.put(25,new Tinhthanh(25,"Ha Tinh"));
        tinhthanhList.put(26,new Tinhthanh(26,"Hai Duong"));
        tinhthanhList.put(27,new Tinhthanh(27,"Hai Phong"));
        tinhthanhList.put(28,new Tinhthanh(28,"Hau Giang"));
        tinhthanhList.put(29,new Tinhthanh(29,"Hoa Binh"));
        tinhthanhList.put(30,new Tinhthanh(30,"Hung Yen"));
        tinhthanhList.put(31,new Tinhthanh(31,"Khanh Hoa"));
        tinhthanhList.put(32,new Tinhthanh(32,"Kien Giang"));
        tinhthanhList.put(33,new Tinhthanh(33,"Kon Tum"));
        tinhthanhList.put(34,new Tinhthanh(34,"Lai Chau"));
        tinhthanhList.put(35,new Tinhthanh(35,"Lam Dong"));
        tinhthanhList.put(36,new Tinhthanh(36,"Lang Son"));
        tinhthanhList.put(37,new Tinhthanh(37,"lao Cai"));
        tinhthanhList.put(38,new Tinhthanh(38,"Long An"));
        tinhthanhList.put(39,new Tinhthanh(39,"Nam Dinh"));
        tinhthanhList.put(40,new Tinhthanh(40,"Nghe An"));
        tinhthanhList.put(41,new Tinhthanh(41,"Ninh Binh"));
        tinhthanhList.put(42,new Tinhthanh(42,"Ninh Thuan"));
        tinhthanhList.put(43,new Tinhthanh(43,"Phu Tho"));
        tinhthanhList.put(44,new Tinhthanh(44,"Phu Yen"));
        tinhthanhList.put(45,new Tinhthanh(45,"Qunag Binh"));
        tinhthanhList.put(46,new Tinhthanh(46,"Quang Nam"));
        tinhthanhList.put(47,new Tinhthanh(47,"Quang Ngai"));
        tinhthanhList.put(48,new Tinhthanh(48,"Quang Ninh"));
        tinhthanhList.put(49,new Tinhthanh(49,"Quang Tri"));
        tinhthanhList.put(50,new Tinhthanh(50,"Soc Trang"));
        tinhthanhList.put(51,new Tinhthanh(51,"Son La"));
        tinhthanhList.put(52,new Tinhthanh(52,"Tay Ninh"));
        tinhthanhList.put(53,new Tinhthanh(53,"Thai Binh"));
        tinhthanhList.put(54,new Tinhthanh(54,"Thai Nguyen"));
        tinhthanhList.put(55,new Tinhthanh(55,"Thanh Hoa"));
        tinhthanhList.put(56,new Tinhthanh(56,"Thua Thien Hue"));
        tinhthanhList.put(57,new Tinhthanh(57,"Tien Giang"));
        tinhthanhList.put(58,new Tinhthanh(58,"Thanh pho Ho Chi Minh"));
        tinhthanhList.put(59,new Tinhthanh(59,"Tra Vinh"));
        tinhthanhList.put(60,new Tinhthanh(60,"Tuyen Quang"));
        tinhthanhList.put(61,new Tinhthanh(61,"Vinh Long"));
        tinhthanhList.put(62,new Tinhthanh(62,"Vinh Phuc"));
        tinhthanhList.put(63,new Tinhthanh(63,"Yen Bai"));
    }

    @Override
    public List<Tinhthanh> findAll() {

        return new ArrayList<>(tinhthanhList.values()) ;
    }

    @Override
    public void save(Tinhthanh tinhthanh) {

    }

    @Override
    public Tinhthanh findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Tinhthanh tinhthanh) {

    }

    @Override
    public void remove(int id) {

    }
}
