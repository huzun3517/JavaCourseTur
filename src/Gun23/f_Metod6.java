package Gun23;

public class f_Metod6 {

    public static void main(String[] args) {

        ortalamaBulYaz("Ali", 60, 80, 85, 95, 100, 60);
        ortalamaBulYaz("Mehmet", 60, 75, 55, 90);
        ortalamaBulYaz("Ayşe", 65, 70, 75);
        ortalamaBulYaz("Ömer", 60, 80, 85, 95, 60);
        // kural 1...icerde sadece bir int olabilir
    }

    // ... ile ilgili 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2-Her zaman en sonda olmalı
    public static void ortalamaBulYaz(String isim, int... notlar) {

        double toplam = 0;

        for (int not: notlar) {  //foreach yazdik buraya bu ytuzden kisa hali

            toplam+= not;
        }
        System.out.println(isim + " " + toplam/notlar.length);
        // return =gelen sonucu kullanacagimiz zaman kullaniyoruz
        //burda gelen sonuc yok bu yuzden kullanmadik...return kullanmadigimiz icin void yazili kaldi



    }
}
