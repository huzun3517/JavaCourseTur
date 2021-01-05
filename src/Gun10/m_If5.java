package Gun10;

import java.util.Scanner;

public class m_If5 {

    public static void main(String[] args) {
        // Girilen bir sayinin birler basamagini yazi ile yazdirin.
        // Sayi negatifse de kod calismalı.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi gir: ");
        int sayi = scanner.nextInt();

        if (sayi < 0)  // bu bolum sayi negatif ise calisacak.
            sayi = -sayi;

        int basamak = sayi % 10;

        if (basamak==0) {System.out.print("Birler basamagi = sifir dir"); System.out.println(" 0");}
        if (basamak==1) System.out.println("Birler basamagi = bir dir");
        if (basamak==2) System.out.println("Birler basamagi = iki dir");
        if (basamak==3) System.out.println("Birler basamagi = uç dur");
        if (basamak==4) System.out.println("Birler basamagi = dort dur");
        if (basamak==5) System.out.println("Birler basamagi = bes dir");
        if (basamak==6) System.out.println("Birler basamagi = alti dir");
        if (basamak==7) System.out.println("Birler basamagi = yedi dir");
        if (basamak==8) System.out.println("Birler basamagi = sekiz dir");
        if (basamak==9) System.out.println("Birler basamagi = dokuz dur");






    }
}
