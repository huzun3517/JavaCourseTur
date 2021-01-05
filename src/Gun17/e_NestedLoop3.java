package Gun17;

public class e_NestedLoop3 {

    public static void main(String[] args) {
/*
         TODO Alttaki çarpım tablosunu 10x10 a kadar ekrana yazdırınız.
         1 x 1 = 1
         1 x 2 = 2
         1 x 3 = 3
         1 x 4 = 4
         1 x 5 = 5
         1 x 6 = 6
         1 x 7 = 7
         1 x 8 = 8
         1 x 9 = 9
         1 x 10 = 10

         */

        for (int i =1; i<=10; i++) { // dış döngü

            for (int j=1; j<=10;j++){ // iç döngü
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("**********");
        }

    }
}
