package Gun07;

public class g_StringEqualslgnoreCase {

    public static void main(String[] args) {
        // 2 String büyük küçük karakter ayrımı yapmadan karşılaştırır.
        // Sonuç boolean değişkenidir.

        String str = "Merhaba";

        System.out.println("Eşit mi = " + str.equalsIgnoreCase("mERHaba")); //true
        System.out.println("Eşit mi = " + str.equalsIgnoreCase("mERHa"));   // false

        boolean esitMi = str.equalsIgnoreCase("mERHaba");
        // boolean değişkenine atanabilir, kontrol sonucu
        System.out.println("esitMi = " + esitMi);

    }
}
