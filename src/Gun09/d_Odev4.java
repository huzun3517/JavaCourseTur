package Gun09;

import java.util.Scanner;

public class d_Odev4 {

    public static void main(String[] args) {

        /*
        4- Kullanıcdan alacağınız şifreniz sizin sabit belirlediğiniz şifre ile aynı olup olmadığını,
        büyük küçük harf ayırımı olmadan kontrol ederek sonucu yazdırınız     */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Şifre giriniz: ");
        String al_sifre = scanner.nextLine();
        String parolam = "Hu.12345";

        boolean ayniMi= al_sifre.equalsIgnoreCase(parolam);
        System.out.println(ayniMi);





    }
}
