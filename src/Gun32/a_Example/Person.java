package Gun32.a_Example;

public class Person {
    // fields, attributes, properties
    String name;
    String surname;
    int age;

    // methods
    void BilgiYazdir(){ // 3.Yöntem ait olduğu class a ekleniyor

        System.out.print("kisi.name = " + name);
        System.out.print("   kisi.surname = " + surname);
        System.out.println("   kisi.age = " + age);
    }

    int getBirthYear() {

        return 2020-age;
    }

    String getInitials() {

        return name.toUpperCase().charAt(0) + "." + surname.toUpperCase().charAt(0) + ".";
    }


}

