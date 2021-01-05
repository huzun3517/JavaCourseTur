package Gun12;

import java.util.Scanner;

public class h_Random2 {

    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız.
        //kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int kacaKadarRandomSayi= oku.nextInt();

        int uretilenSayi = (int) (Math.random()*kacaKadarRandomSayi+1);

        System.out.print("Sayı tahmininiz : ");
        int tahmin = oku.nextInt();

        if (uretilenSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("Bilemedinki bilemedinki");

        System.out.println("uretilenSayi = " + uretilenSayi);

    }
}
