package Gun10;

import java.util.Scanner;

public class i_If1 {

    public static void main(String[] args) {
        // Girilen bir sayının 10 dan büyük ise ekrana 10 dan büyük diye yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi = scanner.nextInt();

        if (sayi > 10) {  // if in içinde yapılacaklar 1 satırdan fazla ise süslü parantez şart.
                         // 1 tane ise değil
            System.out.println("Sayı 10 dan büyüktür.");
        }



    }
}
