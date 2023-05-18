package day03.array;

public class Exercise03 {
    public static void main(String[] args) {
        int[] numeri = {4,8,2,5,1};

        int somma = 0;

        for (int i = 0; i < numeri.length; i++) {
            somma = somma + numeri[i];
        }

        System.out.println(somma);
    }
}
