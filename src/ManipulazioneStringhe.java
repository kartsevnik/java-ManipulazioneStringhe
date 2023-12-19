import java.util.Scanner;

public class ManipulazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.next();

        int lunghezza = lunghezza(stringa);
        System.out.println("Lunghezza di stringa e: " + lunghezza);

        String toLowercaseString = toLowercaseString(stringa);
        System.out.println("String in lowercase: " + toLowercaseString);

        String lastTwoSymbols = getLastTwoSymbols(stringa);
        System.out.println("Last 2 symbols: " + lastTwoSymbols);

        scanner.close();
    }

    public static int lunghezza(String stringa) {
        int result = stringa.length();
        return result;
    }

    public static String toLowercaseString(String stringa) {
        return stringa.toLowerCase();
    }

    public static String getLastTwoSymbols(String stringa) {
        int lunghezza = lunghezza(stringa);
        char lastSymbol = stringa.charAt(lunghezza - 1);
        char prelastSymbol = stringa.charAt(lunghezza - 2);
        String result = "" + prelastSymbol + lastSymbol;
        return result;
    }

}
