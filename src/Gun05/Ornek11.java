package Gun05;

public class Ornek11 {

    public static void main(String[] args) {

        // String olarak verilen Gece ve Gündüz hava sıcaklığı bilgisinin toplamını yazdırınız.


        String gunduzStr = "10";
        String geceStr = "25";

        int gunduzDerece = Integer.parseInt(gunduzStr);
        int geceDerece = Integer.parseInt(geceStr);

        int toplamDerece = gunduzDerece + geceDerece;
        System.out.println("ToplamDerece = " + toplamDerece);
    }
}
