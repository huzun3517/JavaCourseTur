package Gun05;

public class Ornek8 {

    public static void main(String[] args) {

        // String den sayıya dönüştürme

        String ekrandanGelen1 = "500"; // 1.bağış
        String ekrandanGelen2 = "1000"; // 2.bağış

       // int toplamBagis = ekrandanGelen1 + ekrandanGelen2;  // java hata verdi. sayı değil çünkü.
        
        int bagis1 = Integer.parseInt(ekrandanGelen1);
        int bagis2 = Integer.parseInt(ekrandanGelen2);

        int toplamBagis = bagis1 + bagis2; // evet artık sayı haline dönüştürülünce, toplanabildi.
        System.out.println("toplamBagis = " + toplamBagis);

    }
}
