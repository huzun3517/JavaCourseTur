package Gun11;

import java.util.Scanner;

public class g_if_Else_Logic7 {

    public static void main(String[] args) {
        // Bir otopark ücret hesaplama programı yapılma isteniyor.
        // 0-2 saat ara 5 €, 2-5 arası 10 €, 5 saatten sonra 15 € olarak
        // saat girildiğinde ücreti yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Saati giriniz: ");
        int saat = scanner.nextInt();

        if (saat <= 2 ){
            System.out.println("5 Euro");
        }
        else if (saat <= 5) {
            System.out.println("10 Euro");
        }
        else {
            System.out.println("15 Euro");
        }



    }
}
