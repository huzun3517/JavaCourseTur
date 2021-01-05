package Gun49.task1;

public class GeometriMain {
    //TODO
    // 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
    // Shape(Sekil)
    // Circle (bu türün alan hesaplaması yok) (Cember)
    // Rectangle (Dikdortgen)
    // Square (Kare)
    // 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
    // 3- Her bir sınıfa consructor ekleyiniz.
    // 4- Her metodun toStringini override yapınız.
    // 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
    // 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
    // 7- En üst sınıfta , türetilen sınıflarda uygun metodu olamayan sınıflar için hata mesajı ürettiriniz.

    public static void main(String[] args) {
        
        Dikdortgen dd = new Dikdortgen(4,5);
        System.out.println("Dikdörtgen = " + dd); // oto toString çalışır.

        Kare kare = new Kare(6);
        System.out.println("kare = " + kare);

        System.out.println("*******************************");
        Cember cember = new Cember(3);
        System.out.println("cember = " + cember);

        System.out.println("cember.getCevre() = " + Math.round(cember.getCevre()));

        try {
            System.out.println("cember.getAlan() = " + cember.getAlan());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}