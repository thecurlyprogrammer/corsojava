package exam;

public class Exercise03 {
    public static void main(String[] args) {
        String[] nomi = {"Pippo", "Pluto", "Paperino"};
        String nomeDaCercare = "Paperino";

        for(String nome:nomi){
            if (nomeDaCercare == nome){
                System.out.println("Ho trovato " + nomeDaCercare + "!!!");
                return;
            }
        }
    }
}
