import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void findNextDay112018() {
        int day=1;
        int month=1;
        int year=2018;
        String example="2/1/2018";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }

    @Test
    void findNextDay3112018() {
        int day=31;
        int month=1;
        int year=2018;
        String example="1/2/2018";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }

    @Test
    void findNextDay3042018() {
        int day=30;
        int month=4;
        int year=2018;
        String example="1/5/2018";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }

    @Test
    void findNextDay162018() {
        int day=1;
        int month=6;
        int year=2018;
        String example="2/6/2018";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }

    @Test
    void findNextDay31122018() {
        int day=31;
        int month=12;
        int year=2018;
        String example="1/1/2019";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }

    @Test
    void findNextDay31112018() {
        int day=31;
        int month=11;
        int year=2018;
        String example="Loi";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }

    @Test
    void findNextDay31132018() {
        int day=31;
        int month=13;
        int year=2018;
        String example="Loi";
        assertEquals(example,NextDay.findNextDay(day,month,year));
    }
}