package Gun33.a_Example;

public class Static_And_NonStatic_Methods {

    public static void main(String[] args) {
        //TODO
        // Benim bütün programlarımda kullanacağım tip dönüşümleri için metodlara ihtiyacım var.
        // mesala int to string , string to int, vs. vs.. bunları yapan bir sinif yazınız.
        // ve bunları main de kullanarak gösteriniz.

        //1.Yöntem tip dönüşümü için javanın direk komutları
        int sayi = 345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);

  /*    //2.Yöntem tip dönüşümü için kendi sınıfımı yazdım onu kullanacağım.
        Unility util = new Unility();
        strRakam = util.getString(sayi);
        intRakam = util.getInt(strRakam);
   */
        //3.Yöntem
        // yeniden oluşturmadığımız için sınıfın direk adı ile kullanıyoruz.
        strRakam = Unility.getString(sayi);
        intRakam = Unility.getInt(strRakam);

        // Aynı Math sınıfı gibi
        Math.random();



    }
}
