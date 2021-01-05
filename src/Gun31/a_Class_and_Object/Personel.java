package Gun31.a_Class_and_Object;

public class Personel {

    // 2.Yöntem
    int id;
    String name;
    String surName;


    public static void main(String[] args) {

        Personel mudur = new Personel();
        mudur.id = 1;
        mudur.name = "Mehmet";
        mudur.surName = "Yılmaz";

        System.out.println("mudur.id = " + mudur.id);
        System.out.println("mudur.name = " + mudur.name);
        System.out.println("mudur.surName = " + mudur.surName);

    }
}
