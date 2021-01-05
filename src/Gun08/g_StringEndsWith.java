package Gun08;

public class g_StringEndsWith {

    public static void main(String[] args) {

        // Strin in belirtilen String ile sona erip ermediğini verir.

        String text = "Merhaba Dünya";

        System.out.println("ya ile bitiyor mu ? = " + text.endsWith("ya"));
        System.out.println("a ile bitiyor mu ? = " + text.endsWith("a"));
        System.out.println("A ile bitiyor mu ? = " + text.endsWith("A"));
        System.out.println("y ile bitiyor mu ? = " + text.endsWith("y"));
        System.out.println("ba ile bitiyor mu ? = " + text.endsWith("ba"));



    }
}
