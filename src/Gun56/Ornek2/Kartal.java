package Gun56.Ornek2;

public class Kartal extends Hayvan {

    @Override
    void yiyecegi() {

        System.out.println(getIsim() + " et yer");
    }

    @Override
    void yemekMiktari() {
        System.out.println(getIsim() + " günde 1 kuş yer");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println(getIsim() + " ın gunluk uyku süresi 8 saat");

    }

    @Override
    void sesi() {
        System.out.println(getIsim() + " ciyak ciyak diye ses çıkarır");

    }
}
