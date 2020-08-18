import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void translate3() {
        int number=3;
        String example="Fizz Fizz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translate5() {
        int number=5;
        String example="Buzz Buzz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translate15() {
        int number=15;
        String example="FizzBuzz Buzz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }
    void translate30() {
        int number=30;
        String example="FizzBuzz Fizz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translateNot3Not5() {
        int number=52;
        String example="năm hai Buzz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translateHave3() {
        int number=13;
        String example="mười ba Fizz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }
    @Test
    void translateHave31() {
        int number=31;
        String example="ba một Fizz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translateHave5() {
        int number=52;
        String example="năm hai Buzz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translateHave53() {
        int number=53;
        String example="năm ba Fizz Buzz";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translate0() {
        int number=0;
        String example="Loi";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

    @Test
    void translateNegative3() {
        int number=-3;
        String example="Loi";
        String result=FizzBuzz.translate(number);
        assertEquals(example,result);
    }

}