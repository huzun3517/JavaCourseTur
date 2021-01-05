package Gun09;

public class g_Bolme {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("a/b = " + (a/b)); // int 2 sayının bölüm sonucu tam sayıdır. 3

        System.out.println("a/b = " + (double)a/b);
        // ondalıklı sonuç istiyorsak değişkenlerinden birisini double veya float  çevireceğiz,
        // 1 tanesi yeterli, hassasiyet 15 hane

        System.out.println("a/b = " + (float)a/b); // hassasiyet 7 hane

        double c = 3.14;
        double d = 2.1;
        System.out.println("c/d = " + c/d); // zaten sayılar double olduğu için sonuç double olacaktır.

        // (double)(a/b)   -> bu bölüm parantezin içinde zaten ondalıksız gelecektir.
        // (double)a / b   -> burada sonuç ondalıklı gelecektir.


    }
}
