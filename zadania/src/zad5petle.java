import java.util.Scanner;

public class zad5petle {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj liczbę A: ");
        int a = skaner.nextInt();

        System.out.print("Podaj liczbę B: ");
        int b = skaner.nextInt();

        System.out.print("Podaj swój wybór (1(+),2(-),3(*),4(/)): ");
        int x = skaner.nextInt();

        switch (x){
            case 1:
                System.out.println("Dodawanie: ");
                int sum = a+b;
                System.out.println("Dodawanie: " + sum);
                break;
            case 2:
                System.out.println("Odejmowanie: ");
                sum = a-b;
                System.out.println("Wynik: " + sum);
                break;
            case 3:
                System.out.println("Mnożenie: ");
                sum = a*b;
                System.out.println("Wynik: " + sum);
                break;
            case 4:
                System.out.println("Dzielenie: ");
                sum = a/b;
                System.out.println("Wynik: " + sum);
                break;
                default:
                System.out.println("Nie wybrano poprawnej opcji.");
                break;
        }
    }
}
