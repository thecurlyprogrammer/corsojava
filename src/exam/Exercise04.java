package exam;

public class Exercise04 {
    public static void main(String[] args) {
        String email = "mariorossi@gmail.com";
        String password = "password";

        boolean resultEmail = checkEmail(email);
        boolean resultPassword = checkPassword(password);

        if (resultEmail == true && resultPassword == true) {
            System.out.println("Benvenuto " + email);
        } else {
            System.out.println("Ritenta...");
        }

    }

    public static boolean checkEmail(String email){
        String databaseEmail = "mariorossi@gmail.com";
        if (email == databaseEmail){
            return true;
        } else {
            System.out.println("La mail inserita non è corretta.");
            return false;
        }
    }

    public static boolean checkPassword(String password){
        String databasePassword = "password";
        if (password == databasePassword){
            return true;
        } else {
            System.out.println("La password inserita non è corretta.");
            return false;
        }
    }
}
