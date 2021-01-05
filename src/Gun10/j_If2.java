package Gun10;

import java.util.Scanner;

public class j_If2 {
    public static void main(String[] args) {
        // Girilen bir sayinin pozitif, negatif ya da sifir a esitlik durumunu yazdiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int sayi = scanner.nextInt();

        if (sayi < 0){
            System.out.println("Sayı negatiftir");
        }

        if (sayi == 0) {
            System.out.println("Sayı sıfırdır");
        }

        if (sayi > 0){
            System.out.println("Sayı pozitiftir");
            }

    }
}
