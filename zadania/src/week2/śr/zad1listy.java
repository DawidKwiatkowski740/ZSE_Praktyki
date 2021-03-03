package week2.śr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class zad1listy {

    public static void main(String[] args) {

        ArrayList<String> Gry = new ArrayList<>();
        Gry.add("R6s");
        Gry.add("Fortnite");
        Gry.add("Wiedźmin");
        Gry.add("COD");
        Gry.add("Warframe");
        Gry.add("Battlefeld");
        System.out.println(Gry);

        Gry.add(4, "Terraria");
        System.out.println(Gry);

        Gry.remove("Fortnite");
        Gry.remove(5);
        System.out.println(Gry);

        Gry.set(0, "Hades");
        System.out.println(Gry);

        Collections.sort(Gry);
        System.out.println(Gry);

        Gry.clear();
        System.out.println(Gry);
    }
}
