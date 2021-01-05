package Gun55.Ornek2;

public class Dikdortgen extends Sekil {

    private double uzunluk;
    private double genislik;

    public Dikdortgen(String name, double uzunluk, double genislik) {
        super(name);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alan() {
        return this.uzunluk * this.genislik;
    }

    @Override
    public double cevre() {
        return (this.uzunluk + this.genislik) *2;
    }
}
