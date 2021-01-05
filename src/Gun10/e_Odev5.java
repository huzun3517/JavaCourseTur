package Gun10;

import java.util.Scanner;

public class e_Odev5 {

    public static void main(String[] args) {

        // 5-Girilen 3 basamaklı bir sayının basamaklarına göre tersini bir sayı olarak ekrana yazdırınız.
        //örn : 435-> 534

        Scanner scanner = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int birler= (sayi % 10) ;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) ;

      /*  System.out.println("birler = " + birler);
        System.out.println("onlar = " + onlar);
        System.out.println("yuzler = " + yuzler); */

        int tersi = yuzler * 1 + onlar * 10 + birler * 100;
        System.out.println("Sayının orjinali = " + sayi);
        System.out.println("Değişen sayı = " + tersi);



    /*   int gecici_sayi1 = birler;
        int gecici_sayi2= yuzler;
        birler = gecici_sayi2;
        yuzler = gecici_sayi1;
        int yeni_sayi = birler + onlar*10 + yuzler*100;

        System.out.println("Sayının orjinali = " + sayi);
        System.out.println("Değişen sayı = " + yeni_sayi);
     */






    }
}
