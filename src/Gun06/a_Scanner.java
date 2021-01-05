package Gun06;

import java.util.Scanner;

public class a_Scanner {

    public static void main(String[] args) {

        int sayi = 5; // bunu tanımladığımız gibi aşağıda tanımlıyoruz.

        Scanner oku = new Scanner(System.in); // Klavyeden veri girişi yapılacak.

        System.out.print("Bir sayı giriniz: ");
        sayi = oku.nextInt();
        System.out.println("sayi = " + sayi);




    }
}
