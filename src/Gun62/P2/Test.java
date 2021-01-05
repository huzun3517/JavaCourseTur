package Gun62.P2;

import Gun62.P1.Acc;

public class Test extends Acc {

    public static void main(String[] args) {

        Acc obj = new Test();
 //       obj.s  // sadece public olana ulaşabildik protected a ulaşamadık çünkü referansı child class referansı değildi.

        // Alttaki gibi child class referans olduğunda protected a ulaşılabilidi.
        Test obj2 = new Test();
//        obj2.r
//        obj2.s

    }
}
