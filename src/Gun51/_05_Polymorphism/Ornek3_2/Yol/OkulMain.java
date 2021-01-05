package Gun51._05_Polymorphism.Ornek3_2.Yol;

public class OkulMain {

    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Özal","Yılmaz","Öğrenci","4A");
        Calisan cal1 = new Calisan("Faruk","Soyad","Öğretmen","Eğitim");

        Kisi.kimlikYaz(ogr1);
        System.out.println("----------------");
        Kisi.kimlikYaz(cal1);



    }
}
