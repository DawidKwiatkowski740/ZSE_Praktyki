import java.util.Scanner;

public class zad4petle {

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
                if (b > c) {
                    System.out.println("Kolejność malejąca: ");
                }
            }
            {
                if (a < b) {
                    if (b < c) {
                        System.out.println("Kolejność rosnąca: ");
                    }
                    else {
                            System.out.println("Brak kolejności: ");
                        }
                        }
                    }


                }
            }
        }




