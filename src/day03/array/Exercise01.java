package day03.array;

public class Exercise01 {
    public static void main(String[] args) {
        // Dichiarazione e inizializzazione dell'array
        int[] numeri = {2, 4, 6, 8, 10};

        // Con l'uso del ciclo for, itero ogni elemento dell'array
        for (int i = 0; i < numeri.length; i++) {

            // Stampo l'elemento i-esimo dell'array
            System.out.println("Stampo il numero: " + numeri[i]);
        }
    }
}
