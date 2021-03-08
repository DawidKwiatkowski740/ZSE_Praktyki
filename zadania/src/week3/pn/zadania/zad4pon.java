package week3.pn.zadania;

class Human{
    private int BD;
    private String name;
    private int kg;

    public int getBD(){
        return BD;
    }
    public void setBD(int BD){
        this.BD = BD;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getkg(){
        return kg;
    }
    public void setkg(int kg){
        this.kg = kg;
    }
}

public class zad4pon {

    public static void main(String[] args) {

        Human A = new Human();
        A.setBD(12);
        A.setName("Bob");
        A.setkg(75);
        System.out.println(A.getBD() + "\n " + A.getName() + "\n " + A.getkg());

    }

}