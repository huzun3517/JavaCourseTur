package Gun05;

public class Ornek6 {

    public static void main(String[] args) {

        // sayılar arası dönüşüm

        int sayi = 5;
        double rakam = 55.67;

        rakam = sayi;   // otomatik rakam
        sayi = (int)rakam;  // manuel

        // sayıyı string dönüştürme
        String yazi = Integer.toString(sayi);
        String yazi2 = Double.toString(rakam);

        System.out.println("yazi = " + yazi);
        System.out.println("yazi2 = " + yazi2);

       /* // String den sayıya dönüştürme
        String yaziIle = "25";
        int rakamHali = Integer.parseInt(yaziIle);
        byte byteHali = Byte.parseByte(yaziIle);
        int toplam = rakamHali + sayi;

        */



    }
}
