package Gun06;

import java.util.Scanner;

public class e_Ornek4 {

    public static void main(String[] args) {

        /* Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini
           alıp ekrana tek satırda yazdırınız.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuz: " + boy + " " + "Kilonuz: " + kilo);






    }
}
