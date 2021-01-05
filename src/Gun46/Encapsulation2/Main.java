package Gun46.Encapsulation2;

public class Main {

    public static void main(String[] args) {

        Araba honda = new Araba();

        honda.setRenk("kırmızı");
        honda.setModel("civic");
        honda.setKapiSayisi(2);
        honda.setMotor(4500);

        Araba porsche = new Araba("mavi","912Turbo",3600,2);

        Araba toyota = new Araba("beyaz","camry",1600,-2);

        System.out.println("toyota.getKapiSayisi() = " + toyota.getKapiSayisi());





    }
}
