package Gun12;

import java.util.Scanner;

public class f_Math2 {

    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz = ");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayıyı giriniz = ");
        int sayi2 = oku.nextInt();

        System.out.print("3.Sayıyı giriniz = ");
        int sayi3 = oku.nextInt();

   //   int max1 = Math.max(sayi1,sayi2);
   //   System.out.println("Max = " + Math.max(max1,sayi3));

        System.out.println("Max = " + Math.max(Math.max(sayi1,sayi2),sayi3));

    }
}
