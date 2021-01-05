package Gun51._02_finalAttribute2;

public class Arabalar {

    public static void main(String[] args) {

        Araba araba = new Araba("Opel");
        System.out.println("araba.model = " + araba.model);

//      araba.model = "ford"; // final tipi değişkenlerde ilk değer sadece tanımlandığı yerde veya
                              // Constructur da atanabilir. Sonradan değiştirilemez.

        Araba araba2 = new Araba("ford");
    }
}
