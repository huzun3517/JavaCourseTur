package Gun11;

import java.util.Scanner;

public class c_if_Else3 {

    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi gir: ");
        int sayi = scanner.nextInt();

        if (sayi %2 == 0) {
            System.out.println("Çift");
        }
        else {
            System.out.println("Tek");
        }
    }
}
