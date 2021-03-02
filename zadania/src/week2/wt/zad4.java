package week2.wt;

import java.util.Random;

public class zad4 {

    public static void main(String[] args) {



         String[] stringArray ={"Spagett","Lazania","Hamburger","Jajecznica z boczkiem","Kebab","Pierogi","Kanapka","Nic","Buła"};
         Random rand = new Random();

         int Potrawa1 = rand.nextInt(stringArray.length);
         System.out.println("Śniadanie: " + stringArray[Potrawa1]);

        int Potrawa2 = rand.nextInt(stringArray.length);
        System.out.println("Obiad: " + stringArray[Potrawa2]);

        int Potrawa3 = rand.nextInt(stringArray.length);
        System.out.println("Kolacja: " + stringArray[Potrawa3]);


    }

}
