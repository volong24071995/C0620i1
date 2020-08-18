import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void typeTriangle222() {
        int a=2;
        int b=2;
        int c=2;
        String example="Equilateral Triangle";
        String result=Triangle.typeTriangle(a,b,c);
        assertEquals(example,result);
    }

    @Test
    void typeTriangle223() {
        int a=2;
        int b=2;
        int c=3;
        String example="Isosceles Triangle";
        String result=Triangle.typeTriangle(a,b,c);
        assertEquals(example,result);
    }
    @Test
    void typeTriangle345() {
        int a=3;
        int b=4;
        int c=5;
        String example="Normal Triangle";
        String result=Triangle.typeTriangle(a,b,c);
        assertEquals(example,result);
    }

    @Test
    void typeTriangle823() {
        int a=8;
        int b=2;
        int c=3;
        String example="Not a Triangle";
        String result=Triangle.typeTriangle(a,b,c);
        assertEquals(example,result);
    }

    @Test
    void typeTriangleNegative121() {
        int a=-1;
        int b=2;
        int c=1;
        String example="Not a Triangle";
        String result=Triangle.typeTriangle(a,b,c);
        assertEquals(example,result);
    }

    @Test
    void typeTriangleNegative011() {
        int a=0;
        int b=1;
        int c=1;
        String example="Not a Triangle";
        String result=Triangle.typeTriangle(a,b,c);
        assertEquals(example,result);
    }
}