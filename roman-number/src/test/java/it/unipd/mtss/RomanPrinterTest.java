package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testStampaFrom1To3() {
        String printed1 = RomanPrinter.print(1);
        assertEquals("  _____ \n" + " |_   _|\n" + "   | |  \n" + "   | |  \n" + "  _| |_ \n" + " |_____|\n", printed1);
        String printed2 = RomanPrinter.print(2);
        assertEquals("  _____   _____ \n" + " |_   _| |_   _|\n" + "   | |     | |  \n" + "   | |     | |  \n" + "  _| |_   _| |_ \n" + " |_____| |_____|\n", printed2);
        String printed3 = RomanPrinter.print(3);
        assertEquals("  _____   _____   _____ \n" + " |_   _| |_   _| |_   _|\n" + "   | |     | |     | |  \n" + "   | |     | |     | |  \n" + "  _| |_   _| |_   _| |_ \n" + " |_____| |_____| |_____|\n", printed3);
    }
    @Test
    public void testExceededLimit() {
        String printed = RomanPrinter.print(4);
        assertEquals(null, printed); 
    }

}