package Gun14;

import java.util.Scanner;

public class i_doWhile2 {

    public static void main(String[] args) {
        // Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        Scanner oku = new Scanner(System.in);
        String str;

        do {
            System.out.print("String giriniz: ");
            str = oku.nextLine();
            if (str.equalsIgnoreCase("x")) break;

            System.out.println("Program çalışıyor");
        } while (!str.equalsIgnoreCase("x"));
        System.out.println("Program bitti");

    }
}
