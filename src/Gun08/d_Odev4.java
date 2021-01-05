package Gun08;

import java.util.Scanner;

public class d_Odev4 {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız bir String in boş olup olmadığını kontrol ediniz

        Scanner scanner = new Scanner(System.in);
        System.out.print("String değeri giriniz: ");
        String deger = scanner.nextLine();

        boolean bosMu = deger.isEmpty();
        System.out.println("Boş mu = " + bosMu);

    }
}
