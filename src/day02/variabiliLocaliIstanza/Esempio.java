package day02.variabiliLocaliIstanza;


    public class Esempio {
        int variabileIstanza; // Variabile di istanza

        public void metodo() {
            int variabileLocale = 10; // Variabile locale
            variabileIstanza = 20; // Accesso alla variabile di istanza
            System.out.println("Variabile locale: " + variabileLocale);
            System.out.println("Variabile di istanza: " + variabileIstanza);
        }

        public static void main(String[] args) {
            Esempio esempio = new Esempio();
            esempio.metodo();
        }
    }


