package Gun39;

public class mainStringArgument {

    // mainStringArgument dosya1 dosya2
    public static void main(String[] args) {
        
        // copy dosya1 dosya2 kopyala

        // 1.Yol
  //      System.out.println("args[0] = " + args[0]);
  //      System.out.println("args[1] = " + args[1]);

        // 2.Yol yazdırmak için
        for (String s: args) {
            System.out.println("s = " + s);
        }

    }
}
