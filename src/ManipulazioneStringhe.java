import java.util.Scanner;

public class ManipulazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.next();

        String toUppercase = toUppercaseString(stringa);
        System.out.println("Stringa in Uppercase e: " + toUppercase);

        scanner.close();
    }

    public static String toUppercaseString(String stringa) {
        return stringa.toUpperCase();

    }

}
