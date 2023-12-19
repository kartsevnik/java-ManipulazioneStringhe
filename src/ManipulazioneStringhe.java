import java.util.Scanner;

public class ManipulazioneStringhe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String stringa = scanner.next();

        String lunghezza = lunghezza(stringa);
        System.out.println("Lunghezza di stringa e: " + lunghezza);

        scanner.close();
    }

}
