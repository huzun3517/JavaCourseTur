package Gun27;

import java.util.HashSet;

public class c_HashSet3 {

    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);
        System.out.println("birlesik hali = " + birlestir(setA,setB));
        System.out.println(" Farkı = " + farkiBul(setA,setB));
        System.out.println("Kesişimi = " +kesisimBul(setA,setB) );

    }
    public static HashSet<Integer> birlestir (HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer>birlesik = new HashSet<>();
        birlesik.addAll(a);
        birlesik.addAll(b);

        //2.yol
    //    a.addAll(b);
    //    return a;

        return birlesik;
    }

    public static HashSet<Integer> farkiBul (HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer> fark = new HashSet<>(a); // fark a ya eşit oluyor.
        fark.removeAll(b);

        return fark;
    }

    public static HashSet<Integer> kesisimBul (HashSet<Integer> a, HashSet<Integer> b) {

        HashSet<Integer> kesisim = new HashSet<>(a); // kesişim a ya eşit oluyor
        kesisim.retainAll(b);

        return kesisim;
    }


}
