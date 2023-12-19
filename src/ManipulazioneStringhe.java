import java.util.Scanner;

public class ManipulazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.next();

        char firstSymbol = getfirstSymbol(stringa);
        System.out.println("FirstSymbol di stringa e: " + firstSymbol);

        scanner.close();
    }

    public static char getfirstSymbol(String stringa) {
        return stringa.charAt(0);
    }

}
