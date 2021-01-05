package Gun14;

import java.util.Scanner;

public class e_While_Loop3 {

    public static void main(String[] args) {
        // Girilen bir sayıya kadar(sayı dahil) olan sayıların toplamını bularak yazdırınız.
        // Sayac degiskeni kullanmayınız...

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi = oku.nextInt();


        int toplam = 0;
        // 7 --> 1 2 3 4 5 6 7

        while ( sayi > 0) {
            toplam = toplam + sayi;
            sayi--;
        }
        System.out.println("toplam = " + toplam);




    }
}
