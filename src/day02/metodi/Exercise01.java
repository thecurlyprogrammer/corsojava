package day02.metodi;

public class Exercise01 {
    public class CalcolaAreaRettangolo {
        public static int calcolaArea(int lunghezza, int larghezza) {
            int area = lunghezza * larghezza;
            return area;
        }

        public static void stampaArea(int area) {
            System.out.println("L'area del rettangolo è: " + area);
        }

        public static void main(String[] args) {
            int lunghezza = 5;
            int larghezza = 10;
            int area = calcolaArea(lunghezza, larghezza);
            stampaArea(area);
        }
    }
}
