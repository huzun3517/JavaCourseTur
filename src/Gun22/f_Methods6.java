package Gun22;

import java.util.Scanner;

public class f_Methods6 {

    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı isteyiniz, toplamını bir methodda yaptırınız, sonucu mainde yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2.Sayı: ");
        int sayi2 = scanner.nextInt();

        int sonuc = toplamYaz(sayi1,sayi2);
        System.out.println("toplam = " + sonuc);

        int enb = enBuyuk(sayi1,sayi2);
        System.out.println("enb = " + enb);

    }

    // void: geriye bir şey göndermeyen yani return olmayan demek.

    public static int toplamYaz(int s1,int s2) {

        int toplam = s1 + s2;
        return toplam;
    }

    private static  int enBuyuk(int s1,int s2) {

        if (s1 > s2)
            return s1;
        else
            return s2;
    }
}
