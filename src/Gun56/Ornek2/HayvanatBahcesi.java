package Gun56.Ornek2;

import java.time.LocalDate;

public class HayvanatBahcesi {

    public static void main(String[] args) {

        int sayac = 1;

        Kedi kedi = new Kedi();
  //    kedi.setId();
        kedi.setIsim("Köpük");
        kedi.setDogumTarih(LocalDate.of(2018,1,5));
        kedi.setVahsi(false);
        System.out.println(kedi);

        System.out.println("----------------------------------");

        kedi.yiyecegi();
        kedi.yemekMiktari();
        kedi.gunlukUykuSuresi();
        kedi.sesi();

        System.out.println("----------------------------------");

        Kartal kartal = new Kartal();
    //  kartal.setId();
        kartal.setIsim("Gezgin");
        kartal.setDogumTarih(LocalDate.of(2019,1,5));
        kartal.setVahsi(true);
        System.out.println(kartal);

        System.out.println("----------------------------------");

        kartal.yiyecegi();
        kartal.yemekMiktari();
        kartal.gunlukUykuSuresi();
        kartal.sesi();

        System.out.println("-----------------------------------");

        Hayvan hayvan = new Kedi();
        hayvan.setIsim("Tekir");
        hayvan.setDogumTarih(LocalDate.of(2020,1,5));
        hayvan.setVahsi(false);
        System.out.println(hayvan);

        System.out.println("-----------------------------------");

        hayvan.yiyecegi();
        hayvan.yemekMiktari();
        hayvan.gunlukUykuSuresi();
        hayvan.sesi();

        System.out.println(Hayvan.sayac);








    }
}
