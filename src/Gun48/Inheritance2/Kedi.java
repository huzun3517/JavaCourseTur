package Gun48.Inheritance2;

public class Kedi extends Hayvan {


    public Kedi(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        System.out.println("Miyavladı...");
    }
}
