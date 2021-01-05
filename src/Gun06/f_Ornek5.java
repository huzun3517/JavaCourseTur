package Gun06;

import java.util.Scanner;

public class f_Ornek5 {

    public static void main(String[] args) {

    /*  Kullanıcıdan kaç bilet istediğini(int) ve sigorta isteyip istemediğini
        (boolean olarak) alıp ekrana yazdırınız.
     */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç bilet istiyorsunuz : ");
        int bilet = scanner.nextInt();

        System.out.print("Sigorta ister misiniz? : ");
        boolean sigorta = scanner.nextBoolean();

        System.out.println("Bilet sayısı: " + bilet);
        System.out.println("Sigorta durumu: " + sigorta);


    }
}
