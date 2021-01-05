package Gun09;

import java.util.Scanner;

public class a_Odev1 {

    public static void main(String[] args) {

    /*   1- Girilen 2 veya 3 kelimeli ad ve soyadların ilk harflerinin
            hepsini küçük ve daha sonra büyük hallerini yazdırınız.       */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ad Soyad : ");
        String ad_soyad = scanner.nextLine();

        // ahmet yılmaz

        int bosluknerde = ad_soyad.indexOf(" ");

        String ad_kucuk = (ad_soyad.substring(0,1)).toLowerCase();
        String ad_buyuk = (ad_soyad.substring(0,1)).toUpperCase();

        String soyad_kucuk = ad_soyad.substring(bosluknerde+1,bosluknerde+2).toLowerCase();
        String soyad_buyuk = ad_soyad.substring(bosluknerde+1,bosluknerde+2).toUpperCase();

        String ad_kelime = ad_soyad.substring(1,bosluknerde);
        String soyad_kelime = ad_soyad.substring(bosluknerde + 2);

        System.out.println(ad_kucuk + ad_kelime +  " " + soyad_kucuk + soyad_kelime );
        System.out.println(ad_buyuk + ad_kelime +  " " + soyad_buyuk + soyad_kelime );
    }
}
