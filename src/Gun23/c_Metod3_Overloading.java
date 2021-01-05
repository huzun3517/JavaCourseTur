package Gun23;

public class c_Metod3_Overloading {
    // Metodlarda Overloading

    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2 = 6;
        int sayi3 = 78;

        // parametre sayısından ve tipi farklı olduğu durumlarda aynı metod adı kullanılabilir.
        int sonuc = toplam(sayi1,sayi2);
        int sonuc2 = toplam(sayi1,sayi2,sayi3);

        double dSayi1 = 5.2;
        double dSayi2 = 6.4;

        double sonuc3 = toplam(dSayi1,dSayi2);

        // parametrelerin tip sırası farklı olduğunda da aynı isim kullanılabilir.

        KullaniciBilgiYaz(34,"Ahmet");
        KullaniciBilgiYaz("Ahmet",34);


    }

    public static int toplam(int a, int b) {

        return a + b;
    }

    public static int toplam(int a, int b, int c) {

        return a + b + c;
    }

    public static double toplam(double a, double b) {

        return a + b;
    }

    public static String KullaniciBilgiYaz(int yas, String ad) {

        System.out.println(ad+" "+yas);
        return ad+" "+yas;


    }

    public static String KullaniciBilgiYaz(String ad, int yas) {

        System.out.println(ad+" "+yas);
        return ad+" "+yas;

    }
}
