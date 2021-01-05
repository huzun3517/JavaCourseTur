package Gun55.Ornek2;

public class Cember extends Sekil {

    private int yaricap;

    public Cember(String name, int yaricap) {
        super(name);
        this.yaricap = yaricap;
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        return Math.round(Math.PI * yaricap * yaricap);
    }

    @Override
    public double cevre() {
        return Math.round(2 * Math.PI * yaricap);
    }
}
