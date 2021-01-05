package Gun48.task1;

public class AracPark {

    //TODO
    // 1- Arac isimli bir superclass olusturunuz, fields : renk, motor, model(protected) olsun.
    // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuSayisi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf oluşturunuz ve Otobus ten
    //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.


    public static void main(String[] args) {


        Otobus otobus1 = new Otobus("mavi",4500,"Mercedes",45);
        System.out.println("otobus1.toString() = " + otobus1.toString());
        System.out.println("otobus1 = " + otobus1);

    }
}
