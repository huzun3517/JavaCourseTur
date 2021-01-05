package Gun11;

import java.util.Scanner;

public class b_if_Else2 {

    public static void main(String[] args) {
        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz.
        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vize Notu: ");
        double vize = scanner.nextDouble();

        System.out.print("Final Notu: ");
        double fin = scanner.nextDouble();

        double ort = (vize * 0.4) + (fin * 0.60);

        if (ort > 60) {
            System.out.println("Geçtiniz...");
            System.out.println("Tebrikler...");
        }
        else {
            System.out.println("Bütünlemeye kaldınız.");
        }

    }
}
