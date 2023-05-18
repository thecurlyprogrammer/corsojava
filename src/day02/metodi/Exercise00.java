package day02.metodi;

public class Exercise00 {
    public static void main(String[] args) {
        int par1 = 2;
        int par2 = 4;

        int somma = sommaNumeri(par1, par2);
        System.out.println("Somma " + somma);
    }

    public static int sommaNumeri(int par1, int par2){
        int somma = par1 + par2;
        return somma;
    }
}
