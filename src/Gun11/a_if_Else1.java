package Gun11;

import java.util.Scanner;

public class a_if_Else1 {

    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notu giriniz: ");
        int ogrNot = scanner.nextInt();

     /*
        if (ogrNot >= 50) {
            System.out.println("Geçtiniz.");
        }

        if (ogrNot < 50) {
            System.out.println("Kaldınız.");
        }
     */

        // yukarıdaki 2 adet if in yerine aşağıdaki aynı görevi daha hızlı sağlar. Çünkü tek şart
        // kontrol eder aşağıdaki yapı, yukarıdaki her iki if in şartını da kontrol eder.

        if (ogrNot >= 50) {
            System.out.println("Geçtiniz.");
        }

        else {
            System.out.println("Kaldınız");
        }

    }
}
