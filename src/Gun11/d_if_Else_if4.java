package Gun11;

import java.util.Scanner;

public class d_if_Else_if4 {

    public static void main(String[] args) {
        // Girilen bir sayının pozitif mi negatif mi olduğunu yazdırınız.
        // 3 ihtimal var. pozitif-negatif-sıfır

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi gir: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Pozitif");
        }
        else if (sayi < 0){
            System.out.println("Negatif");
        }
        else {
            System.out.println("Sıfır");
        }


    }
}
