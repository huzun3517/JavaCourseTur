package Gun53._02_Interfaces.task1;

public class Test {

    public static void main(String[] args) {

        Dikdortgen dd = new Dikdortgen();
        int cevreDD = dd.cevresi(4,5);
        int alanDD = dd.alanı(4,5);
        System.out.println("cevreDD = " + cevreDD);
        System.out.println("alanDD = " + alanDD);
        System.out.println("-----------------------");
        
        Cember cem = new Cember();
        int cevreCem = cem.cevresi(5);
        int alanCem = cem.alanı(5);
        System.out.println("cevreCem = " + cevreCem);
        System.out.println("alanCem = " + alanCem);
        System.out.println("-----------------------");

        Kare kare = new Kare();
        int cevreKare = kare.cevresi(5);
        int alanKare = kare.alanı(5);
        System.out.println("cevreKare = " + cevreKare);
        System.out.println("alanKare = " + alanKare);
        System.out.println("-----------------------");       
        
        ISekil sekil = new Kare(); // Polymorphism
        int cevre = sekil.cevresi(5);
        int alan = sekil.alanı(5);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
        
    }
}

