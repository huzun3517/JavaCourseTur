package Gun12;

import java.util.Scanner;

public class i_Random3 {

    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri isteyerek random sayı üretiniz.
        // ve üretilen sayıyı ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi alt deger giriniz: ");
        int Randommax= oku.nextInt();

        System.out.print("Sayi üst deger giriniz: ");
        int Randommin= oku.nextInt();

        int uretilenSayi = (int) (Math.random() * ((Randommax-Randommin)+1)) + Randommin;

        System.out.println("Uretilen Sayi = " + uretilenSayi);

    }
}
