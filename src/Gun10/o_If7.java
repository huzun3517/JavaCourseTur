package Gun10;

import java.util.Scanner;

public class o_If7 {

    public static void main(String[] args) {
        // Girilen bir sayinin onlar basamaginin tek mi cift mi oldugunu bulunuz.

        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayi giriniz: ");
        sayi = scanner.nextInt();

        int onlarbasamak = (sayi / 10) % 10; // onlar basamagini veriyor.

        if (onlarbasamak % 2 == 0)
            System.out.println("Sayi cift");

        if (onlarbasamak % 2 == 1)
            System.out.println("Sayi tek");

    }
}
