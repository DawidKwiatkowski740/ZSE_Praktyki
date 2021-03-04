package week2.czw;

interface piecPiekacz{
    void pieczenieCiastek();
    void pieczenieChleba();
}
interface piecGrill{
    void pieczenieKurczaka();
}

public class piec implements piecPiekacz,piecGrill {

    private int czas;
    private int temp;

    @Override
    public void pieczenieCiastek() {
        czas = 30;
        temp = 120;
        wlacz();
    }

    @Override
    public void pieczenieChleba() {
        czas = 60;
        temp = 80;
        wlacz();
    }

    @Override
    public void pieczenieKurczaka() {
        czas = 120;
        temp = 100;
        wlacz();
    }

    private void wlacz() {
        System.out.println("Wlaczamy piec " +
                " ustawiamy temperature na: " + temp
                + "czas trwania na: " + czas + "minut");
    }

    public static void main(String[] args) {
    piec piec = new piec();

        piecPiekacz piecPiekacz = piec;
        piecGrill piecGrill = piec;

   piecPiekacz.pieczenieCiastek();
   piecPiekacz.pieczenieChleba();
   piecGrill.pieczenieKurczaka();

    }



}
