package Gun09;

public class h_Modul {
    public static void main(String[] args) {

        // Modul : kalanı verir

        System.out.println("10 % 3 = " + (10 % 3)); // 10 un 3 e bölümünden kalan 1 dir.
        System.out.println("3 % 10 = " + (3 % 10)); // modul işleminde sol taraf, sağdan küçük ise
                                                    // sonuç sol taraftaki sayıdır.

        System.out.println("11 % 2 = " + (11 & 2));
        System.out.println("10 % 2 = " + (10 & 2));
        // 2 ye göre modülde sonuç 1 veya 0 dır. Bu bize sayının tek mi çift mi olduğunu verir.

    }




}
