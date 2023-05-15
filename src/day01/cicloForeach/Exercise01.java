package day01.cicloForeach;

// Esercizio che somma i numeri di un array
public class Exercise01 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 3, 4, 5};
        int somma = 0;
        for (int numero : numeri) {
            somma += numero;
        }
        System.out.println("La somma degli elementi dell'array è: " + somma);
    }
}
