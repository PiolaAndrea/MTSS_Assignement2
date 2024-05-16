package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testNumeriFrom1To6() {
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
    }
    @Test
    public void testExceededLimit() {
        String num = IntegerToRoman.convert(7);
        assertNull(num);
    }

}