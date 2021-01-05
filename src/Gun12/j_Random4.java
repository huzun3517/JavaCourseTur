package Gun12;

import java.util.Scanner;

public class j_Random4 {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayi alt ve üst degerini yan yana bir boşlukla giriniz: ");
        String sayi= oku.nextLine();
        int bosluknerde = sayi.indexOf(" ");

        String min = sayi.substring(0,bosluknerde);
        int randommin = Integer.parseInt(min);

        String max = sayi.substring(bosluknerde + 1);
        int randommax = Integer.parseInt(max);


       int uretilenSayi = (int) (Math.random() * ((randommax-randommin)+1)) + randommin;

       System.out.println("Uretilen Sayi = " + uretilenSayi);

        //  Math.random() -> 0  - 0,9999
        // 0-10 a kadar sayı üretmesini istersem : Math.random*10  ->  0 - 9,999    -> 0-9    -> 10 dahil olması için +1
        //2 ile 5 arası istiyorsam  min 2   max 5
        //  3 e akdar olan sayıları buluyorum 0-3   + min ->  2 5 ekarşılık gelir
    }
}
