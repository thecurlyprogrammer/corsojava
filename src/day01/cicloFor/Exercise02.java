package day01.cicloFor;

// Conta quante occorrenze ci sono di una Stringa
public class Exercise02 {
    public static void main(String[] args) {
        String inputString = "corsojava"; // la stringa di input
        int count = 0; // contatore delle occorrenze

        // ciclo for per scorrere tutte le lettere della stringa
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'o') {
                count++; // incrementa il contatore se la lettera corrente è 'o'
            }
        }

        System.out.println("La lettera 'o' compare " + count + " volte nella stringa."); // stampa il risultato
    }
}