package week3.pn.zadania;

public class zad5pon {

    public static class Weapons{
        public void Spust(){
            System.out.println("Kill \n");
        }
    }
    public static class Rifles extends Weapons{
        public void Spust2(){
            System.out.println("ratatatatatatatatata  \n");
        }


    }
    public static class M4 extends Rifles{
        public static void Spust3() {
            System.out.println("tra tra tra tra tra \n");
        }
    }

    public static void main(String[] args) {
        Rifles Rifles = new Rifles();
        Rifles.Spust();
        Rifles.Spust2();
        M4.Spust3();
    }

}
