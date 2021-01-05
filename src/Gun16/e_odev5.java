package Gun16;

public class e_odev5 {

    public static void main(String[] args) {

        //    5-Bir çalışanın başlangıç maaşı 2000 tl olsun.her yıl %15 zam yapılırsa,
        //    5 yıl sonra çalışanın maaşı kaç lira olur.

        int maas = 2000;
        int i = 0;
        while (i <=5) {
            maas = (maas*15)/100 + maas;
            i++;
        }
        System.out.println(maas);
    }
}
