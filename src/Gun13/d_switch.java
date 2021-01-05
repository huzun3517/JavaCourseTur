package Gun13;

import java.util.Scanner;

public class d_switch {

    public static void main(String[] args) {

        // Kullanıcının girdiği gün sayısına karşılık gelen gün adını yazınız.
        // 1.gün Pazartesi olsun

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gün numarası giriniz: ");
        int gunNo = scanner.nextInt();

        switch (gunNo) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı gün numarası...");

        }



    }
}
