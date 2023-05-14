package day01.cicloDowhile;
import java.util.Scanner;

public class Exercise00 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int numero;

            do {
                System.out.println("Inserisci un numero compreso tra 1 e 10:");
                numero = input.nextInt();
            } while (numero < 1 || numero > 10);

            System.out.println("Hai inserito il numero " + numero);
        }
}
