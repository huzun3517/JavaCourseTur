package Gun37.instanceModifiers.c_privateModifier.same;

public class Person {

    int id;
    String name;
    String username;
    private String password;

    public void SifreBelirle(String sifre){
        if (sifre.length() >= 8) {

            this.password = sifre;
        }

        else {
            System.out.println("en az 8 karakter olmalı");
        }
    }

    public void SifreGoster(){
        if (this.password != null){
            System.out.println("****" + this.password.substring(4));
            //System.out.println(this.passwort.substring(0,passwort.length()-4) + "****");
        }


    }
}