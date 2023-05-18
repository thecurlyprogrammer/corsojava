package exam;

public class Exercise01 {
    public static void main(String[] args) {
        int giornoSettimana = 5;
        String nomeGiorno;

        switch (giornoSettimana){
            case 1:
                nomeGiorno = "Lunedi";
                break;
            case 2:
                nomeGiorno = "Martedi";
                break;
            case 3:
                nomeGiorno = "Mercoledi";
                break;
            case 4:
                nomeGiorno = "Giovedi";
                break;
            case 5:
                nomeGiorno = "Venerdi";
                break;
            case 6:
                nomeGiorno = "Sabato";
                break;
            case 7:
                nomeGiorno = "Domenica";
                break;
            default:
                nomeGiorno = "Non è un giorno della settimana";
                break;
        }

        System.out.println("Il numero " + giornoSettimana + " corrisponde a " + nomeGiorno);
    }
}
