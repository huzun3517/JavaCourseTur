package Gun48.Inheritance3;

public class GenelMudur extends Calisan {

    double tazminat;

    public GenelMudur(String ismi, double maas, int maasKatsayisi, double tazminat) {
        super(ismi, maas, maasKatsayisi);
        this.tazminat = tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maas * super.maasKatsayisi*this.tazminat;
       // return super.maasHesapla()*this.tazminat;
    }

    @Override
    public String toString() {

        return super.toString() + " " + "tazminat=" + this.tazminat;
    }

    /*
    @Override
    public String toString() {
        return "GenelMudur{" + "ismi=" + getIsmi() +
                " tazminat=" + tazminat +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }
     */


}
