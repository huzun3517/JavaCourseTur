package Gun51._05_Polymorphism.Ornek1;

public class Kedi extends Hayvan {

    public Kedi(String turu) {
        super(turu);
    }

    @Override
    public void ses() {
        System.out.println("miyavladı");
    }
}
