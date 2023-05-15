package day01.cicloFor;

public class Exercise04 {
    public static void main(String[] args) {
        String password = "mypassword"; // la password da criptare
        String encryptedPassword = ""; // la password criptata

        // ciclo for per scorrere tutti i caratteri della password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // il carattere corrente

            // calcola il valore ASCII del carattere incrementando di 1 il valore ASCII originale
            int encryptedCharCode = (int) c + 1;

            // se il valore ASCII supera il valore ASCII di 'z', si riavvolge fino al valore ASCII di 'a'
            if (encryptedCharCode > (int) 'z') {
                encryptedCharCode = (int) 'a';
            }

            // aggiunge il carattere criptato alla password criptata
            encryptedPassword += (char) encryptedCharCode;
        }

        System.out.println("La password criptata è: " + encryptedPassword); // stampa il risultato
    }
}