package service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryService {
    private static Map<String,String> list=new HashMap<>();
    static {
        list.put("book","sach");
        list.put("standard","tieu chuan");
        list.put("section ","khu vuc");
        list.put("stelae","bia da");
        list.put("data","du lieu");
        list.put("bacteria","vi khuan");
        list.put("dice","suc sac");
        list.put("sheep","con cuu");
    }

    public String findOne(String key){
        return list.get(key);
    }
}
