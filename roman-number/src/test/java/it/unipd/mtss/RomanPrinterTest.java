package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testStampaFrom1To1000() {
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
        String printed199 = RomanPrinter.print(199);
        assertEquals("   _____  __   __   _____   _____  __   __\n" + "  / ____| \\ \\ / /  / ____| |_   _| \\ \\ / /\n" + " | |       \\ V /  | |        | |    \\ V / \n" + " | |        > <   | |        | |     > <  \n" + " | |____   / . \\  | |____   _| |_   / . \\ \n" + "  \\_____| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n", printed199);
        String printed384 = RomanPrinter.print(384);
        assertEquals("   _____    _____    _____   _       __   __ __   __ __   __  _____  __      __\n" + "  / ____|  / ____|  / ____| | |      \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\    / /\n" + " | |      | |      | |      | |       \\ V /   \\ V /   \\ V /    | |    \\ \\  / / \n" + " | |      | |      | |      | |        > <     > <     > <     | |     \\ \\/ /  \n" + " | |____  | |____  | |____  | |____   / . \\   / . \\   / . \\   _| |_     \\  /   \n" + "  \\_____|  \\_____|  \\_____| |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____|     \\/    \n", printed384);
        String printed441 = RomanPrinter.print(441);
        assertEquals("   _____   _____   __   __  _        _____ \n" + "  / ____| |  __ \\  \\ \\ / / | |      |_   _|\n" + " | |      | |  | |  \\ V /  | |        | |  \n" + " | |      | |  | |   > <   | |        | |  \n" + " | |____  | |__| |  / . \\  | |____   _| |_ \n" + "  \\_____| |_____/  /_/ \\_\\ |______| |_____|\n", printed441);
        String printed499 = RomanPrinter.print(499);
        assertEquals("   _____   _____   __   __   _____   _____  __   __\n" + "  / ____| |  __ \\  \\ \\ / /  / ____| |_   _| \\ \\ / /\n" + " | |      | |  | |  \\ V /  | |        | |    \\ V / \n" + " | |      | |  | |   > <   | |        | |     > <  \n" + " | |____  | |__| |  / . \\  | |____   _| |_   / . \\ \n" + "  \\_____| |_____/  /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n", printed499);
        String printed500 = RomanPrinter.print(500);
        assertEquals("  _____  \n" + " |  __ \\ \n" + " | |  | |\n" + " | |  | |\n" + " | |__| |\n" + " |_____/ \n", printed500);
        String printed665 = RomanPrinter.print(665);
        assertEquals("  _____     _____   _       __   __ __      __\n" + " |  __ \\   / ____| | |      \\ \\ / / \\ \\    / /\n" + " | |  | | | |      | |       \\ V /   \\ \\  / / \n" + " | |  | | | |      | |        > <     \\ \\/ /  \n" + " | |__| | | |____  | |____   / . \\     \\  /   \n" + " |_____/   \\_____| |______| /_/ \\_\\     \\/    \n", printed665);
        String printed777 = RomanPrinter.print(777);
        assertEquals("  _____     _____    _____   _       __   __ __   __ __      __  _____   _____ \n" + " |  __ \\   / ____|  / ____| | |      \\ \\ / / \\ \\ / / \\ \\    / / |_   _| |_   _|\n" + " | |  | | | |      | |      | |       \\ V /   \\ V /   \\ \\  / /    | |     | |  \n" + " | |  | | | |      | |      | |        > <     > <     \\ \\/ /     | |     | |  \n" + " | |__| | | |____  | |____  | |____   / . \\   / . \\     \\  /     _| |_   _| |_ \n" + " |_____/   \\_____|  \\_____| |______| /_/ \\_\\ /_/ \\_\\     \\/     |_____| |_____|\n", printed777);
        String printed839 = RomanPrinter.print(839);
        assertEquals("  _____     _____    _____    _____  __   __ __   __ __   __  _____  __   __\n" + " |  __ \\   / ____|  / ____|  / ____| \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\ / /\n" + " | |  | | | |      | |      | |       \\ V /   \\ V /   \\ V /    | |    \\ V / \n" + " | |  | | | |      | |      | |        > <     > <     > <     | |     > <  \n" + " | |__| | | |____  | |____  | |____   / . \\   / . \\   / . \\   _| |_   / . \\ \n" + " |_____/   \\_____|  \\_____|  \\_____| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\\n", printed839);
        String printed999 = RomanPrinter.print(999);
        assertEquals("   _____   __  __  __   __   _____   _____  __   __\n" + "  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\n" + " | |      | \\  / |  \\ V /  | |        | |    \\ V / \n" + " | |      | |\\/| |   > <   | |        | |     > <  \n" + " | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \n" + "  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\n", printed999);
        String printed1000 = RomanPrinter.print(1000);
        assertEquals("  __  __ \n" + " |  \\/  |\n" + " | \\  / |\n" + " | |\\/| |\n" + " | |  | |\n" + " |_|  |_|\n", printed1000);
    }
    @Test
    public void testExceededLimit() {
        String printed = RomanPrinter.print(1001);
        assertEquals(null, printed); 
    }

}