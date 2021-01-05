package Gun39.example;

import java.util.ArrayList;

public class Ex1 {

    static String name = "Maximilian";
   // static final String name = "Maximilian";

    static ArrayList<String>list = new ArrayList<>();
  //  static final ArrayList<String>list = new ArrayList<>();

    public static void main(String[] args) {

        int sayi;

        System.out.println("Replace = " + name.replace("i","o")); // Maxomoloan
        System.out.println("1.name = " + name);

    //    name = name.replace("i","0"); // bu değişikliği ilk name e atama yaparsak ilk name değişir.
    //    System.out.println("2.name = " + name); // yukarıdaki String i final yaparsak değişikliği name e atayamayız.
                                                // çünkü final olduğu için değişmez.

        list.add("Ahmet");
        list.add("Alperen");
        System.out.println("list = " + list.toString());

      //  list = new ArrayList<>();  // clear();
     //   System.out.println("list = " + list.toString());

        //  list = new ArrayList<>();  // eğer Stringi final yaparsak yeniden oluşturmaya izin verilmez. ancak
                                      //  eleman eklenebiliyor.
       //   System.out.println("list = " + list.toString());












    }


}
