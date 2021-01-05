package Gun08;

public class m_StringReplaceAll {

    public static void main(String[] args) {

        // ReplaceAll : replace gibi çalışır, farkı kritere göre değiştirir.

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);

        System.out.println("a,b,n leri __ yapılmış hali = " + text.replaceAll("[abn]","_"));

        System.out.println("Büyük harfleri  _ yapılmış hali = " + text.replaceAll("[A-Z]","_"));

        System.out.println("harflerin x yapılmış hali = " +
        text.replaceAll("[A-Z]","x").replaceAll("[a-z]","x")); //



    }
}
