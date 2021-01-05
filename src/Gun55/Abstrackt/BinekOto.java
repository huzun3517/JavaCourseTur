package Gun55.Abstrackt;

// todo abstract anahtar kelimesi ile abstract class oluşturmuş oluyoruz.
public abstract class BinekOto {

    private String marka;
    private int uretimYili;
    private int vitesAdedi;

    // implemente edilmek zorunda
    public abstract String getMarka(); // todo Soyut sınıf oluşturduk. Gövdesiz Method demek bu.

    // ister override yapılabilir, istenirse yapılmayabilir.
    public int getUretimYili() { // todo gövdeli Metod--> içeriği var.

        return this.uretimYili;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public int getVitesAdedi() {
        return vitesAdedi;
    }

    public void setVitesAdedi(int vitesAdedi) {
        this.vitesAdedi = vitesAdedi;
    }
}
