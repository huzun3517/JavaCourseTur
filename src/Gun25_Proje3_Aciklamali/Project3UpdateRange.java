package Gun25_Proje3_Aciklamali;

import java.util.Arrays;

public class Project3UpdateRange {
    public static void main(String[] args) {

        int[] arr1 = {1,6,10,15,22,18,30,16};
        int min = 10;
        int max = 20;

        // arr1 Array olduğu için  Arrays.toString(arr1); ile ekrana yazdırıyoruz.
        System.out.println(Arrays.toString(arr1));

        // arr1, min ve max değerleri URange methoduna gönderiliyor
        // Dönen değer array olduğu için  Arrays.toString(); ile ekrana yazdırılıyor.
        // URange methodu kullanılıyor
        System.out.println(Arrays.toString(URange(arr1, min, max)));
        // URange1 methodu kullanılıyor
        System.out.println(Arrays.toString(URange1(arr1, min, max)));

    }

    // Bu URange methodu 1 adet int[] arrayi ve 2 adet int değeri alıyor, sonuçta int[] türü array döndürüyor
    // Bu method verilen, array elemanı min ve max arasında ise onun yerine -1 yazıyor değilse değeri değiştirmiyor.
    public static int[] URange(int[] arr, int min, int max){
        // array içinde gezmeye başlıyoruz
        for (int i = 0; i < arr.length; i++) {
            // eleman min den büyük ve max dan küçük ise yani min ve max arasında ise o eleman yerine -1 yazıyor
            // eleman min ve max dışında ise değişiklik yapmıyoruz. Şarta uyanlar değiştiriliyor sadece
            // else kullanmaya gerek yok çünkü şarta uymayan elemanda değişiklik yapmıyoruz
            // else kullanılsa idi    else arr[i] = arr[i]; olacaktı ki hata olmazdı ama gereksiz olurdu.
            if (arr[i] > min && arr[i] < max) arr[i] = -1;
        }
        // üzerinde değişiklik yapılan gelen arr arrayi return ediliyor
        return arr;
    }

    //Yukarıdaki methodun içinde yeni bir array tanımlanarak işlem yapılmış halidir.
    // adı URange1 olarak verildi. Aynı işlemi yapmakta, değişikliği gelen arrayde değil de
    // yeni bir arraye atıyoruz
    public static int[] URange1(int[] arr, int min, int max){
        // işlem yapılan her bir elemanı içine atacağımız gelen array ile aynı boyutta yeni bir array tanımlıyoruz
        int[] arrYeni = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // eleman min ve max arasındamı kontrol ediyoruz
            if (arr[i] > min && arr[i] < max)
                arrYeni[i] = -1;        //  arada ise arrYeni nin aynı index'ine -1 yazdırıyoruz
            else
                arrYeni[i] = arr[i];    //  arada değil ise arrYeni nin aynı index'ine arr elemanını (arr[i]) yazdırıyoruz
        }
        // doldurulan yeniArr'i return ediyoruz
        return arrYeni;
    }
}


/*
Soru 5:
UpdateRange
   URange isminde bir metod yazınız, Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

   Örnek:
    int array = 1,6,12,15,22,18,30,16
    int 1 = 10
    int 2 = 20
    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
 */