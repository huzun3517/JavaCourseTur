package Gun16;

import java.util.Scanner;

public class c_odev3 {

    public static void main(String[] args) {

        //    3-Girilen 5 sayının toplamını ekrana yazdırınız.

    /*    Scanner scanner = new Scanner(System.in);
        int sayi;
        int sayac = 5;
        int toplam = 0;

        do {
            System.out.print("Bir sayı giriniz:");
            sayi = scanner.nextInt();
            toplam = toplam + sayi;
            sayac--;
        }
        while (sayac > 0);
        System.out.println("Sayıların Toplamı = " + toplam);

     */

        Scanner scanner = new Scanner(System.in);
        int top=0;

        for (int i = 0; i < 5; i++){
            System.out.print("Sayı giriniz: ");
            int sayi = scanner.nextInt();

            top += sayi;

        }
        System.out.println("Sayıların Toplamı = " + top);
    }
}
