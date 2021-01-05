package Gun08;

import java.util.Scanner;

public class a_Odev1 {

    public static void main(String[] args) {

        // Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y. formatıyla yazdırınız

        Scanner scanner = new Scanner(System.in);

        System.out.print("3 isim giriniz : ");
        String isim = scanner.nextLine();

        char isim1_ilk = isim.charAt(0);

        int ilk_bosluk = isim.indexOf(" ");
        char isim2_ilk = isim.charAt(ilk_bosluk + 1);

        int son_bosluk = isim.lastIndexOf(" ");
        char isim3_ilk = isim.charAt(son_bosluk + 1);

        System.out.println("İsminiz = " + isim1_ilk + "." + isim2_ilk + "." + isim3_ilk + ".");
    }
}
