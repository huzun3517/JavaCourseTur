package Gun23;

public class a_Metod1 {

    public static void main(String[] args) {

        System.out.println("Merhaba Dünya 1");
        System.out.println("Merhaba Dünya 2");
        merhabaYaz();

        int ebn = Math.max(3,4); // 2 sayıdan en büyüğünü bulup
        int enbTurkce = enBuyukBul(3,4);
        System.out.println(enbTurkce);

        AdSoyadBirlestir("Ali","Demir");
        // burda birleşmiş haline ulaşabiliyor muyum şu anda?

        String adsoyad = AdSoyadBirlestir("Ali","Demir");
        System.out.println("adsoyad = " + adsoyad);
        // burda birleşmiş haline ulaşabiliyormuyum şu anda, return yaptığımda geri alabildim.




    }

    public static void merhabaYaz() {

        System.out.println("Merhaba Dünya");
    }

    public static int enBuyukBul(int a, int b) {

        if (a > b)
            return a;
        else
            return b;
    }

    public static String AdSoyadBirlestir(String ad, String soyad) {

   //     System.out.println(ad + " " + soyad);
    //    burda sadece yazdırıyoruz

        return ad + " " + soyad;
    }



}
