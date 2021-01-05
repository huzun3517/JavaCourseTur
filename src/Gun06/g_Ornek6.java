package Gun06;

import java.util.Scanner;

public class g_Ornek6 {

    public static void main(String[] args) {

        // Kullanıcıdan Cadde,Sokak,PostaKodu(int) ve ülke şeklinde adres bilgisi alarak yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadde : ");
        String cadde = scanner.nextLine();

        System.out.print("Sokak : ");
        String  sokak = scanner.nextLine();

        System.out.print("Posta kodu : ");
        int  pkodu = scanner.nextInt();
        scanner.nextLine();

        /*
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Posta kodu : ");
        int  pkodu = scanner2.nextInt();

         */

        /* Okuma işleminde klavyeden sadece girilen bilgi değil enter ve diğer görünmeyen karakterler de
        gittiğinden sonraki gelen okuma isteği görünmez karakterlerle dolabiliyor. Bu sebeple veri girilmiş
        gibi kabul ediyor. Bunu çözmenin yolu ya araya ek bir gereksin okuma komutu eklemek veya tip değiştiğinde yeni
        bir scanner değişkeni tanımlamaktır.
         */

        System.out.print("Ülke: ");
        String ulke_adi = scanner.nextLine();

        System.out.println(cadde + " caddesi " + sokak + " sokak " + pkodu +" " + ulke_adi);


    }
}
