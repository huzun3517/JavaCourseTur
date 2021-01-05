package Gun31.c_task;

import java.util.ArrayList;

public class Main {

    //TODO
    // 1- create class student with fields: string name, int not
    // 2- Daha sonra 3 tane öğrenci ve notu oluşturun. ve bu öğrencileri bir Arraylist e ekleyin
    // 3- Daha sonra öğrenci bilgilerini yazdıran bir metod yazarak, Arraylistteki öğrenci bilgilerini döngü ie yazdırınız.
    // 4- Daha sonra bütün öğrencilerin not ortalamasını bir metod aracılığı bularak main de yazdırınız.

    public static void main(String[] args) {

        Student ogr1 = new Student();
        Student ogr2 = new Student();
        Student ogr3 = new Student();

        ogr1.name = "Hüseyin";
        ogr1.not = 95;

        ogr2.name = "Şenay";
        ogr2.not = 98;

        ogr3.name = "Ömer";
        ogr3.not = 60;

        ArrayList<Student>ogrenciler = new ArrayList<>();
        ogrenciler.add(ogr1);
        ogrenciler.add(ogr2);
        ogrenciler.add(ogr3);
        /***********************************************/

        BilgiYazdir(ogrenciler);
        System.out.println("*************************");
        System.out.printf("Ortalama = %6.2f" , OrtalamaBul(ogrenciler));




    }
    public static void BilgiYazdir(ArrayList<Student > ogrenciler) {

        for (Student ogr : ogrenciler) {
            System.out.println("Name= " + ogr.name + "     Notu= " + ogr.not);
        }
    }

    public static double OrtalamaBul(ArrayList<Student> ogrenciler) {

        double ort =0;
        double sum =0;

        for (Student ogr : ogrenciler){
            sum+= ogr.not;
        }
        ort = sum / ogrenciler.size();
        return ort;
    }
}
