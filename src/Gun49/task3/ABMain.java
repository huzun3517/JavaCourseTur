package Gun49.task3;

public class ABMain {

    public static void main(String[] args) {

        A a = new A();
        System.out.println("a.mesaj = " + A.mesaj);
        
        B b = new B();
        System.out.println("B.mesaj = " + B.mesaj);
        System.out.println("b den sonra a nın durumu = " + A.mesaj);
        // Static değişkenlerin olduğu classlardan oluşturulan subclaslarda, static değişkenin değeri değiştirildiğinde,
        // super classdaki de değişir.Çünkü static değişkenler hafızada tek bir değeri gösterirler.


    }
}
