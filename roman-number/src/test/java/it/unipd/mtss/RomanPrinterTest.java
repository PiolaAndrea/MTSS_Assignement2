package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testStampaFrom1To100() {
        String printed1 = RomanPrinter.print(1);
        assertEquals("  _____ \n" + " |_   _|\n" + "   | |  \n" + "   | |  \n" + "  _| |_ \n" + " |_____|\n", printed1);
        String printed2 = RomanPrinter.print(2);
        assertEquals("  _____   _____ \n" + " |_   _| |_   _|\n" + "   | |     | |  \n" + "   | |     | |  \n" + "  _| |_   _| |_ \n" + " |_____| |_____|\n", printed2);
        String printed3 = RomanPrinter.print(3);
        assertEquals("  _____   _____   _____ \n" + " |_   _| |_   _| |_   _|\n" + "   | |     | |     | |  \n" + "   | |     | |     | |  \n" + "  _| |_   _| |_   _| |_ \n" + " |_____| |_____| |_____|\n", printed3);
        String printed4 = RomanPrinter.print(4);
        assertEquals("  _____  __      __\n" + " |_   _| \\ \\    / /\n" + "   | |    \\ \\  / / \n" + "   | |     \\ \\/ /  \n" + "  _| |_     \\  /   \n" + " |_____|     \\/    \n", printed4);
        String printed5 = RomanPrinter.print(5);
        assertEquals(" __      __\n" + " \\ \\    / /\n" + "  \\ \\  / / \n" + "   \\ \\/ /  \n" + "    \\  /   \n" + "     \\/    \n", printed5);
        String printed6 = RomanPrinter.print(6);
        assertEquals(" __      __  _____ \n" + " \\ \\    / / |_   _|\n" + "  \\ \\  / /    | |  \n" + "   \\ \\/ /     | |  \n" + "    \\  /     _| |_ \n" + "     \\/     |_____|\n", printed6);
        String printed7 = RomanPrinter.print(7);
        assertEquals(" __      __  _____   _____ \n" + " \\ \\    / / |_   _| |_   _|\n" + "  \\ \\  / /    | |     | |  \n" + "   \\ \\/ /     | |     | |  \n" + "    \\  /     _| |_   _| |_ \n" + "     \\/     |_____| |_____|\n", printed7);
        String printed8 = RomanPrinter.print(8);
        assertEquals(" __      __  _____   _____   _____ \n" + " \\ \\    / / |_   _| |_   _| |_   _|\n" + "  \\ \\  / /    | |     | |     | |  \n" + "   \\ \\/ /     | |     | |     | |  \n" + "    \\  /     _| |_   _| |_   _| |_ \n" + "     \\/     |_____| |_____| |_____|\n", printed8);
        String printed9 = RomanPrinter.print(9);
        assertEquals("  _____  __   __\n" + " |_   _| \\ \\ / /\n" + "   | |    \\ V / \n" + "   | |     > <  \n" + "  _| |_   / . \\ \n" + " |_____| /_/ \\_\\\n", printed9);
        String printed10 = RomanPrinter.print(10);
        assertEquals(" __   __\n" + " \\ \\ / /\n" + "  \\ V / \n" + "   > <  \n" + "  / . \\ \n" + " /_/ \\_\\\n", printed10);
        String printed14 = RomanPrinter.print(14);
        assertEquals(" __   __  _____  __      __\n" + " \\ \\ / / |_   _| \\ \\    / /\n" + "  \\ V /    | |    \\ \\  / / \n" + "   > <     | |     \\ \\/ /  \n" + "  / . \\   _| |_     \\  /   \n" + " /_/ \\_\\ |_____|     \\/    \n", printed14);
        String printed19 = RomanPrinter.print(19);
        assertEquals(" __   __  _____  __   __\n" + " \\ \\ / / |_   _| \\ \\ / /\n" + "  \\ V /    | |    \\ V / \n" + "   > <     | |     > <  \n" + "  / . \\   _| |_   / . \\ \n" + " /_/ \\_\\ |_____| /_/ \\_\\\n", printed19);
        String printed20 = RomanPrinter.print(20);
        assertEquals(" __   __ __   __\n" + " \\ \\ / / \\ \\ / /\n" + "  \\ V /   \\ V / \n" + "   > <     > <  \n" + "  / . \\   / . \\ \n" + " /_/ \\_\\ /_/ \\_\\\n", printed20);
        String printed33 = RomanPrinter.print(33);
        assertEquals(" __   __ __   __ __   __  _____   _____   _____ \n" + " \\ \\ / / \\ \\ / / \\ \\ / / |_   _| |_   _| |_   _|\n" + "  \\ V /   \\ V /   \\ V /    | |     | |     | |  \n" + "   > <     > <     > <     | |     | |     | |  \n" + "  / . \\   / . \\   / . \\   _| |_   _| |_   _| |_ \n" + " /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| |_____| |_____|\n", printed33);
        String printed49 = RomanPrinter.print(49);
        assertEquals(" __   __  _        _____  __   __\n" + " \\ \\ / / | |      |_   _| \\ \\ / /\n" + "  \\ V /  | |        | |    \\ V / \n" + "   > <   | |        | |     > <  \n" + "  / . \\  | |____   _| |_   / . \\ \n" + " /_/ \\_\\ |______| |_____| /_/ \\_\\\n", printed49);
        String printed50 = RomanPrinter.print(50);
        assertEquals("  _      \n" + " | |     \n" + " | |     \n" + " | |     \n" + " | |____ \n" + " |______|\n", printed50);
        String printed76 = RomanPrinter.print(76);
        assertEquals("  _       __   __ __   __ __      __  _____ \n" + " | |      \\ \\ / / \\ \\ / / \\ \\    / / |_   _|\n" + " | |       \\ V /   \\ V /   \\ \\  / /    | |  \n" + " | |        > <     > <     \\ \\/ /     | |  \n" + " | |____   / . \\   / . \\     \\  /     _| |_ \n" + " |______| /_/ \\_\\ /_/ \\_\\     \\/     |_____|\n", printed76);
        String printed99 = RomanPrinter.print(99);
        assertEquals(" __   __   _____   _____  __   __\n" + " \\ \\ / /  / ____| |_   _| \\ \\ / /\n" + "  \\ V /  | |        | |    \\ V / \n" + "   > <   | |        | |     > <  \n" + "  / . \\  | |____   _| |_   / . \\ \n" + " /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n", printed99);
        String printed100 = RomanPrinter.print(100);
        assertEquals("   _____ \n" + "  / ____|\n" + " | |     \n" + " | |     \n" + " | |____ \n" + "  \\_____|\n", printed100);
    }
    @Test
    public void testExceededLimit() {
        String printed = RomanPrinter.print(101);
        assertEquals(null, printed); 
    }

}