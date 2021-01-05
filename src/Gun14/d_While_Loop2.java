package Gun14;

import java.util.Scanner;

public class d_While_Loop2 {

    public static void main(String[] args) {
        // Girilen bir sayıya kadar(sayı dahil) olan sayıların toplamını bularak yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi = oku.nextInt();

        int sayac = 1;
        int toplam = 0;
        // 7 --> 1 2 3 4 5 6 7

        while (sayac <= sayi) {
            toplam = toplam + sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);



    }
}
