package exam;

public class Exercise02 {
    public static void main(String[] args) {
        int base = 10;
        int altezza = 30;
        int area;

        area = calcolaArea(base, altezza);
        stampaArea(area);
    }

    public static int calcolaArea(int base, int altezza){
        int area = (base * altezza) / 2;
        return area;
    }

    public static void stampaArea(int area) {
        System.out.println(area);
    }
}
