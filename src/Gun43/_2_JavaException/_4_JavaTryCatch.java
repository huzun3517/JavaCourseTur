package Gun43._2_JavaException;

import java.util.Scanner;

public class _4_JavaTryCatch {

    public static void main(String[] args) {

        String str = "bugun";
        int a = 5;
        int b = 0;
        int c = 0;

        // Catch bloklarında hangi hata önce geliyorsa ona uygun hata adı yazılır, genel Eception en sona yazılır.
        try {
            System.out.println("1.Adım");
            char ilkHarf = str.charAt(0); // burda hata oluştu.. str="" olduğunda
            System.out.println("2.Adım");
            c = a / b;
            System.out.println("3.Adım");
        }
        catch (StringIndexOutOfBoundsException ex) { // burada özel hata ismi yazılırsa; ilgili hata gelirse catch kısmı
            // çalışır. ilgili hatanın dışında başka hata gelirse bunun için başka bölüm olmadığından program kırılır.

          //  ex.printStackTrace();
            System.out.println("4.Adım");
            System.out.println("Hata: String dizisinin dizisini sınırı aşıldı");
        }
        catch (ArithmeticException ex) {
            System.out.println("Aritmatik hata oluştu");
        }

        catch (Exception ex){ // hangi hata olursa olsun hata olduğunda ,exeption catch çalışır.

            System.out.println("Genel hata oluştu");

        }
        System.out.println("5.Adım");








    }
}
