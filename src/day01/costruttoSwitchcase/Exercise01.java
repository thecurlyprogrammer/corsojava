package day01.costruttoSwitchcase;

public class Exercise01 {
    public static void main(String[] args) {
        int mese = 12;
        int giorni;

        switch (mese) {
            case (4):
            case (6):
            case (9):
            case (11):
                giorni = 30;
                break;
            case (2):
                giorni = 28;
                break;
            default:
                giorni = 31;
        }
        System.out.println("Il mese " + mese + " ha " + giorni + " giorni.");
    }
}
