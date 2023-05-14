package day01.cicloFor;

// Somma i numeri pari da 1 a 100
public class Exercise00 {
    public static void main(String[] args) {
        int sum = 0; // variabile per la somma dei numeri

        // ciclo for per scorrere tutti i numeri da 1 a 100
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("La somma dei numeri da 1 a 100 è " + sum);
    }
}