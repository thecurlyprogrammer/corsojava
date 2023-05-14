package day01.costruttoBreakContinue;

public class Exercise02 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                System.out.println("Iterazione 5 saltata");
                continue;
            }
            if (i == 8) {
                System.out.println("Iterazione 8 interrotta");
                break;
            }
            System.out.println("Iterazione " + i);
        }
        System.out.println("Fine del ciclo");
    }
}
