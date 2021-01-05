package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class d_String_Split_Metot {

    public static void main(String[] args) {
        // Kullanıcıdan alacağınız bir cümleyi kelimelerine bölerek alt alta yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" "); // boşluk karakterine göre böler ve diziye atar.

        for (int i =0; i<kelimeler.length; i++){
            System.out.println(kelimeler[i]);
        }
        System.out.println("*******************************");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println("*******************************");

        //2.yöntem foreach
        for (String elemanDegeri : kelimeler
             ) {
            System.out.println(elemanDegeri);

        }


    }
}
