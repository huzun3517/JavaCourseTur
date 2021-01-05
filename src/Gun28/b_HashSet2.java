package Gun28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b_HashSet2 {

    public static void main(String[] args) {

        // RemoveAll, RetainAll, AddAl
        Set<Integer> hs1 = new HashSet<>(Arrays.asList(1,2,3,4,5)); // bu işlem hs1.add(1); hs2.(2)... ile aynı
        Set<Integer> hs2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9,45));
        
        // retainAll : Kesişim
        Set<Integer> hsKesisim = new HashSet<>(hs1); // hs1 den kopya oluşturduk.
        hsKesisim.retainAll(hs2); // hs1 ile hs 2 nin kesişimi bulundu.
        System.out.println("hsKesisim = " + hsKesisim); // Ortak elemanlar bulundu
        
        Set<Integer> hsFark = new HashSet<>();
        // Kopya Oluşturmanın 2.Yöntemi
        hsFark.addAll(hs1); // hs1 in  tamamı hsFark a atandı
        hsFark.removeAll(hs2);
        System.out.println("hsFark = " + hsFark);

        



    }
}
