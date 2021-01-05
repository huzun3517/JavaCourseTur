package Gun33.b_tasks.task2;
import java.util.ArrayList;
public class Main {
    //TODO
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınıfı ayrı dosyada : adı Lesson, fields: name,credit (1-3)
    // 2- Öğrenci Sınıfı ayrı dosyada : adı : Student, fields : name, maxCredit, dersleri listesini tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız. alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış olan dersleri ekleyiniz.
    // ders eklerken max alabileceği Crediyi geçmemeli, geçerse uyarı versin, alabileceğiniz max credi doldu şeklinde
    // 6- Aşağıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında bir metod oluşturunuz.
    // 7- Öğrenciye ders ekleme bölümünü yine ilgili sınıfta bir metod olarak yazınız.

    public static void main(String[] args) {
    //    Lesson math = Lesson.createLesson("Math",4);

       /* Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit = 3;

        Lesson java101 = new Lesson();
        java101.name = "Java Programming";
        java101.credit = 6;

        Lesson fizik101 = new Lesson();
        fizik101.name = "Fizik";
        fizik101.credit = 4;

        Student ogrenci1 = new Student();
        ogrenci1.name = "Kemal";
        ogrenci1.maxCredit = 10;

        ogrenci1.dersListesi = new ArrayList<>();

        //buraya kontrol konacak toplam aldığı krediye bakılarak
        // Eklenecek ders ile öğrencinin o ana kadarki kredisi toplamı
        // öğrencinin alabileceği max krediyi aşmıyorsa ekle
        if (ogrenci1.totalCredit()+mat101.credit < ogrenci1.maxCredit){
            ogrenci1.dersListesi.add(mat101);
        }
        else {
            System.out.println("Alabileceğiniz Kredi miktarı doldu.");
        }

        if (ogrenci1.totalCredit()+java101.credit < ogrenci1.maxCredit){
            ogrenci1.dersListesi.add(java101);
        }
        else {
            System.out.println("Alabileceğiniz Kredi miktarı doldu.");
        }

        if (ogrenci1.totalCredit()+fizik101.credit < ogrenci1.maxCredit){
            ogrenci1.dersListesi.add(fizik101);
        }
        else {
            System.out.println("Alabileceğiniz Kredi miktarı doldu.");
        }

        */

        System.out.println("--------------------------------------------");


        Lesson biyo = Lesson.lessonCreate("Biyoloji",5);
        Lesson kim = Lesson.lessonCreate("Kimya",3);
        Lesson din = Lesson.lessonCreate("Din",4);

        Student ogrenci2 = new Student();
        ogrenci2.name = "Hüseyin";
        ogrenci2.maxCredit = 11;

        ogrenci2.dersListesi = new ArrayList<>();

        ogrenci2.lessonAdd(biyo);
        ogrenci2.lessonAdd(kim);
        ogrenci2.lessonAdd(din);

        ogrenci2.printLessons();








    }

}
