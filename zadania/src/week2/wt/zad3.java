package week2.wt;

import java.util.Random;

public class zad3 {

    public static void main(String[] args) {

       String[] stringArray ={"Burek","Łapa","ArnoldSchwarzenegger"};

    Random rand = new Random();
    int rand_pies = rand.nextInt(stringArray.length);
    System.out.println("Nazwa psa to: " + stringArray[rand_pies]);




    }

}
