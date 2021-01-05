package Gun09;

import java.util.Scanner;

public class b_Odev2 {

    public static void main(String[] args) {

      //  2- Girilen bir string içinde bir kelime arayınız,
        //  büyük harf veya küçük harf de olsa aranan kelimede bulsun.

        Scanner scanner = new Scanner(System.in);
        System.out.print("String değeri giriniz: ");
        String deger = scanner.nextLine();

        System.out.print("Aranacak kelimeyi giriniz: ");
        String kelime = scanner.nextLine();

        String deger_buyut = deger.toUpperCase();
        String kelime_buyut = kelime.toUpperCase();

       boolean varMi = deger_buyut.contains(kelime_buyut);
        System.out.println(varMi);

    }
}
