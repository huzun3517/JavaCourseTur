package Gun07;

public class m_Ozet {

    public static void main(String[] args) {

        String cumle = "Bu gün hava yağmurlu";

        int uzunluk = cumle.length();
        System.out.println("uzunluk = " + uzunluk);   // uzunluk = 20

        char karakter = cumle.charAt(7);
        System.out.println("7.karakter = " + karakter);  // 7.karakter = h

        String cumle2 = "arkadaşlar";
        System.out.println(cumle.concat(" " + cumle2));  // Bu gün hava yağmurlu arkadaşlar

        boolean varMi = cumle.contains("hava");
        System.out.println("hava varmı = " + varMi);  //  hava varmı = true

        boolean birebirEsitMi = cumle.equals("Bu Gün Hava Yağmurlu");
        System.out.println("birebir eşit mi = " + birebirEsitMi);  //  birebir eşit mi = false

        boolean esitMi = cumle.equalsIgnoreCase("BU GÜN HAVA YAĞMURLU");  //  eşit mi = true
        System.out.println("eşit mi = " + esitMi);

        int index = cumle.indexOf("ğ");
        System.out.println("ğ nin indexi = " + index);  //  ğ nin indexi = 14

        int sonindex = cumle.lastIndexOf("u");
        System.out.println("u nun sonindexi = " + sonindex);  //  u nun sonindexi = 19

        boolean bosMu = cumle.isEmpty();
        System.out.println("String cumle içi boş mu = " + bosMu);  //  String cumle içi boş mu = false

        String alinan = cumle.substring(0,6);
        System.out.println("alınan kısım = " + alinan);  //  alınan kısım = Bu gün

        String alinan2 = cumle.substring(7);
        System.out.println("alınan kısım = " + alinan2);  //  alınan kısım = hava yağmurlu
    }
}
