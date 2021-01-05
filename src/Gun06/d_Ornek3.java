package Gun06;

import java.util.Scanner;

public class d_Ornek3 {
    public static void main(String[] args) {

        //Kullanıcıdan alacağınız 2 sayının toplamını ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Toplam= " + toplam);

        System.out.println("Toplam = " + sayi1 + sayi2);
        /* burada string ile sayı toplandığından println hepsini stringe çevirip yanyana ekler.
           sayı toplaması yapmaz. */

        System.out.println("Toplam = " + (sayi1 + sayi2));
         /* Paranteze alırsak önce parantez içi, dolayısıyla sayılar toplanabilir oluyor, sonra
            sonucu string olarak ekrana basılıyor. */


    }
}
