package Gun16;

import java.util.Scanner;

public class h_for_loop3 {

    public static void main(String[] args) {

        // Kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");

        int sayi = scanner.nextInt();
        int top = 0;

        for (int i = 0; i <sayi;i++){
            top += i;

        }
        System.out.println(top);

    }
}
