package Gun07;

public class j_StringLastIndexOf {

    public static void main(String[] args) {
        // String içinde aranan karakter(ler) in sondan itibaren ilk index ini verir.
        // indexOf un sondan olan hali fakat index numaraları değişmez.

        String text = "Good";
        System.out.println("En sondaki o nun indexi = " + text.lastIndexOf("o")); // 2
        System.out.println("İlk baştan o nun indexi = " + text.indexOf("o")); // 1

        System.out.println("**************************************");

        String text2 = "Merhaba Arkadaşlar";
        System.out.println("En sondaki a nın indexi = " + text2.lastIndexOf("a")); // 16
        System.out.println("İlk baştan a nın indexi = " + text2.indexOf("a")); // 4
    }
}
