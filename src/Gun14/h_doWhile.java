package Gun14;

import java.util.Scanner;

public class h_doWhile {

    public static void main(String[] args) {
        // Kullanıcıdan Sıfır girilene kadar sayı isteyiniz.
        // bu soruyu önce while ile çözünüz.Sonra do-While

        Scanner oku = new Scanner(System.in);

        int sayi=0;
    /*    System.out.print("bir sayi giriniz : ");
          int sayi = oku.nextInt();


        while (sayi !=0) {
            System.out.print("bir sayi giriniz : ");
            sayi = oku.nextInt();
            }

     */
        // burada döngü içine mutlaka ilk kez girilir, işlemler yapılır, sonra döngü şartı geçerli ise
        // döngü dönmeye başlar.

        do {
            System.out.print("Sayı giriniz: ");
            sayi = oku.nextInt();
        } while (sayi !=0);

    }
}
