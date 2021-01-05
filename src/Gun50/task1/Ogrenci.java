package Gun50.task1;

public class Ogrenci extends Kisi {

    private double okulUcret;


    public Ogrenci(String isim, String adres, Okul okul, UyeTipi uyeTipi, double okulUcret) {
        super(isim, adres, okul, uyeTipi);
        setOkulUcret(okulUcret);
    }

    public double getOkulUcret() {
        return okulUcret;
    }

    public void setOkulUcret(double okulUcret) {
        this.okulUcret = okulUcret;
    }

    @Override
    public String toString() {
        return super.toString() + " " + getOkulUcret();
    }
}
