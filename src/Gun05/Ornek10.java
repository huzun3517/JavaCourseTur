package Gun05;

public class Ornek10 {

    public static void main(String[] args) {

        // String olarak verilen true veya false değerini, boolean türüne
        // çevirerek yazdırınız.
        
        String cevapEvet = "True";
        String cevapHayir = "False";


        boolean cevapE = Boolean.parseBoolean(cevapEvet);
        boolean cevapH = Boolean.parseBoolean(cevapHayir);

        System.out.println("cevapE = " + cevapE);
        System.out.println("cevapH = " + cevapH);
        System.out.println("cevaplarınız = " + cevapE + " -" + cevapH);
    }
}
