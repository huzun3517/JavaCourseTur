package Gun27;

import java.util.ArrayList;
import java.util.HashSet;

public class a_HashSet1 {

    public static void main(String[] args) {
        // Array --> ArrayList --> Set?
        // Collections : Kolleksiyonlar
        // HashSet : Kendine göre bir algoritma ile sıralayarak saklıyor. Gezinme hızlı
        // LinkedHashSet : Kullanıcının ekleme sırasına göre saklıyor.
        // TreeSet : her veri girildiğinde tüm verileri küçükten büyüğe olacak şekilde sıralayarak saklıyor.
        // Avantajı : aynı elemanı 2 kez eklemiyor

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        System.out.println("list = " + list);

        HashSet<Integer> hs = new HashSet<>();

        // Set<Integer> hs = new HashSet<>();

        boolean eklediMi1 = hs.add(1); // true
        boolean eklediMi2 = hs.add(2); // true
        boolean eklediMi3 = hs.add(3); // true
        boolean eklediMi4 = hs.add(3); // Daha önce eklendiği için eklenmeyecek sonuç false
        boolean eklediMi5 = hs.add(2); // Daha önce eklendiği için eklenmeyecek sonuç false
        System.out.println("eklediMi = " + eklediMi5);

        System.out.println("hs = " + hs);
        


    }
}
