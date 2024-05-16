////////////////////////////////////////////////////////////////////
// Matteo Squarzoni 2068240
// Andrea Piola 2068241
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if (number > 500) {
            return null;
        }
        int[] values = { 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLetters = { "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        String roman = "";
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number = number - values[i];
                roman = roman + romanLetters[i];
            }
        }
        return roman;
    }
}