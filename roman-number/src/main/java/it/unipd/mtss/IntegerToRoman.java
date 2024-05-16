////////////////////////////////////////////////////////////////////
// Matteo Squarzoni 2068240
// Andrea Piola 2068241
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        if (number > 3) {
            return null;
        }
        int[] values = { 1 };
        String[] romanLetters = { "I" };
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