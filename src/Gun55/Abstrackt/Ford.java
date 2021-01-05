package Gun55.Abstrackt;

public class Ford extends BinekOto  {

    //todo Abstrackt method olduğundan zorunlu olarak yazılmak zorunda (imlemente edildi.)
    @Override
    public String getMarka() {
        return "Ford Focus";
    }

    // todo Abstrackt class daki yazılmış somut method ları ister olduğu gibi kullanabiliriz
    //  istenirse override yapabiliriz.
    @Override
    public int getUretimYili() {
        return super.getUretimYili();
    }
}
