package Gun53._01_Interfaces.ornek2;

public class Grafikler {

    public static void main(String[] args) {

        // bir interface den bir çok class implemente edilebilir.
        Cember cember = new Cember();
        Dikdortgen dikdortgen = new Dikdortgen();

        cember.ciz();
        dikdortgen.ciz();

        // interface leren nesne üretilemez fakat referans tipi oluşturulabilir.
        // bu bize Polymorphism sağladı.
        ICizilebilir cember2 = new Cember();
        cember2.ciz();


    }
}
