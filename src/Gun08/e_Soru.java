package Gun08;

import java.util.Scanner;

public class e_Soru {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir String de boşluk karakterinin olup olmadığını kontrol ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("String değeri giriniz: ");
        String deger = scanner.nextLine();

        boolean boslukVarmi = deger.contains(" ");
        System.out.println("Boşluk var mı = " + boslukVarmi);
    }
}
