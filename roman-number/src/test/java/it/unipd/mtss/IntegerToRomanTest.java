package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testNumeriFrom1To10() {
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
    }
    @Test
    public void testExceededLimit() {
        String num = IntegerToRoman.convert(11);
        assertNull(num);
    }

}