package day02.classiWrapper;

public class Exercise02 {
    public static void main(String[] args) {
        int value = 10;
        Integer wrappedValue = Integer.valueOf(value);
        stampaNumero(wrappedValue); // Output: 10
    }
    private static void stampaNumero(Integer number) {
        System.out.println(number);
    }
}
