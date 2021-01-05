package Gun08;

import java.util.Scanner;

public class c_Odev3 {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 3 kelimelik ismin her kelimesini
        // ayırarak ayrı ayrı yazdırınız.
        // Örn: Ahmet Emin Yıldız

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ad - 2.Ad ve Soyadı giriniz: ");
        String  ad_soyad = scanner.nextLine();

        int ilk_bosluk_nerde = ad_soyad.indexOf(" ");
        String alinan_ad1 = ad_soyad.substring(0,ilk_bosluk_nerde);

        int son_bosluk_nerde = ad_soyad.lastIndexOf(" ");
        String alinan_ad2 = ad_soyad.substring(ilk_bosluk_nerde + 1,son_bosluk_nerde);

        String alinan_soyad = ad_soyad.substring(son_bosluk_nerde + 1);

        System.out.println("alınan ad1 = " + alinan_ad1);
        System.out.println("alınan ad2 = " + alinan_ad2);
        System.out.println("alınan soyad = " + alinan_soyad);
    }
}
