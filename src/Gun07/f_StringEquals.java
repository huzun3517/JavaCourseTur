package Gun07;

public class f_StringEquals {

    public static void main(String[] args) {
        // 2 String in birebir eşit olup olmadığını kontrol eder. Sonuç boolean değişkenidir.
        
        String str = "Merhaba";
        boolean birebirEsitMi = str.equals("Merhaba");
        System.out.println("birebirEsitMi = " + birebirEsitMi); // true

        System.out.println("birebirEsitMi = " + str.equals("merhaba"));  // false
    }
}
