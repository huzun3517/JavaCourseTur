package Gun19;

import java.util.Arrays;

public class c_ArraysMethods {

    public static void main(String[] args) {

        // Arrays.toString(Array) --> dizinin bütün elemanlarını yazdırır.
        String[] names = {"ahmet","ayşe","kaya","deniz"};
        System.out.println(".toString : " + Arrays.toString(names));
        System.out.println("*******************************************************");

        //Arrays.sort(array) diziyi sıralar.
        Arrays.sort(names);
        System.out.println(".sort : " + Arrays.toString(names));
        System.out.println("*******************************************************");

        //Arrays.equals(array1,array2) --> Bütün elemanların sırası ile aynı olup olmadığını kontrol eder.
        int[]a = {1,2,3};
        int[]b = {1,2,3};
        int[]c = {2,1,3};
        System.out.println("a==b " + Arrays.equals(a,b)); //true
        System.out.println("a==c " + Arrays.equals(a,c)); //false
        System.out.println("*******************************************************");

        // Arrays.fill(array,value); bütün elemanlara value değerini atar.
        int[] numbers = new int[5];
        System.out.println("atamadan önce değerler: " + Arrays.toString(numbers));
        System.out.println("*******************************************************");

        Arrays.fill(numbers,7);
        System.out.println("atamadan sonra değerler: " + Arrays.toString(numbers));
        System.out.println("*******************************************************");

        // Arrays.binarySearch(array,value) sıralı bir dizide aranan değer var ise
        // index ini verir, yok ise - değer döndürür.

        int[] rakamlar = {2,7,4,13,8,12,6,3};
        System.out.println("önce : 8 in ind= " + Arrays.binarySearch(rakamlar,8)); // --> -4
        // sıralı olmadığı için bulamadı - değer aldı.
        Arrays.sort(rakamlar);
        System.out.println("önce : 8 in ind= " + Arrays.binarySearch(rakamlar,8)); // --> 5
        System.out.println("*******************************************************");





    }
}
