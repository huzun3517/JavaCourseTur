package Gun48.Inheritance3;

public class Firma  {

    public static void main(String[] args) {
        
        Calisan calisan1 = new Calisan("Mehmet",2000,2);
        System.out.println("calisan1.toString() = " + calisan1.toString());
        System.out.println("calisan1.maasHesapla() = " + calisan1.maasHesapla());
        
        GenelMudur genelMudur = new GenelMudur("Ayşe",6000,2,3);
        System.out.println("genelMudur.maasHesapla() = " + genelMudur.maasHesapla());
        System.out.println("genelMudur.toString() = " + genelMudur.toString());


    }
}
