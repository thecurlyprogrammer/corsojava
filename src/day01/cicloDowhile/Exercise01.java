package day01.cicloDowhile;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Inserisci un numero intero positivo: ");
            numero = input.nextInt();
        } while (numero <= 0);

        System.out.println("Il numero inserito è: " + numero);
    }
}