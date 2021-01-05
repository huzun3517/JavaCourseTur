package Gun18;

public class c_Array2 {

    public static void main(String[] args) {

        int sayi;

        int[] dizi1 = new int[5]; // 0,1,2,3,4 indexli 5 adet eleman

        System.out.println("dizi1.length = " + dizi1.length);

        for (int i =0; i < dizi1.length; i++){

            System.out.println("Dizinin " + i + ".Elemanı = " + dizi1[i]); // aynı CharAt(i) gibi
        }

     //   System.out.println(dizi1[5]); burada dizinin boyunu aştığı için hata verecek.
     //                                 java.lang.ArrayIndexOutOfBoundsException: 5
    }
}
