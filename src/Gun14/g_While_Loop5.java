package Gun14;

import java.util.Scanner;

public class g_While_Loop5 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en buyugunu bularak yazdırınız.

        Scanner oku = new Scanner(System.in);

        int i = 1;
        int enb = 0;

        while ( i <= 5 ){
            System.out.print("bir sayi giriniz : ");
            int sayi = oku.nextInt();

    //      if (sayi > enb)
    //          enb = sayi;

            enb = Math.max(enb,sayi);

            i++;
        }
        System.out.println("Max sayı = " + enb);

    }
}
