package Gun51._05_Polymorphism.Ornek1;

public class Ciftlik {

    public static void KopekSesi(Kopek kopek) {

        kopek.ses();

    }

    public static void KediSesi(Kedi kedi) {

        kedi.ses();

    }

    public static void HayvanSesi (Hayvan hayvan) {

        hayvan.ses();
    }
    //TODO
    // Polymorphism imkanı ile 2 farklı subclas dan üretilmiş nesne super class gibi biçiminde (Çok biçimlilik)
    // aynı metoda tek bir tipmiş gibi gönderilebildi buna Polymorphism (Çok biçimlilik) denir
    // üstteki metodlarla aynı yerde olması için, burada yazıldı, en doğrusu Hayvan class ında olması bu metodun.

    public static void main(String[] args) {



        Kopek kopek1 = new Kopek("Karabaş");
        Kedi kedi1 = new Kedi("Köpük");

        kopek1.ses();
        kedi1.ses();
        kopek1.kokladi();
        // referans tipi nesne tipi ile aynı olduğunda bütün özellik ve metodlar kullanılabiliyor.

        Hayvan kopek2 = new Kopek("Çomar");
        Hayvan kedi2 = new Kedi("Pamuk");

        kopek2.ses();
        kedi2.ses();
//      kopek2.kokladi();
//      sadece sub class a ait field ve metodlar bu tanımlama tipinde ulaşılamaz.

        System.out.println("---------------------------------------------");
        KopekSesi(kopek1);
        KediSesi(kedi1);

        System.out.println("---------hayvan sesi--------------------------");
        HayvanSesi(kopek1);
        HayvanSesi(kedi1);

    }
}
//    Kopek kopek1                 =    new Kopek("karabaş");
//    referans tipi Kopek               nesnenin tipi (instance) Kopek
//
//    Hayvan kopek2                =    new Kopek("çomar");
//    referans tipi Hayvan              nesnenin tipi Kopek

/*
    Çok Biçimlilik — Polymorphism
    Java’da farklı şekilde çalışan nesnelere aynı şekilde erişmek şeklinde tanımlayabiliriz.
    Diğer bir tanım olarak bir nesnenin farklı bir nesne gibi davranmasıdır…
 */

