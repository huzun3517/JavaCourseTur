package Gun25_Proje3;

import java.util.Scanner;

public class soru1_CamelCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.println(CamelCase(cumle));


    }


    public static String CamelCase(String s1) {

        s1 = s1.trim().replaceAll("[ ]+", " ");

        String[] dizi = s1.trim().split(" ");

        String strDonen = "";

        for (String str : dizi) {
            strDonen += str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() + " ";
        }
        return strDonen.trim();


    }
}
 /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
            Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel
     */

