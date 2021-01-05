package Gun55.Ornek3;

public class YemekDunyasiMain {

    public static void main(String[] args) {

        Baklava baklava = new Baklava();
        baklava.setName("Turkisch Baklava");
        baklava.madeln();
        baklava.taste();

        Food cheeseCake = new CheeseCake();
        cheeseCake.setName("cheeseCake");
        cheeseCake.madeln();
        cheeseCake.taste();

        GreekSalad greekSalad = new GreekSalad();
        greekSalad.setName("yunan salatasi");
        greekSalad.madeln();
        greekSalad.taste();

        Salad sezarSalad = new SezarSalad();
        sezarSalad.setName("sezar salata");
        sezarSalad.madeln();
        sezarSalad.taste();
    }
}
