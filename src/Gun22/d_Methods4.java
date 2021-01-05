package Gun22;

import java.util.Arrays;
import java.util.Scanner;

public class d_Methods4 {

    public static void main(String[] args) {

        // String şeklinde aralarında boşluklarla girilen bir dizinin
        // enbüyük,enküçük elemanını, bütün elemanlarının toplamını,
        // sayıların ortalamasını ayrı ayrı metodlarla yapınız.
        // 3 4 12 45 67 gibi giriş yapılacak.

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayıları bir boşluk bırakarak yan yana giriniz: ");
        String strTumSayilar = scanner.nextLine();

        String[] strDizi = strTumSayilar.split(" ");

        int[] intDizi = new int[strDizi.length];

        for (int i = 0; i <intDizi.length ; i++) {

            intDizi[i] = Integer.parseInt(strDizi[i]);
        }

        System.out.println(Arrays.toString(intDizi));


        enBuyukYaz(intDizi);
        enKucukYaz(intDizi);
        tumTopla(intDizi);
        OrtalamaYaz(intDizi);







    }

    public static void enBuyukYaz(int[] dizi) {

        Arrays.sort(dizi);
        System.out.println("enb = " + dizi[dizi.length-1]);
    }

    public static void enKucukYaz(int[] dizi) {

        Arrays.sort(dizi);
        System.out.println("enk = " + dizi[0]);
    }

    public static void tumTopla(int[] dizi) {

        int toplam=0;

        for (int i = 0; i <dizi.length ; i++) {
            toplam += dizi[i];
        }
        System.out.println("toplam = " + toplam);
    }

    public static void OrtalamaYaz(int[] dizi) {

        int toplam=0;

        for (int i = 0; i <dizi.length ; i++) {
            toplam += dizi[i];
        }
        System.out.println("ortalama = " + toplam/dizi.length);
    }


}
