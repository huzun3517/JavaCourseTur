package Gun10;

import java.util.Scanner;

public class l_If4 {

    public static void main(String[] args) {
        // Girilen bir sayinin tek mi çift mi oldugunu yazdiriniz.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi gir: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Sayi çifttir.");
        }
        if (sayi % 2 == 1) {
            System.out.println("Sayi tektir.");
        }




    }
}
