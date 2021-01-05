package Gun08;

public class o_Ozet {

    public static void main(String[] args) {

        String text = "Merhaba Dünya";

        boolean basliyorMu_ME = text.startsWith("ME");  // false
        System.out.println("Me ile başlıyor mu ? = " + basliyorMu_ME);

        boolean bitiyorMu_ya = text.endsWith("ya");
        System.out.println("ya ile bitiyor mu ? = " + text.endsWith("ya")); // true

        System.out.println("Küçük harf hali = " + text.toLowerCase());  // merhaba dünya

        System.out.println("Küçük harf hali = " + text.toUpperCase());  // MERHABA DÜNYA

        String text2 = "           Merhaba Dünya              ";
        System.out.println("baş ve sondaki boşlukların temizlenmiş hali = ->" + text.trim() + "<-");  // Merhaba Dünya

        System.out.println("(tüm)a-> e  = " + text.replace('a','e')); //  Merhebe Dünye
        System.out.println("(ilk)a-> e= " + text.replaceFirst("a","e")); // Merheba Dünya

        System.out.println("Büyük harfleri -> _ = " + text.replaceAll("[A-Z]","_")); // _erhaba _ünya

        System.out.println("harflerin x yapılmış hali = " +
        text.replaceAll("[A-Z]","x").replaceAll("[a-z]","x")); // xxxxxxx xüxxx








    }
}
