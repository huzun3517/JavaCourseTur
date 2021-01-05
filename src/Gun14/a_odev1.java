package Gun14;

import java.util.Scanner;

public class a_odev1 {

    public static void main(String[] args) {
        //1- Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.

        int kalan = 100 % 7;

        switch (kalan) {
            case 0:
                System.out.println("Perşembe");
                break;
            case 1:
                System.out.println("Cuma");
                break;
            case 2:
                System.out.println("Cumartesi");
                break;
            case 3:
                System.out.println("Pazar");
                break;
            case 4:
                System.out.println("Pazartesi");
                break;
            case 5:
                System.out.println("Salı");
                break;
            case 6:
                System.out.println("Çarşamba");
                break;

        }
    }
}
