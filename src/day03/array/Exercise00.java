package day03.array;

public class Exercise00 {
    public static void main(String[] args) {
        // Dichiaro ed inizializzo un array di tipo int di grandezza 3.
        int[] array = new int[3];

        // Ad array in posizione 0 assegno il valore 1 e cosi via.
        array[0] = 1;
        array[1] = 2;
        array[3] = 3;

        // Stampo il valore in posizione 3
        System.out.println(array[2]); // Nota bene l'indice parte da zero.
    }
}
