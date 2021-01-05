package Gun16;

import java.util.Scanner;

public class b_Odev2 {

    public static void main(String[] args) {

    //    1-  Girilen 10 adet sayıdan tek olanları ve çift olanların miktarlarını ayrı ayrı bularak yazdırınız.

    /*    Scanner scanner = new Scanner(System.in);
        int sayac = 1;
        int cift = 0;
        int tek = 0;

        do {
            System.out.print("bir sayi giriniz : ");
            int sayi = scanner.nextInt();
            if (sayi % 2 == 1) {
               tek++;
            }
            if (sayi % 2 == 0) {
                cift++;
            }
            sayac++;

        }while (sayac <= 10);
        System.out.println("Cift sayı adedi = " + cift);
        System.out.println("Tek sayı adedi = " + tek);

     */

        Scanner scanner = new Scanner(System.in);
        int cift = 0;
        int tek = 0;

        for (int i =1;i<=10;i++){
            System.out.print("Sayı giriniz: ");
            int sayi = scanner.nextInt();
            if (sayi % 2 == 0) {
                cift++;
            }
            else {
                tek++;
            }

        }
        System.out.println("Çift sayı = " + cift + " Tek sayı = " + tek);

    }
}
