package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class d_ArrayList4 {

    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Array.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(69);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        System.out.println("Sıralı değil = " + numbers); // Sıralı değil = [69, 3, 1, 2]

       // Sıralama yapar
        Collections.sort(numbers);
        System.out.println("Sıralı= " + numbers); // Sıralı= [1, 2, 3, 69]

        // en büyük değeri bulur
        int max = Collections.max(numbers);
        System.out.println("max = " + max); // max = 69

        // en küçük değeri bulur
        int min = Collections.min(numbers);
        System.out.println("min = " + min); // min = 1

        //listeyi tersine çevirir.
        Collections.reverse(numbers);
        System.out.println("ters = " + numbers); // ters = [69, 3, 2, 1]

        //bütün elemanlara bir değer atama.
        Collections.fill(numbers,101);
        System.out.println("fill den sonra = " + numbers);  // fill den sonra = [101, 101, 101, 101]

        //belli bir değere sahip elemanları yenisi ile değiştirir.
        Collections.replaceAll(numbers,101,5);
        System.out.println("replaceAll dan sonra = " + numbers); // replaceAll dan sonra = [5, 5, 5, 5]


    }
}
