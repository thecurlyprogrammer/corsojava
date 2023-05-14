package day01.costruttoSwitchcase;

public class Exercise00 {
    public static void main(String[] args) {

        int numero = 1;
        String nomeNumero;

        switch (numero) {
            case 1:
                nomeNumero = "Uno";
                break;
            case 2:
                nomeNumero = "Due";
                break;
            default:
                nomeNumero = "Numero non valido";
                break;
        }

        System.out.println("Il numero " + numero + " corrisponde a " + nomeNumero);
    }
}
