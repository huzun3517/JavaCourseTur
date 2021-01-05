package Gun25_Proje3_Aciklamali;

public class Project3AddThreeEvenOdd {

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5};
        int[] arr2 = {2, 1, 2, 5};
        int[] arr3 = {2, 4, 2, 5};

        // Yokarıdaki 3 array methoda göndeririliyor ve sonuç ekraya yazdırılıyor
        System.out.println(threeEvenOrOdd(arr1));
        System.out.println(threeEvenOrOdd(arr2));
        System.out.println(threeEvenOrOdd(arr3));
    }

    // Bu threeEvenOrOdd methodu int türü bir array alıyor ve sonuçta boolean (true ya da false) return ediyor
    // Bu method aldığı array içerisindeki çift ve tek sayıları sayıyır.
    // Eğer tekler ya da çiftler 3 adet ise true aksi halde false dönüyor
    public static boolean threeEvenOrOdd(int[] arr) {
        // çift ve tek sayı miktarını tutabilmek için tek ve cift adında değişken oluşturuyıruz
        int cift = 0;
        int tek = 0;

        // array'in başından sonuna kadar geziyoruz ve elemanların tek mi çift mi olduğunu kontrol ediyoruz
        for (int i = 0; i < arr.length; i++) {
            // sayı çift ise cift degişkenini 1 artırıyoruz
            if (arr[i] % 2 == 0) cift++;
            // sayı tek ise tek degişkenini 1 artırıyoruz
            if (arr[i] % 2 == 1) tek++;
        }
        // Burada loop sonrası tek ya da cift ten biri 3 ise true return edilir. ve Method'da çıkılır
        if (cift == 3 || tek == 3) return true;

        // eğer yukarıdaki if çalışmaz ise yani tek ya da cift ten biri 3 değilse (her ikisi de 3 den farklı ise)
        // return isletilmemiş demektir ve method calısmaya devam ve aşağıdaki return islemini yapar.
        return false;
    }

}

    /*  Dikkat, yukarıda bulunan 2 adet if ifadesi else ile de birleştirilebilirdi.
        Çünki sayılar ya tekdir ya da çift. O nedenle
        if (arr[i] % 2 == 0)
            cift++;
         else
            tek++;
        de kullanılabilir. 3. bir alternatif olsa idi kullanılamazdı.
     */



/*
Soru 4:
ThreeEvenOdd
  threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
  gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise false göndersin.
  Örnek:
   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

*/