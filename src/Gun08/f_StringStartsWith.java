package Gun08;

public class f_StringStartsWith {

    public static void main(String[] args) {
        // StartsWith : Bir String in verilen String ile başlayıp başlamadığını kontrol eder.

        String text = "Merhaba Dünya";

        System.out.println("ME ile başlıyor mu ? " + text.startsWith("ME"));
        System.out.println("Me ile başlıyor mu ? " + text.startsWith("Me"));
        System.out.println("M ile başlıyor mu ? " + text.startsWith("M"));
        System.out.println("k ile başlıyor mu ? " + text.startsWith("k"));

    }
}
