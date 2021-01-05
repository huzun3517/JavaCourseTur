package Gun32.a_Example;

public class Main {

 //TODO 1.Adım : Person isimli bir class yazınız: fields: name, surname, age; olsun
 //     2.Adım : main de 2 tane bu sınıftan nesne oluşturup değer atayınız.
 //     3.Adım : getBirthYear isminde Person a ait bir metod yazınız, çalıştığında kişinin doğum yılını versin.
 //     4.Adım  :getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi şeklinde (Büyük harf) veren metodu yazınız
 //     örnek ahmet demir : A.D.


    public static void main(String[] args) {

        Person kisi1 = new Person();
        kisi1.name = "Yusuf";
        kisi1.surname = "Yılmaz";
        kisi1.age = 35;

        System.out.println("************1.Yöntemin kullanılması**********");

      //1.Yöntem--> oldukça uğraştırıcı
        System.out.println("kisi1.name = " + kisi1.name);
        System.out.println("kisi1.surname = " + kisi1.surname);
        System.out.println("kisi1.age = " + kisi1.age);

        Person kisi2 = new Person();
        kisi2.name = "Ayşe";
        kisi2.surname = "Demir";
        kisi2.age = 30;

        System.out.println("kisi2.name = " + kisi2.name);
        System.out.println("kisi2.surname = " + kisi2.surname);
        System.out.println("kisi2.age = " + kisi2.age);

        System.out.println("*********2.Yöntemin kullanılması:********");

        //2.Yöntemin kullanılması: kendi başına yazdır, fakat her nesne için böyle yazarsak oldukça karışır.
        BilgiYazdir(kisi1); // bu yöntemde parametre göndermek zorunda kalıyorum.
        BilgiYazdir(kisi2);

        System.out.println("*********3.Yöntemin kullanılması********");

        //3.Yöntemin main de kullanılması
        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        System.out.println("*************************************");

        System.out.println("kisi1.getBirthYear() = " + kisi1.getBirthYear());
        System.out.println("kisi2.getBirthYear() = " + kisi2.getBirthYear());

        System.out.println("*************************************");

        System.out.println("kisi1.getInitials() = " + kisi1.getInitials());
        System.out.println("kisi2.getInitials() = " + kisi2.getInitials());




    }
    //2.Yöntem iyi metod kullandık, fakat
    public static void BilgiYazdir(Person kisi){
        System.out.println("metod.name = " + kisi.name);
        System.out.println("metod.surname = " + kisi.surname);
        System.out.println("metod.age = " + kisi.age);
    }
}
