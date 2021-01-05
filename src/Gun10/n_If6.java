package Gun10;

import java.util.Scanner;

public class n_If6 {

    public static void main(String[] args) {
        // Girilen 3 sayidan en buyuk olanini bulunuz.
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.print("1.Sayıyı girin: ");
        sayi1 = scanner.nextInt();

        System.out.print("2.Sayıyı girin: ");
        sayi2 = scanner.nextInt();

        System.out.print("3.Sayıyı girin: ");
        sayi3 = scanner.nextInt();

        int max = sayi1;

        if (sayi2 > max)
            max = sayi2;

        if (sayi3 > max)
             max = sayi3;

        System.out.println("En buyuk sayi = " + max);
    }
}
