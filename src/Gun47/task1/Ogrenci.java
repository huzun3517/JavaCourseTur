package Gun47.task1;

public class Ogrenci {

    private String ad,soyad;
    private int yas;

    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
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

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {

        if (yas > 15){
            throw new RuntimeException("Kayit için yaş siniri 15 dir...");
        }

        this.yas = yas;




    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
