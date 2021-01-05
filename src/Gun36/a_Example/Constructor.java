package Gun36.a_Example;

public class Constructor {

    public static void main(String[] args) {

        //bir nesne oluşturup, değerlarini atadık.
    /*  Student ogrenci1 = new Student();
        ogrenci1.id = 1;
        ogrenci1.name = "Ayşe";
        ogrenci1.surname = "Yılmaz";
        ogrenci1.classroom = 10;

     */

        //2.yöntem de
       //   Student ogrenci2 = Student.createStudent(2,"Ahmet","Uzun",11);


        //3. ve esas yöntem nesne oluşturmak ve değerlerini atamak için
        Student ogrenci3 = new Student(3,"Ali","Doğan",9);
        System.out.println("ogrenci3.name = " + ogrenci3.name);

        Student ogrenci4 = new Student(4,"Zeynep","Toprak");

        Student ogrenci5 = new Student(4,"Zeynep");

        Student ogrenci6 = new Student(4);

        Student ogrenci7 = new Student();
        ogrenci7.id = 7;
        ogrenci7.name = "Veli";
        ogrenci7.surname = "Kara";
        ogrenci7.classroom = 7;

    }
}
