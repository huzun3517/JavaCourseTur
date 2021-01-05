package Gun09;

public class i_ArithmeticOperators3 {

    public static void main(String[] args) {

        // artırma ve azaltma operatörü
        int a = 5;
        int b= 2;
        int k = 0;

        a++; // a nın değerini bir artır-> a = a + 1 le aynı. -> 6
        System.out.println("a= " + a);

        ++a; // a nın değerini bir artır-> a = a + 1 le aynı. -> 7
        System.out.println("a= " + a);

        k = a++;  // ++ lar sağda olduğu için, önce k = a çalışır, sonra  a = a+1 çalışır. -> k = 7, a= 8
        System.out.println("a = " + a + "," + "k = " + k);

        k = ++a;  // ++ lar solda olduğu için, önce a = a + 1 çalışır, sonra  k = a olur. - > k =9, a = 9
        System.out.println("a = " + a + "," + "k = " + k);

        a--; // a nın değerini bir azaltır-> a = a - 1 le aynı. -> 8
        System.out.println("a= " + a);

        --a; // a nın değerini bir azaltır-> a = a - 1 le aynı. -> 7
        System.out.println("a= " + a);

        k = a--;  // -- ler sağda olduğu için, önce k = a çalışır, sonra  a = a-1 çalışır. -> k = 7, a= 6
        System.out.println("a = " + a + "," + "k = " + k);

        k = --a;  // -- ler solda olduğu için, önce a = a - 1 çalışır, sonra  k = a olur. - > k =5, a = 5
        System.out.println("a = " + a + "," + "k = " + k);
    }
}
