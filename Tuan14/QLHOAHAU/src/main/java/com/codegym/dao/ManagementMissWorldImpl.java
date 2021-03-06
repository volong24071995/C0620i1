package com.codegym.dao;

import com.codegym.model.MissWorld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagementMissWorldImpl implements ManagementMissWorldDAO {
    private static Map<String,MissWorld> missWorldMap=new HashMap();
    static {
        missWorldMap.put("192047789", new MissWorld("Vo Thi Mai Phuong","1996-07-01","Phu Bai","0971206095","maiphuong@gmail.com","192047789","Student","Cao Dang","Kinh","CDYT Hue", (float) 1.8, (float) 60.5,"Hat,mua","https://congthuong.vn/stores/news_dataimages/mn_ty/012020/20/13/x0447_IMG-8988.jpg.pagespeed.ic.NrISitU0AJ.jpg","Hue"));
    }


    @Override
    public List<MissWorld> findAll() {
        return new ArrayList<>(missWorldMap.values());
    }

    @Override
    public void save(MissWorld missWorld) {
        missWorldMap.put(missWorld.getIdentityCard(),missWorld);
    }

    @Override
    public MissWorld findById(String identityCard) {
        return missWorldMap.get(identityCard) ;
    }

    @Override
    public void update(String identityCard, MissWorld missWorld) {
        missWorldMap.put(identityCard, missWorld);
    }

    @Override
    public void remove(String identityCard) {
        missWorldMap.remove(identityCard);
    }

    public boolean check(String cmnd, String email,String sdt){
        List<MissWorld> list=this.findAll();
        for (MissWorld missWorld:list){
            if (missWorld.getIdentityCard().equals(cmnd)||missWorld.getEmail().equals(email)||missWorld.getPhone().equals(sdt)){
                return true;
            }
        }
        return false;
    }

}
