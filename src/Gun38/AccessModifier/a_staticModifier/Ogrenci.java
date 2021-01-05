package Gun38.AccessModifier.a_staticModifier;

public class Ogrenci {

    String ad;
    String soyad;
    static String okulAd = "Yıldırım";

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    //    this.okulAd = okulAd;
    }

    void print(){

        System.out.println(ad + " " + soyad + " " + okulAd);
    }
}
