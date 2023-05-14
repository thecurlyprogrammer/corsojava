package day01.cicloFor;

import java.util.Arrays;

// Riordinamento di un array utilizzando il ciclo for
public class Exercise03 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 3, 9, 1, 6, 4, 7}; // l'array di numeri da riordinare
        int temp; // variabile temporanea per lo scambio di valori

        // ciclo for esterno per scorrere gli elementi dell'array
        for (int i = 0; i < numbers.length - 1; i++) {
            // ciclo for interno per confrontare e scambiare gli elementi
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    // scambia gli elementi di posizione
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers)); // stampa l'array riordinato
    }
}