package Gun17;

import java.util.Scanner;

public class a_GununSorusu1 {

    public static void main(String[] args) {

        //    2- bilgisayar 0-10 arası sayı tutsun(Random).
        //    Kullanıcıdan en fazla 3 hak vererek sayıyı bulmasını isteyiniz.Bulduğunda tebrikler yazsın.

        Scanner oku=new Scanner(System.in);

        int tutulanSayi= (int)(Math.random()*10) +1;
        int sayac=1;

        while(sayac<=3){ // for(int sayac=0; sayac <=3; satac++)

            System.out.print("Sayıyı tahmin edin=");
            int tahmin = oku.nextInt();

            if (tutulanSayi == tahmin){
                System.out.println("tebrikler");
                break;
            }
            else
                System.out.print("Tekrar ");

            sayac++;
        }

        if (sayac == 4)
            System.out.println("Hakkınız bitti, bulamadınız.Tutulan sayı="+tutulanSayi);
    }

    /*
         Scanner scanner = new Scanner(System.in);
        int Randommax = 10;
        int Randommin = 0;
        int giris_hakki = 3;
        int sayi;

        int uretilenSayi = (int) (Math.random() * ((Randommax - Randommin) + 1)) + Randommin;

        do {
            System.out.print("Sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi == uretilenSayi) {
                System.out.println("Tebrikler sayıyı buldunuz. Tuttuğum sayı = " + uretilenSayi);
                break;
            }
            else {
                giris_hakki--;
                System.out.println("Kalan hakkınız: " + giris_hakki);
            }

        } while (giris_hakki > 0);
        if (giris_hakki == 0) {
            System.out.println("Üzgünüm tuttuğum sayıyı bulamadınız. Programdan çıkılıyor...");
        }

     */


}

