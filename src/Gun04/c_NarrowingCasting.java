package Gun04;

public class c_NarrowingCasting {  // Büyükten küçüğe dönüştürme

    // double -> float -> long -> int -> char -> short ->  byte     : manuel dönüşüm

    public static void main(String[] args) {

        double vergi = 6.256;
        int yuvarlanmısVergi = (int)vergi;
        System.out.println("yuvarlanmısVergi = " + yuvarlanmısVergi);

    }
}
