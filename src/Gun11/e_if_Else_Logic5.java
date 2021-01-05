package Gun11;

import java.util.Scanner;

public class e_if_Else_Logic5 {

    public static void main(String[] args) {
        // Girilen bir string in uzunluğu 10 dan büyük ise ve
        // String in içinde "study" kelimesi geçiyorsa ekrana evet yazdırın.
        // değilse hayır yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("String gir: ");
        String str = scanner.nextLine();

        if (str.length() > 10 && str.contains("study")) {
            System.out.println("Evet");
        }
        else {
            System.out.println("Hayır");
        }





    }
}
