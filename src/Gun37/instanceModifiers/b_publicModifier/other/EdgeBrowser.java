package Gun37.instanceModifiers.b_publicModifier.other;

import Gun37.instanceModifiers.b_publicModifier.same.SearchEngine;

public class EdgeBrowser {

    public static void main(String[] args) {
        
        // diğer paketteki bu constructor a ulaşabildim.Çünkü public.
        SearchEngine microsoft = new SearchEngine("explorer");
        microsoft.name = "Edge";// diğer paketteki bu fileda ulaşabildim.

        System.out.println("microsoft = " + microsoft);
    }
}
