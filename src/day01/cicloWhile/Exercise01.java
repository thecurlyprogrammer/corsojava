package day01.cicloWhile;

// Esercizio che conta il numero di iterazioni
public class Exercise01 {

        public static void main(String[] args) {

            boolean contatore = true;
            int contatoreIterazioni = 0;

            while (contatore) {
                contatoreIterazioni++;
                if (contatoreIterazioni >= 10) {
                    contatore = false;
                }
            }

            System.out.println("Numero di iterazioni: " + contatoreIterazioni);
        }

}
