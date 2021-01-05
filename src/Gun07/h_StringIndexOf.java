package Gun07;

public class h_StringIndexOf {

    public static void main(String[] args) {
        // Verilen karakter(ler) in String içerisindeki başlangıç index ini verir.
        // contains den farkı index ini verir, contains ise true false

        String text = "Good";
        System.out.println("G harfinin indexi = " + text.indexOf("G"));  // index ler 0 dan başlar.
        System.out.println("d harfinin indexi = " + text.indexOf("d"));  // 3
        System.out.println("H harfinin indexi = " + text.indexOf("H")); // -1 bulunamad, yok
        System.out.println("od nin indexi = " + text.indexOf("od")); // var ise ilk harfin index ini verir.

        int index = text.indexOf("o"); // int değişkene atanabilir
        System.out.println("o harfinin indexi = " + index); // birden fazla ise ilkini verir.


    }
}
