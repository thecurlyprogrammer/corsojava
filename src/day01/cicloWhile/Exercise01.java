package day01.cicloWhile;

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
