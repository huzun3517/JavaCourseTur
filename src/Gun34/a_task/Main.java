package Gun34.a_task;

public class Main {
    //TODO
    // Üniversitede Öğrencilere Ders kaydı programı yapılmak isteniyor.
    // Önce ders tanımlamaları yapılacak, sonra her öğrenci için alabileceği ders saatini geçmeyecek şekilde, dersler
    // öğrencilere eklenecek.
    // 1-Adım : Yeni ders oluşturmak için Lesson adında bir sınıf tanımlayınız: fields: name, hour
    // 2-Adım : Ders oluşturma metodunu yazınız. createLesson
    // 3-Adım : 3 Adet ders tanımlayınız: mat101 6 saat, fizik101 4 saat, java101 6 saat
    // 4-Adım : Student isminde yeni bir class tanımlayınız: fields : name, maxAlabilecegiDersSaatMiktari
    // 5-Adım : Öğrenci oluşturmayı bir metod ile yazınız.createStudent
    // 6-Adım : 2 adet öğrenci oluşturunuz:
    //          Adı: Mehmet, maxAlabilecegiDersSaatMiktari = 20 olsun
    //          Adı: Ayşe, maxAlabilecegiDersSaatMiktari = 12 olsun
    // 7-Adım : Öğrenciye ders Eklemek için Student sınıfına bir dersListesi tutacak bir
    //          fields ekleyiniz: studentLessons adında
    // 8.Adım : Öğrenciye ders ekleyen LessonAdd isimli bir metod yazınız.
    // 9.Adım : Her öğrencinin aldığı dersleri yazan bir metod yazınız ve dersleri yazdırınız.


    public static void main(String[] args) {

        // metod static olduğundan nesne tanımlanmasına gerek kalmadan direk çağrılabiliyor. Aşağıdaki gibi.
        Lesson mat101 = Lesson.createLesson("mat101",6);
        Lesson fiz101 = Lesson.createLesson("fiz101",4);
        Lesson java101 = Lesson.createLesson("java101",6);

        Student mehmet = Student.createStudent("Mehmet",20);
        Student ayse = Student.createStudent("Ayşe",12);

        mehmet.lessonAdd(mat101);
        mehmet.lessonAdd(fiz101);
        mehmet.lessonAdd(java101);

        ayse.lessonAdd(mat101);
        ayse.lessonAdd(fiz101);
        ayse.lessonAdd(java101);

        mehmet.printLessons();
        ayse.printLessons();
    }
}
