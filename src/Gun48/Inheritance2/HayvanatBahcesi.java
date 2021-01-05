package Gun48.Inheritance2;

public class HayvanatBahcesi {

    public static void main(String[] args) {

        Hayvan hayvan = new Hayvan("yok",0,"genel");
        hayvan.konustu();

        Kopek kopek1 = new Kopek("beyaz",10,"köpek");
        kopek1.konustu();

        Kus kus1 = new Kus("mavi",1,"kuş");
        kus1.konustu();

        Kedi kedi = new Kedi("sarı",4,"kedi");
        kedi.konustu();
    }




}
