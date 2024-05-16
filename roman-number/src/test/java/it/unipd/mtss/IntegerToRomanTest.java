package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testNumeriFrom1To3() {
        String num1 = IntegerToRoman.convert(1);
        assertEquals("I", num1);
        String num2 = IntegerToRoman.convert(2);
        assertEquals("II", num2);
        String num3 = IntegerToRoman.convert(3);
        assertEquals("III", num3);
    }
    @Test
    public void testExceededLimit() {
        String num = IntegerToRoman.convert(4);
        assertNull(num);
    }

}