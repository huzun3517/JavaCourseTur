package Gun16;

import java.util.Scanner;

public class k_for_loop6 {

    public static void main(String[] args) {

        // Girilen bir stringdeki a harfi sayısını bulunuz.
        // c harfine sıra gelirse döngüden çıkılsın

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scanner.nextLine();

        int a = 0;

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'a'){
                a++;
            }
            else if (str.charAt(i) == 'c') {
                break;
            }
            System.out.println("döngü içindeki işleme giren harfler = " + str.charAt(i));
        }
        System.out.println("a nın sayısı = " + a);

    }
}
