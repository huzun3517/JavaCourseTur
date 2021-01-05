package Gun13;

import java.util.Scanner;

public class b_if2 {

    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Fizik: 90 şeklinde gir:");
        String str = oku.nextLine();

        int bosluk = str.indexOf(" ");
        int not = Integer.parseInt(str.replaceAll("[^0-9]",""));

    //  int not = Integer.parseInt((str.substring(str.indexOf(" ") + 1)));
        //ÇOK ÖNEMLİ!!!

        if (not >= 90) {
            System.out.println("A");
        }
        else if (not >= 80){
            System.out.println("B");
        }
        else if (not >= 70) {
            System.out.println("C");
        }
        else if (not >= 60) {
            System.out.println("D");
        }
        else if (not >= 40) {
            System.out.println("E");
        }
        else {
            System.out.println("F");
        }

    }
}
