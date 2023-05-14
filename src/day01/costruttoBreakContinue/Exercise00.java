package day01.costruttoBreakContinue;

public class Exercise00 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("E' stata trovata la posizione 5");
                break;
            }
            System.out.println("Posizione " + i);
        }
    }
}
