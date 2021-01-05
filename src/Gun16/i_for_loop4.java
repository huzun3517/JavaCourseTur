package Gun16;

import java.util.Scanner;

public class i_for_loop4 {

    public static void main(String[] args) {

        // Girilen bir sayının faktoryelini hesaplayınız.
        // 5! --> 5*4*3*2*1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");

        int sayi = scanner.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <=sayi; i++){
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel = " + faktoriyel);

    }
}
