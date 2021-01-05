package Gun37.instanceModifiers.d_protectedModifier.same;

public class Doktor {

    protected String ad;

    protected Doktor(){

    }

    public Doktor(String ad) {

        this.ad = ad;
    }

    protected void print(){

        System.out.println("ad = " + ad);
    }
}
