package Gun22;

public class c_Methods3 {

    public static void tekMiCiftMi(int sayi) {

        if (sayi % 2 == 1)
            System.out.println("Tek");
        else
            System.out.println("Çift");
    }


    public static void topla(int a, int b) {

        System.out.println("Toplam = " + (a + b));
    }


    public static void main(String[] args) {

        tekMiCiftMi(3);
        tekMiCiftMi(4);

        topla(3,4);
        topla(43,64);

    }
}
