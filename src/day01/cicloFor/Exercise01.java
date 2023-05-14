package day01.cicloFor;

// Somma i numeri pari da 1 a 100
public class Exercise01 {
    public static void main(String[] args) {
        int sum = 0; // variabile per la somma dei numeri pari

        // ciclo for per scorrere tutti i numeri da 1 a 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i; // se il numero corrente è pari, lo aggiunge alla somma
            }
        }

        System.out.println("La somma dei numeri pari da 1 a 100 è " + sum); // stampa il risultato
    }
}