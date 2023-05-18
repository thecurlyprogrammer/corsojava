package day02.variabili;

public class Exercise01 {
    public class EsempioLocale {
        public void metodo() {
            int numero = 10; // Variabile locale
            System.out.println(numero);
        }
    }

    public class EsempioIstanza {
        int numero; // Variabile di istanza

        public void metodo() {
            numero = 10; // Accesso alla variabile di istanza
            System.out.println(numero);
        }
    }
}
