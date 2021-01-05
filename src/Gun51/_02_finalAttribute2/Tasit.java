package Gun51._02_finalAttribute2;

public class Tasit {

    public final String model;
    public final int kapiSayisi = 4;


    public Tasit(String model) {
        this.model = model; // final tipi değişkenlere ya ilk başta ya da Constructur da değer atanabiliyor.
    }
}
