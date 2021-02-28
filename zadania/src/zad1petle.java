import java.util.Scanner;

public class zad1petle {

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = skaner.nextInt();

        if(liczba > 0){
            System.out.println("Liczba jest większa od zera");
        }
        if(liczba < 0) {
            System.out.println("Liczba jest mniejsza od zera");
        }
            if(liczba == 0) {
                System.out.println("Liczba jest równa zero");
            }



    }
    }

