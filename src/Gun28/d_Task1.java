package Gun28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class d_Task1 {
    //  Create method that generates a HashSet of
    //  given numbers [1, 2, 3, 4, 5, 5, 5, 6, 7, 8]
    //  bu işlemi generateSet() metodunda yapınız.
    // -Sonra AddElements şeklinde bir metodlar 1 veya 1 den fazla sayı eklenebilen metodu yazınız.
    // -Sonra oluşmuş olan maindeki hashSet i convertToArray isimli bir metoda göndererek main de bir Array e eşitleyiniz.
    // -Sonra oluşmuş olan maindeki hashSet i convertToArrayList isimli bir metoda göndererek main de bir ArrayList e eşitleyiniz.

    public static void main(String[] args) {
        
        Set<Integer> hs = generateSet();
        System.out.println("hs = " + hs); // hs = [1, 2, 3, 4, 5, 6, 7, 8]

        AddElements(hs,12,14);
        AddElements(hs,1,2,3,4,5,101,102,103);
        AddElements(hs,65);
        System.out.println("AddElemnet sonrası = " + hs); // [1, 65, 2, 3, 4, 5, 101, 6, 102, 7, 103, 8, 12, 14]        
        
        System.out.println("converToArray(hs) = " + Arrays.toString(converToArray(hs)));

        System.out.println("converToArrayList(hs) = " + converToArrayList(hs));

        


    }
    public static Set<Integer> generateSet() {
        //1.Yöntem
        Set<Integer> hs=new HashSet<>(Arrays.asList(1,2,3,4,5,5,5,6,7,8));
        
        //2.Yöntem
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(5);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        hs.add(8);
        
        return hs;

    }

    public static Set<Integer> AddElements(Set<Integer> hs, int ... sayilar){

        for (int i = 0; i <sayilar.length ; i++) {

            hs.add(sayilar[i]);
        }
        return hs; // return ile geri göndermesem de sonuc veriyor.
        // metoda gönderilen değerler primitive yani temel değişkenler değilse,
        // yani referans değişkenler ise, metodda yapılan değişiklik bu değişkenin kendisinde yapıldığından,
        // main de de değişiklik aynen görülür.
    }

    public static int[] converToArray (Set<Integer> hs){

        int[] yeni=new int[hs.size()];

        int sayac=0;

        for(Integer sayi : hs)
        {
            //yeni[sayac++]=sayi; // Önce işlemi yap sonra sayacın değerini 1 artır

            yeni[sayac]=sayi;
            sayac++;
        }

        return yeni;
    }
    

    public static ArrayList<Integer> converToArrayList (Set<Integer> hs){

        ArrayList<Integer> arr=new ArrayList<>(hs);

        return arr;

    }
}
