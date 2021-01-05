package Gun07;

public class b_StringCharAt {

    public static void main(String[] args) {
        // istenen noktadaki harfi verir, karakterlerin sırası 0 dan başlar, buna index denir.
                //      0123456789
        String kelime ="Merhaba Dünya";

        char harf = kelime.charAt(3); // 3.index i verir. yani h harfini verir.
        System.out.println("3.harf = " + harf); // 3 --> h

        harf = kelime.charAt(0);
        System.out.println("0.harf = " + harf); // 0 --> m



    }
}
