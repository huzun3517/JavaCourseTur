package Gun56.Ornek2;

import java.time.LocalDate;

public abstract class Hayvan {

    static int sayac = 0;

    private String isim;
    private boolean vahsi;
    private LocalDate dogumTarih;
    private int id;

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

     Hayvan() {

        sayac++;
        setId();

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public LocalDate getDogumTarih() {
        return dogumTarih;
    }

    public void setDogumTarih(LocalDate dogumTarih) {
        this.dogumTarih = dogumTarih;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = sayac;
    }

    @Override
    public String toString() {
        return "Hayvan: " + getClass().getSimpleName() +
                "\nid=" + id +
                "\nisim=" + isim +
                "\nvahsi=" + vahsi +
                "\ndogumTarih=" + dogumTarih;
    }
}
