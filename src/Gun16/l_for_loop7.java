package Gun16;

import java.util.Scanner;

public class l_for_loop7 {

    public static void main(String[] args) {

        // Girilen bir String in harflerini teker teker ekrana alt alta olacak şekilde yazdırınız.
        // Boşluk veya a harfi geldiğinde bunları yazmasın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scanner.nextLine();

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == ' ')
                continue; // continue çalıştığı anda artışa direk gider, yani döngünün devamı
                          // bu adım çalışmaz.

            System.out.println(str.charAt(i));
        }


    }
}
