package Gun11;

import java.util.Scanner;

public class f_if_Else_Logic6 {

    public static void main(String[] args) {
        /* Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        kurallar:
        1- en az 8 karakter olmalı
        2- içinde pass kelimesi olmamalı
        3- en fazla 12 karakter olmalı.
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("String gir: ");
        String password = scanner.nextLine();

        if (password.length() >= 8 && !password.contains("pass") && password.length() <=12 ) {
            System.out.println("Kurallara uygun");
        }
        else {
            System.out.println("Kurallara uygun değil");
        }




    }
}
