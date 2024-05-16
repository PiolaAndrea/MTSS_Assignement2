////////////////////////////////////////////////////////////////////
// Matteo Squarzoni 2068240
// Andrea Piola 2068241
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if (number > 50) {
            return null;
        }
        int[] values = { 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLetters = { "L", "XL", "X", "IX", "V", "IV", "I" };
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