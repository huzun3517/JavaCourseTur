package Gun38.AccessModifier.b_finalModifier.example2;

public class persons {

    public static void main(String[] args) {

        Person kisi1 = new Person("ismet",12);
        // kisi1.fingerprintCode = 15; // değer değiştirilemez. çünkü ilk değeri aldı.
        System.out.println("kisi1 = " + kisi1);
        
        Person kisi2 = new Person("ahmet",15);
       //  kisi2.fingerprintCode = 17; değiştirilemez.
        System.out.println("kisi2 = " + kisi2);
        
    }
}
