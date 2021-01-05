package Gun14;

import java.util.Scanner;

public class f_While_Loop4 {

    public static void main(String[] args) {

        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi = oku.nextInt();

        while (sayi > 0) {
            if ( sayi % 2 == 1){
                System.out.println("sayi = " + sayi);
            }
            sayi --;

        }







    }
}
