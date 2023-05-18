package day03;

public class Day3 {
    public static void main(String[] args) {

        int[] numeri = new int[3];

        numeri[0] = 5;
        numeri[1] = 3;
        numeri[2] = 9;

        int nuovaVariabile = numeri[1];

        // Dichiaro ed inizializzo due contatori che mi servono per iterare.
        int i = 0;
        int j = 0;

        // Popolo l'array ad ogni iterazione.
        while(i < numeri.length) {
            numeri[i] = i + 9;
            i++;
        }

        // Stampo il contenuto di ogni posizione.
        while(j < numeri.length) {
            System.out.println("L'elemento in posizione: " + j + " è " + numeri[j] );
            j++;
        }
    }
}
