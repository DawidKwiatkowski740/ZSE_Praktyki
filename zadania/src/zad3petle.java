import java.util.Scanner;

public class zad3petle {


    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        String Login = "Admin";
        String Hasło = "Komputer";
        String Admin = "Admin";
        String Komputer = "Komputer";

        System.out.println("Podaj login: ");
         Login = skaner.toString();

        if (Login.equals(Admin)) {
            System.out.println("Zalogowano pomyślnie");
        } else {
            System.out.println("Użytkownik niezautoryzowany");
        }

        System.out.println("Podaj hasło: ");
        Hasło = skaner.toString();

        if (Hasło.equals(Komputer)) {
            System.out.println("Zalogowano pomyślnie");
        } else {
            System.out.println("Użytkownik niezautoryzowany");
        }
    }
}
