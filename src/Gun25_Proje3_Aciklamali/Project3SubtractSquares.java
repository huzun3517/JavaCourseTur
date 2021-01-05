package Gun25_Proje3_Aciklamali;

public class Project3SubtractSquares {
    public static void main(String[] args) {

        int n = 10;
        int m = 5;

        // substSquare methoduna gönderilen n ve m değerlerinin her biri bu method içerisinde
        // ayrıca getSumOfSquares methoduna gönderiliyor.
        System.out.println(substSquare(n, m));

    }

    // Bu method num1 ne num 2 isimli 2 int değer alıyor ve int bir değer döndürüyor
    // Bu aldığı iki sayıyı getSumOfSquares methodu ile ayrı ayrı işleme sokup sonuçları toplayıp return ediyor
    public static int substSquare(int num1, int num2){
        // tanımladığımız sum1 değişkenine getSumOfSquares(num1) den dönen int değeri atıyoruz
        int sum1 = getSumOfSquares(num1);

        // tanımladığımız sum1 değişkenine getSumOfSquares(num2) den dönen int değeri atıyoruz
        int sum2 = getSumOfSquares(num2);

        // sum1 ve sum2 yi toplayıp return ediyoruz
        return  sum1 + sum2;
    }

    // Bu method num isimli 1 int değer alıyor ve int bir değer döndürüyor
    // Bu metod 0 dan aldığı değere kadar (o sayı dahil) olan tamsayıları topluyor
    public static int getSumOfSquares(int num){
        int toplam = 0;

        // i'yi 0'dan num'a kadar saydırıp sıralı sayıları topluyoruz
        // 0 ın toplama etkisi olmadığı için  for(int i = 1; i <= num; i++) da yapılabilir. Sonuç değişmez
        for (int i = 0; i <= num; i++) {
            // toplam değişkenine her döngüde i değerini ekliyoruz
            toplam += i;
        }
        // toplamın karesini return ediyoruz.
        // Bunu axa ile yapabileceğimiz gibi Math.pow(a,2) ile de yapabiliriz
        // Math.pow(a,2) double değer ürettiği için (int) e cast etmemiz gerekli
        return (int)Math.pow(toplam, 2);
        //return toplam*toplam;  // toplamın karesi bu şekilde de return edilebilir
    }

    /*
    public static int randomSayi(){
        return (int)(Math.random()*100);
    }

    public static void ekranaYaz(String s){
        System.out.println(s);
    }
    */

}


/*
Soru 3:
SubtractionSquare:
   getSumOfSquares adında bir sayı alan ve bu sayıya kadar olan sayıları
   toplayıp çıkan sonucun karesini dönndüren bir metod yazınız.

   substSquare isminde 2 adet int parametre alan ve int sonuç döndüren bir metod daha yazınız.

   main den   substSquare   metoduna 2 tane sayı gönderiniz, bu metodun içinden de
   getSumOfSquares metodunu çağırarak gönderilen bu iki sayı için işlem sonuçlarını toplayarak
   main metodundan yazdırınız.

Örnek:
    int 1 = 10;             yazacağınız method 10 u kullanarak 3025 sonucu verir
    int 2 = 5;              yazacağınız method 5 i kullanarak 225 sonucu verir

    3025 + 225 = 3250
    return 3250
*/