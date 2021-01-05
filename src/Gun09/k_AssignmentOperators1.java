package Gun09;

public class k_AssignmentOperators1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 2;

        a+=5; // a = a + 5; le aynı, kısa yazılışı -> a = 15;
        System.out.println("a = " + a);

        a-=5; // a = a-5 le aynı -> a = 10; (en son değer alınır bir üstte 5 artmıştı.)
        System.out.println("a = " + a);

        a*=2; // a = a * 2; le aynı -> a = 20; (en son değer 10 du)
        System.out.println("a = " + a);

        a/=2; // a = a / 2; le aynı -> a = 10; (en son değer 20 idi)
        System.out.println("a = " + a);

        a%=2; // a=a%2 le aynı -> a = 0 (en son değer 10 idi)
        System.out.println("a = " + a);
    }
}
