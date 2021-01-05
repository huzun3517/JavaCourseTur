package Gun49.task1;

public class Cember extends Sekil {

    private double yariCap;

    public Cember(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    public double getCevre() {
        return 2 * Math.PI * this.yariCap;
    }

    @Override
    public String toString() {
        return "Cember{" +
                "yariCap=" + yariCap +
                " Cevre=" + getCevre() +
                '}';
    }
}
