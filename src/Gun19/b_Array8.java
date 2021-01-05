package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class b_Array8 {

    public static void main(String[] args) {

        // Kullanıcından alacağınız 5 adet meyve ismini bir diziye atadıktan
        // sonra, elma ismi geçen meyvelerini ekrana ayrı bir döngüde yazdırınız.

        Scanner scanner = new Scanner(System.in);
        String [] dizi = new String[5];

        for (int i=0 ; i<dizi.length; i++){
            System.out.print(i + ".indexi giriniz: ");
            dizi[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(dizi));

        for (int i=0 ; i<dizi.length; i++){

            if (dizi[i].toLowerCase().contains("elma"))
                System.out.println(dizi[i]);

        }


    }
}
