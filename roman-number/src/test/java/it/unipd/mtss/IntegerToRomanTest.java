package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testNumeriFrom1To1000() {
        String num1 = IntegerToRoman.convert(1);
        assertEquals("I", num1);
        String num2 = IntegerToRoman.convert(2);
        assertEquals("II", num2);
        String num3 = IntegerToRoman.convert(3);
        assertEquals("III", num3);
        String num4 = IntegerToRoman.convert(4);
        assertEquals("IV", num4);
        String num5 = IntegerToRoman.convert(5);
        assertEquals("V", num5);
        String num6 = IntegerToRoman.convert(6);
        assertEquals("VI", num6);
        String num7 = IntegerToRoman.convert(7);
        assertEquals("VII", num7);
        String num8 = IntegerToRoman.convert(8);
        assertEquals("VIII", num8);
        String num9 = IntegerToRoman.convert(9);
        assertEquals("IX", num9);
        String num10 = IntegerToRoman.convert(10);
        assertEquals("X", num10);
        String num14 = IntegerToRoman.convert(14);
        assertEquals("XIV", num14);
        String num19 = IntegerToRoman.convert(19);
        assertEquals("XIX", num19);
        String num20 = IntegerToRoman.convert(20);
        assertEquals("XX", num20);
        String num33 = IntegerToRoman.convert(33);
        assertEquals("XXXIII", num33);
        String num49 = IntegerToRoman.convert(49);
        assertEquals("XLIX", num49);
        String num50 = IntegerToRoman.convert(50);
        assertEquals("L", num50);
        String num76 = IntegerToRoman.convert(76);
        assertEquals("LXXVI", num76);
        String num99 = IntegerToRoman.convert(99);
        assertEquals("XCIX", num99);
        String num100 = IntegerToRoman.convert(100);
        assertEquals("C", num100);
        String num199 = IntegerToRoman.convert(199);
        assertEquals("CXCIX", num199);
        String num384 = IntegerToRoman.convert(384);
        assertEquals("CCCLXXXIV", num384);
        String num441 = IntegerToRoman.convert(441);
        assertEquals("CDXLI", num441);
        String num499 = IntegerToRoman.convert(499);
        assertEquals("CDXCIX", num499);
        String num500 = IntegerToRoman.convert(500);
        assertEquals("D", num500);
        String num665 = IntegerToRoman.convert(665);
        assertEquals("DCLXV", num665);
        String num777 = IntegerToRoman.convert(777);
        assertEquals("DCCLXXVII", num777);
        String num839 = IntegerToRoman.convert(839);
        assertEquals("DCCCXXXIX", num839);
        String num999 = IntegerToRoman.convert(999);
        assertEquals("CMXCIX", num999);
        String num1000 = IntegerToRoman.convert(1000);
        assertEquals("M", num1000);
    }
    @Test
    public void testExceededLimit() {
        String num = IntegerToRoman.convert(1001);
        assertNull(num);
    }

}