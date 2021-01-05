package Gun23;

import java.util.Arrays;
import java.util.Scanner;

public class g_Metod7 {

    public static void main(String[] args) {

        // 5 elemanlı bir diziyi kullanıcı doldurduktan sonra
        // tek elemanlara 0 değeri atayınız.
        // diziyi main de yazdırınız.

        Scanner scanner = new Scanner(System.in);

        int[] dizi = new int[5];

        for (int i = 0; i <5 ; i++) {

            System.out.print("Sayi giriniz: ");
            dizi[i] = scanner.nextInt();

        }
        System.out.println("Önce : " + Arrays.toString(dizi));
        System.out.println("Sonra : " + Arrays.toString(teklereSifirAta(dizi)));
    }

    public static int[] teklereSifirAta(int[] dizi){

        // eğer dizinin elemanı tek ise 0 atanıyor.
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i] % 2 == 1)
                dizi[i] = 0;

        }

        return dizi;
    }
}
