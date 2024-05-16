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
            String[] ascii_V = {" __      __", " \\ \\    / /", "  \\ \\  / / ", "   \\ \\/ /  ", "    \\  /   ", "     \\/    "};
            String[] ascii_X = {" __   __", " \\ \\ / /", "  \\ V / ", "   > <  ", "  / . \\ ", " /_/ \\_\\"};
            String[] ascii_L = {"  _      ", " | |     ", " | |     ", " | |     ", " | |____ ", " |______|"};
            String[] ascii_C = {"   _____ ", "  / ____|", " | |     ", " | |     ", " | |____ ", "  \\_____|"};
            String[] ascii_D = {"  _____  ", " |  __ \\ ", " | |  | |", " | |  | |", " | |__| |", " |_____/ "};
            for (int i = 0; i < ascii_I.length; i++) {
                for (int j = 0; j < romanNumber.length(); j++) {
                    switch (romanNumber.charAt(j)) {
                    case 'I':
                        asciiNumber = asciiNumber+ascii_I[i];
                        System.out.print(ascii_I[i]);
                        break;                
                    case 'V':
                        asciiNumber = asciiNumber+ascii_V[i];
                        System.out.print(ascii_V[i]);
                        break;
                    case 'X':
                        asciiNumber = asciiNumber+ascii_X[i];
                        System.out.print(ascii_X[i]);
                        break;
                    case 'L':
                        asciiNumber = asciiNumber+ascii_L[i];
                        System.out.print(ascii_L[i]);
                        break;
                    case 'C':
                        asciiNumber = asciiNumber+ascii_C[i];
                        System.out.print(ascii_C[i]);
                        break;
                    case 'D':
                        asciiNumber = asciiNumber+ascii_D[i];
                        System.out.print(ascii_D[i]);
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