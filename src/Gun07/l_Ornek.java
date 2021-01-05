package Gun07;

import java.util.Scanner;

public class l_Ornek {

    public static void main(String[] args) {
        // Kullanıcıdan okunan 2 kelimelik ad ve soyadı, ekrana ilk harfleri ve nokta şeklinde yazdırınız.
        // Örnek Ahmet Yılmaz -> A.Y.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ad Soyad : ");
        String  adsoyad = scanner.nextLine(); // birden fazla kelime, yani satırı tümden okuyoruz.

        char adilkharf = adsoyad.charAt(0);
        int boslukNerde = adsoyad.indexOf(" "); // bu index in 1 fazlası herzaman soyadın ilk harfidir.
        char soyadilkharf = adsoyad.charAt(boslukNerde+1);

        System.out.println(adilkharf + "." + " " + soyadilkharf + ".");









    }
}
