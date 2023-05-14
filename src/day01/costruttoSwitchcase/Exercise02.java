package day01.costruttoSwitchcase;

public class Exercise02 {
    public static void main(String[] args) {
        String mese = "Dicembre";
        int giorni;

        switch (mese) {
            case ("Aprile"):
            case ("Giugno"):
            case ("Settembre"):
            case ("Novembre"):
                giorni = 30;
                break;
            case ("Febbraio"):
                giorni = 28;
                break;
            default:
                giorni = 31;
        }
        System.out.println("Il mese di " + mese + " ha " + giorni + " giorni.");
    }
}
