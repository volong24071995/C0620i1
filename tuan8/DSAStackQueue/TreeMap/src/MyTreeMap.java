import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
        String text = "Văn bản là một loại hình phương tiện để ghi nhận, lưu giữ và truyền đạt các thông tin từ chủ thể này sang chủ thể khác bằng ký hiệu gọi là chữ viết. Nó gồm tập hợp các câu có tính trọn vẹn về nội dung, hoàn chỉnh về hình thức, có tính liên kết chặt chẽ và hướng tới một mục tiêu giao tiếp nhất định";
        myMap.put("là", check(text,"là"));
        myMap.put("văn", check(text,"văn"));
        myMap.put("l", check(text,"l"));
        System.out.println(myMap);
    }
    public static int check(String str, String text){
        int count = 0;
        Pattern p = Pattern.compile(text);
        Matcher m = p.matcher(str.toLowerCase());
        while (m.find()) {
            count++;
        }
        return count;
    }

}
