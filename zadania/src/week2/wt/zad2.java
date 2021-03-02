package week2.wt;

import java.util.Arrays;
import java.util.Collections;

public class zad2 {

    public static void main(String[] args) {

        String[] stringArray = {"wham","zium","aha","haha","trach","siup","oho","hę","co","dum"};

        Arrays.sort(stringArray, Collections.reverseOrder());
          System.out.println("Sortowanie malejąco: " + Arrays.toString(stringArray));

    }

}
