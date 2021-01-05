package Gun04;

public class a_String {

    public static void main(String[] args) {

        System.out.println("Merhaba Dünya");

        int sayi = 5;
        String ad = "ismet";
        String soyad = "temur";

        System.out.println(ad);     // ismet
        System.out.println("ad");  // ad
        // çift tırnak arasında yazılmayan herşey değişken kabul edilir ve değeri yazılır.

        System.out.println(ad + soyad); // ismettemur

        System.out.println("ad" + "soyad");  // adsoyad

        System.out.println(ad + " " + soyad); // ismet temur

        System.out.println("ad" + " soyad"); // ad soyad

        // int toplam = a + b;
        String fullName = ad + " " + soyad;
        System.out.println("fullName = " + fullName);

        int yas = 45;
        String bigi = ad + " " + soyad + " " + yas;
        System.out.println(bigi);




    }
}
