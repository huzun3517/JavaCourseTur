package Gun33.b_tasks.task2;

import java.util.ArrayList;

public class Student {

    String name;
    int maxCredit;
    ArrayList<Lesson> dersListesi;

    public int totalCredit(){

        int total =0;
        for (Lesson ders : dersListesi) {

            total += ders.credit;
        }
        return total;
    }

    public void lessonAdd(Lesson ders){

        int ogrenciTopDersSaati = 0;

        for (Lesson aldigiDers : dersListesi ) {

            ogrenciTopDersSaati += aldigiDers.credit;
        }

        if (ogrenciTopDersSaati + ders.credit < maxCredit){
            dersListesi.add(ders);
        }
        else {
            System.out.println(name + " isimli öğrenciye " + ders.name + " dersi " + " Max saati aştığı için eklenemedi.");
        }
    }

    public void printLessons() {
        System.out.println(name + " isimli öğrencinin aldığı dersler: ");

        int aldigiTopDersSaati = 0;

        for (Lesson ders : dersListesi){
            System.out.println(ders.name + " " + ders.credit);
            aldigiTopDersSaati += ders.credit;
        }
        System.out.println("aldığı toplam saat = " + aldigiTopDersSaati);
    }


}
