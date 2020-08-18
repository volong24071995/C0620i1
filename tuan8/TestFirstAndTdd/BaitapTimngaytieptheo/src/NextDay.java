public class NextDay {
    public static String findNextDay(int day, int month,int year){
        boolean isLeapYear = isLeapYear(year);
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day==31){
                    day=1;
                    month++;
                } else if(day<31&&day>0){
                    day++;
                }else return "Loi";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day==30) {
                    day=1;
                    month++;
                }else if (day>0&& day<30){
                    day++;
                }else return "Loi";
                break;
            case 12:
                if (day==31)
                {
                    day=1;
                    month=1;
                    year++;
                }else if (day>0&&day<31){
                    day++;
                }else return "Loi";
                break;
            case 2:
                if(isLeapYear){
                    if (day == 29){
                        day = 1;
                        month++;
                    }else if (day>0&&day<29){
                        day++;
                    }else return "Loi";
                }else if (day==28){
                    day=1;
                    month++;
                }else if (day>0&&day<28){
                    day++;
                }else return "Loi";
                break;
            default:
                return "Loi";
        }
        return day+"/"+month+"/"+year;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            }
        } else {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
