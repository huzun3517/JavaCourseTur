package Gun55.Ornek2;

public class Main {

    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen("Dikdörtgen",4,5);
        Cember cember = new Cember("Cember", 3);

        dikdortgen.ciz();
        System.out.println(dikdortgen);

        System.out.println("------------------");
        System.out.println(dikdortgen.toString2());

        System.out.println("------------------");

        cember.ciz();
        System.out.println(cember);
    }
}
