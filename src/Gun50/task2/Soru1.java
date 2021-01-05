package Gun50.task2;

import java.util.Scanner;

public class Soru1 {

    // todo Girilen bir sayını tersten yazdırınız.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        int tersiSayi = 0;

        // 23452 --> 2->2*10+5

        while (sayi > 0) {
            int basamak = sayi % 10;
            sayi = sayi / 10;
            tersiSayi = tersiSayi * 10 + basamak;
        }
        System.out.println(tersiSayi);

        //    basamak  sayı     tersiSayı
        // 1-     2     2345       2
        // 2-     5     234        25
        // 3-     4     23         254
        // 4-     3     2          2543
        // 5-     2     0          25432

    /*    2.YOL
        String str = String.valueOf(sayi);
        String[] arr = str.split("");

        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
        }

     */





    }
}
