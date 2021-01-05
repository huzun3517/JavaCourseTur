package Gun08;

public class k_StringReplace {

    public static void main(String[] args) {
        // Replace : Bir String in içerisindeki istenen karakter(leri)n hepsini,
        // verilen yenisi ile değiştirir.

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("a ların e olarak değitirilmiş hali = " + text.replace('a','e'));
        System.out.println("ba -> de hali = " + text.replace("ba","de"));
        System.out.println("Dünya -> Java hali = " + text.replace("Dünya","Java"));
    }
}
