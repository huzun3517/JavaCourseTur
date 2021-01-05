package Gun51._05_Polymorphism.Ornek3_2.Yol;

public class Kisi {

    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        this.ad = ad;
        this.soyad = soyad;
        this.gorevi = gorevi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    public void bilgileriYaz(){
        System.out.println("Ad: " + this.ad );
        System.out.println("Soyada: " +this.soyad);
        System.out.println("Görevi: " +this.gorevi);
    }


    public static void kimlikYaz(Object object){  // todo Object nesnesi alt sınıflara kendisini referans gösteriyor.

        if (object instanceof Calisan){ // todo object hangi sınıftan onu kontrol ediyoruz.
            Calisan calisan = (Calisan) object;
            calisan.bilgileriYaz();
        }

        else if (object instanceof Ogrenci){ // todo objectimiz Ogrenci ise
            Ogrenci ogrenci = (Ogrenci) object; // todo objectimiz ogrenci fakat tür dönüşümü yapmamız gerekiyor.
            ogrenci.bilgileriYaz();
        }

        else if (object instanceof Kisi) {
            Kisi kisi = (Kisi) object;
            kisi.bilgileriYaz();
        }

    }
// todo parametre olarak kişi gönderince java direk anlayabiliyordu. Fakat objeckt dediğimiz için onun hangi sınıftan
//  olduğunun kontrolünü yapmamız gerekiyor.

}
