import java.util.Scanner;

public class zad2petle {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj liczbę A: ");
        int a = skaner.nextInt();

        System.out.print("Podaj liczbę B: ");
        int b = skaner.nextInt();

        System.out.print("Podaj liczbę C: ");
        int c = skaner.nextInt();

        {
            if (a > b) {
            if (a > c) {
                System.out.println("Największą liczba jest a: ");
            }
            }
        }
        {
            if (b > c) {
            if (b > a) {
                System.out.println("Największą liczba jest b: ");
            }
            }
        }
        {
            if (c > a) {
                if (c > b) {
                    System.out.println("Największą liczba jest c: ");
                }
            }
        }
    }
}


