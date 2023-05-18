package day02.metodi;
import java.util.Scanner;

public class Exercise02 {

    /* Nel metodo Main chiediamo in input all'utente la lunghezza
     * della Password che si vuole generare */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire la lunghezza della Password che si vuole generare");
        int passwordSize = in.nextInt();
        String password = getNewPassword(passwordSize);
        System.out.println("La nuova Password casuale e': " + password);
    }

    /* Metodo statico getNewPassword che riceve in input la lunghezza della password
     * scelta dall'utente e dato un alfabeto genera in modo casuale la password*/
    public static String getNewPassword(int passwordSize) {
        //alphabet contiene tutti i possibili caratteri che comporranno la Password
        String alphabet = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz?!<>-*[]{}/";
        int alphabetLength = alphabet.length();
        String password = "";
        for (int i = 0; i < passwordSize; i++) {
            // Scelgo una delle lettere dell'alfabeto.
            int randomIndexCharInAlphabet = (int) (Math.random() * alphabetLength);
            password = password + alphabet.charAt(randomIndexCharInAlphabet);
        }
        return password;
    }
}
