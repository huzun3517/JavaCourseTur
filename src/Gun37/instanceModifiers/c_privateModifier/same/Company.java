package Gun37.instanceModifiers.c_privateModifier.same;

public class Company {

    public static void main(String[] args) {

        Person personel = new Person();
        personel.id = 1;
        personel.name = "Ahmet";
        personel.username = "ahmet";
    //  personel.password = "1234";
    //  burası private olduğundan direk erişilemez.

        personel.SifreBelirle("1234a");

        personel.SifreGoster();




    }
}
