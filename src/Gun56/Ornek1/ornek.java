package Gun56.Ornek1;

 class C {

    public C(){

        System.out.println("C ");
    }
}

class B extends C{

    public B() {
        // super(); yandaki metod yazılsa da yazılmasa da Önce super Constructor cagrılıyor
        System.out.println("B ");
    }
}

class A extends B {
     // super(); yandaki metod yazılsa da yazılmasa da Önce super Constructor cagrılıyor

    public A() {
        System.out.println("A ");
    }

}

public class ornek {

    public static void main(String[] args) {

        A a = new A();
    }


}


