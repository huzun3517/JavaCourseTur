package Gun18;

import java.util.Arrays;

public class g_Array6 {

    public static void main(String[] args) {

        // 5 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. ve elemanları ekrana 2 farklı şekilde yazdırınız.

        int [] dizi = new int[5];

        for (int i=0 ; i<dizi.length; i++){

            dizi[i] = (int) (Math.random() * 10 + 1);

        }

        // Ekrana yazdırma 1.yöntem
        for (int i =0; i< dizi.length; i++){

            System.out.println("dizi[" + i + "] = " + dizi[i]);

        }
        // Ekrana yazdırma 2.Yöntem
        System.out.println(Arrays.toString(dizi));

        // foreach döngüsü;
        // Ekrana yazdırma 3.Yöntem : Dizi değişkeninin içindeki elemanları değer adını vererek döngüye gönderiyor.
        for (int deger : dizi
             ) {
            System.out.println("deger = " + deger);
        }










    }
}
