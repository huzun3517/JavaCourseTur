package Gun07;

import java.util.Scanner;

public class c_Ornek {

    public static void main(String[] args) {
        // Kullanıcıdan alacağınız bir kelimenin son harfini yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();


        // uzunluk adedi veriyordu, son index i ise length - 1 verecektir.
        int kelimeuzunluk = kelime.length();
        char sonharf = kelime.charAt(kelimeuzunluk-1);

        System.out.println("Sonharf = " + sonharf);   // alttaki de alternatif yolu
        System.out.println("Sonharf = " + kelime.charAt(kelime.length()-1));

    }
}
