package Gun16;

import java.util.Scanner;

public class m_for_loop8 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç,
        // diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        for (int i =1; i<=5; i++){
            System.out.print("Bir sayı gir: ");
            int sayi = scanner.nextInt();

            if (sayi > 5 && sayi < 10){
                System.out.println("Giriğiniz sayı 5-10 arasında olduğundan toplanmayacaktır.");
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);

    }
}
