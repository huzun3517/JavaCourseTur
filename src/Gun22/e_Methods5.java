package Gun22;

import java.util.Scanner;

public class e_Methods5 {

    public static void main(String[] args) {

        // Kullanıcıya aşağıdaki gibi bir menü çıkartarak değişkenleri alınız ve
        // her bir menü elemanını değer alan fonksiyon olarak yazınız.

        /* Kullanıcıya
        1-Toplama
        2-Çıkarma
        3-Çarpma
        4-Bölme
        5-Faktoriyel ekle
        6-Çıkış
        Bir işlem seçiniz
         */

        Scanner scanner = new Scanner(System.in);

        int secim = 0;

        do {
            menuYaz();
            secim = scanner.nextInt();
            islemYap(secim);

        }while (secim < 6);


    }
    public static void toplamaYaz(int s1, int s2) {

        System.out.println("Toplam = " + (s1 + s2));
    }

    public static void cikartmaYaz(int s1, int s2) {

        System.out.println("Toplam = " + (s1 - s2));
    }

    public static void carpmaYaz(int s1, int s2) {

        System.out.println("Toplam = " + (s1 * s2));
    }

    public static void bolmeYaz(int s1, int s2) {

        System.out.println("Toplam = " + ((double)s1 / s2));
    }

    public static void faktoryelYaz(int s1) {

        int faktor =1;

        for (int i =1; i<=s1; i++){
            faktor *= i;
        }
        System.out.println("Faktoriyel = " + faktor);

    }

    public static void menuYaz() {

        System.out.println("********Menü*********");
        System.out.println("1-toplama");
        System.out.println("2-çıkarma");
        System.out.println("3-çarpma");
        System.out.println("4-bölme");
        System.out.println("5-faktöryel");
        System.out.println("6-çıkış");
        System.out.println("********************");
        System.out.print("Bir işlem seçiniz: ");

    }

    public static void islemYap(int secim){

        Scanner scanner = new Scanner(System.in);

        int sayi1=0;
        int sayi2 =0;
        switch (secim){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("1.Sayı = ");
                sayi1 = scanner.nextInt();

                System.out.print("2.Sayı = ");
                sayi2 = scanner.nextInt();
                break;
            case 5:
                System.out.print("Sayı = ");
                sayi1 = scanner.nextInt();
                break;
        }

        switch (secim) {
            case 1: toplamaYaz(sayi1,sayi2); break;
            case 2: cikartmaYaz(sayi1,sayi2); break;
            case 3: carpmaYaz(sayi1,sayi2); break;
            case 4: bolmeYaz(sayi1,sayi2); break;
            case 5: faktoryelYaz(sayi1); break;
        }


    }










}
