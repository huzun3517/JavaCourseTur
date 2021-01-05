package Gun07;

public class e_Contains {

    public static void main(String[] args) {
        // Bir String in içerisinde karakter(ler) in var olup olmadığını kontrol eder.
        // Sonucu boolean değişkeni olarak döndürür.

        String str = "Hello";
        System.out.println("llo var mı = " + str.contains("llo")); // true
        System.out.println("o var mı = " + str.contains("o"));  // true
        System.out.println("k var mı = " + str.contains("k"));  // false
        System.out.println("O var mı = " + str.contains("O")); // false

        boolean varMi = str.contains("Hel");
        System.out.println("Hel var mı = " + varMi); // true
    }
}
