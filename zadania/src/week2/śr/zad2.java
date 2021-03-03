package week2.śr;

public class zad2 {

    public static void main(String[] args) {

        int[][][][] tab = new int[3][3][3][3];
        int value = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        tab[i][j][k][l] = value;
                        value = value + 2;
                        System.out.print(tab[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }

            }
        }
    }
}
