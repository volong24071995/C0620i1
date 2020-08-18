public class ReadNumber {
    public static String read(int number) {
        String result = "";
        if (number < 10&&number>0) {
            result=docHangDonVi(number);
        }else if(number==10) {
            result="mười";
        }else {
            int hangChuc = number / 10;
            int hangDonvi = number % 10;
            result = docHangChuc(hangChuc) +" "+docHangDonVi(hangDonvi);
        }
        return result;
    }

    public static String docHangDonVi(int number) {
        String result = "";
        switch (number) {
            case 0:
                result="mươi";
            case 1:
                result = "một";
                break;
            case 2:
                result = "hai";
                break;
            case 3:
                result = "ba";
                break;
            case 4:
                result = "bốn";
                break;
            case 5:
                result = "năm";
                break;
            case 6:
                result = "sáu";
                break;
            case 7:
                result = "bảy";
                break;
            case 8:
                result = "tám";
                break;
            case 9:
                result = "chín";
                break;
        }
        return result;
    }

    public static String docHangChuc(int number) {
        String result = "";
        switch (number) {
            case 1:
                result="mười";
                break;
            case 2:
                result = "hai";
                break;
            case 3:
                result = "ba";
                break;
            case 4:
                result = "bốn";
                break;
            case 5:
                result = "năm";
                break;
            case 6:
                result = "sáu";
                break;
            case 7:
                result = "bảy";
                break;
            case 8:
                result = "tám";
                break;
            case 9:
                result = "chín";
                break;
        }
        return result;
    }
}
