package Gun07;

public class k_StringSubstring {

    public static void main(String[] args) {
        // Substring : String in belli bir bölümünü alma işlemi

        String text = "Merhaba arkadaşlar";

        System.out.println("1.bölüm = " + text.substring(1,5)); // (erha)  1 nolu index ten 5 e kadar 5 dahil değil.
        System.out.println("2.bölüm = " + text.substring(0,3)); // Mer
        System.out.println("3.bölüm = " + text.substring(4)); //  verilen index ten itibaren sonuna kadar alır.
                                                               // aba arkadaşlar

        String strAlinan = text.substring(0,3); // bu şekilde alınan parça atanabilir.
        System.out.println("2.bölüm = " + strAlinan);


    }


}
