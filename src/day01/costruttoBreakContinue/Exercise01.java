package day01.costruttoBreakContinue;

public class Exercise01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Posizione 5 saltata");
                continue;
            }
            System.out.println("Posizione " + i);
        }
    }
}
