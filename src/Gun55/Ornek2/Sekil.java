package Gun55.Ornek2;

public abstract class Sekil {

    private String name;

    public Sekil(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();
    public abstract double cevre();

    public void ciz(){

        System.out.println(this.name + " cizildi...");
    }

    @Override
    public String toString() {
        return "ismi = " + this.name +
                "\n Alanı = " + Math.round(this.alan()) +
                "\n Cevre = " + Math.round(this.cevre());
    }

    public String toString2() {

        String formatliCevre = String.format("%-10.2f" , this.cevre());
        // todo toplam 10 hane noktadan sonra ise 2 hane
        // todo - ise sola dayalı yazar

        return "ismi = " + this.name +
                "\n Alanı = " + Math.round(this.alan() )+
                "\n Cevre = " + formatliCevre;
    }




}