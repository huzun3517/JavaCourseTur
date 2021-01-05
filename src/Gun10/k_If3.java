package Gun10;

import java.util.Scanner;

public class k_If3 {

    public static void main(String[] args) {
        // Girilen iki sayidan buyuk olanini ekrana yazdiriniz, esit ise esit yazdiriniz.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayi: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayi: ");
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Büyük sayi = " + sayi1);

        }

        if (sayi2 > sayi1) {
            System.out.println("Büyük sayi = " + sayi2);

        }

        if (sayi1 == sayi2) {
            System.out.println("Sayilar esittir");

        }
    }
}
