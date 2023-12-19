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

        scanner.close();
    }

    public static int lunghezza(String stringa) {
        int result = stringa.length();
        return result;
    }

    public static String toLowercaseString(String stringa) {
        return stringa.toLowerCase();
    }

}
