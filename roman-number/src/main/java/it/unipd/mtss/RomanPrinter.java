////////////////////////////////////////////////////////////////////
// Matteo Squarzoni 2068240
// Andrea Piola 2068241
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber){
        if(romanNumber != null)
        {
            String asciiNumber = "";
            String[] ascii_I = {"  _____ ", " |_   _|", "   | |  ", "   | |  ", "  _| |_ ", " |_____|" };
            for (int i = 0; i < ascii_I.length; i++) {
                for (int j = 0; j < romanNumber.length(); j++) {
                    switch (romanNumber.charAt(j)) {
                    case 'I':
                        asciiNumber = asciiNumber+ascii_I[i];
                        System.out.print(ascii_I[i]);
                        break;                
                    }
                }
                asciiNumber = asciiNumber+'\n';
                System.out.println();
            }
            return asciiNumber;
        }
        else
        {
            System.out.println("Errore, hai inserito un numero troppo grande");
            return null;
        }
    }
}