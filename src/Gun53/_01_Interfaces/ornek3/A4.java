package Gun53._01_Interfaces.ornek3;

// birden fazla interface den implemente edilebilir.
public class A4 implements IYazdirilabilir, IGosterilebilir  {

    @Override
    public void goster() {
        System.out.println("Gösterildi...");
    }

    @Override
    public void yaz() {
        System.out.println("Yazdırıldı...");
    }
}
