package Gun38.AccessModifier.a_staticModifier;

public class a_Simple {

    int a; // oluşturulacak herbir nesnenin kendi değişkeni
    static int b; // bu static anahtarı ile sınıfın bir değişkeni oluyor.

    void  increase(){

        a++;
        b++;
    }



    public static void main(String[] args) {

        a_Simple ornek = new a_Simple();
        ornek.a = 5;

        a_Simple ornek2 = new a_Simple();
        ornek2.a = 7;

        a_Simple.b = 5; // b değeri sınıfa ait olduğundan 1 tanedir ve değer atandıkça değişir.
        a_Simple.b = 7;

        ornek.increase(); // ornek.a= a=6, Simple.b = 8;
        ornek2.increase(); // ornek2.a = 8, Simple.b = 9;
        
        // şu anda a ve b nin değerleri kaçtır;
        System.out.println("ornek.a = " + ornek.a); // 6
        System.out.println("ornek2.a = " + ornek2.a); // 8
        System.out.println("Simple.b = " + a_Simple.b); // 9




    }
}
