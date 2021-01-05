package Gun56.Ornek2;

public class Kedi extends Hayvan {

    @Override
    void yiyecegi() {
        System.out.println(getIsim() + " mama veya balık yer");
    }

    @Override
    void yemekMiktari() {
        System.out.println(getIsim() + " ün yemek miktarı 100gr");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println(getIsim() + " ün gunluk uyku süresi 10 saat");

    }

    @Override
    void sesi() {
        System.out.println(getIsim() + " miyav diye ses çıkarır");

    }
}
