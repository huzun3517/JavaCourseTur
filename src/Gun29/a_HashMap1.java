package Gun29;

import java.util.HashMap;
import java.util.Map;

public class a_HashMap1 {

    public static void main(String[] args) {

        Map<Integer,Integer> m = new HashMap<>();
        m.put(2,11); // 2 anahtarına 11 değeri set edildi.
        m.put(3,12);
        m.put(4,13);
        m.put(2,14); // 2 anahtarındaki değer güncellendi
        System.out.println("m.get(2) = " + m.get(2)); // 2 anahtarındaki değer alındı. m.get(2) = 14
        System.out.println("m.keySet() = " + m.keySet()); // anahtar listesi keyler
        System.out.println("m.values() = " + m.values()); // değerler listesi

        System.out.println("m = " + m); // m = {2=14, 3=12, 4=13}

        //2.Yöntemler
        for (Integer ky: m.keySet()) {
            System.out.println("ky = " + ky);
        }

        //2.Yöntemler
        for (Integer vl: m.values()) {
            System.out.println("vl = " + vl);
        }

        for (Map.Entry<Integer,Integer> anahtarVeDeger: m.entrySet()){
            System.out.print("anahtarVeDeger.getKey() = " + anahtarVeDeger.getKey()); // bu anahtarı veriyor.
            System.out.print(",   anahtarVeDeger.getValue() = " + anahtarVeDeger.getValue()); // bu ise değeri veriyor
            System.out.println();
        }

        boolean buAnahtarVarmi = m.containsKey(2); // 2 şeklinde bir anahtar var mı?
        boolean buDegerVarmi = m.containsKey(12); // 12 değeri var mı?

        System.out.println("buAnahtarVarmi = " + buAnahtarVarmi);
        System.out.println("buDegerVarmi = " + buDegerVarmi);

        m.remove(2);
        System.out.println("remove 2 den sonra m = " + m);

        m.clear();;
        System.out.println("clear dan sonra m = " + m);

        /* ÇIKTI BÖLÜMÜ
        m.get(2) = 14
        m.keySet() = [2, 3, 4]
        m.values() = [14, 12, 13]
        m = {2=14, 3=12, 4=13}
        ky = 2
        ky = 3
        ky = 4
        vl = 14
        vl = 12
        vl = 13
        anahtarVeDeger.getKey() = 2,  anahtarVeDeger.getValue() = 14
        anahtarVeDeger.getKey() = 3,  anahtarVeDeger.getValue() = 12
        anahtarVeDeger.getKey() = 4,  anahtarVeDeger.getValue() = 13
        buAnahtarVarMi = true
        buDegerVarMi = true
        remove 2 den sonra m = {3=12, 4=13}
        clear den sonra m = {}
         */

        
        
        
        
    }
}
