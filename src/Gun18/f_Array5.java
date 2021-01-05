package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class f_Array5 {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 7 sayıyı bir diziye atadıktan sonra
        // ayrı bir döngü ile kaç tanesinin tek sayı olduğunu yazdırınız.

        Scanner scanner = new Scanner(System.in);
        int [] dizi = new int[7];
        int sayac_teksayi = 0;

        for (int i=0 ; i<dizi.length; i++){
            System.out.print("Sayı giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

        for (int i =0; i< dizi.length; i++){

            if (dizi[i] % 2 == 1) // tek ise
                sayac_teksayi++;
        }
        System.out.println("Tek sayı miktarı = " + sayac_teksayi);








    }
}
