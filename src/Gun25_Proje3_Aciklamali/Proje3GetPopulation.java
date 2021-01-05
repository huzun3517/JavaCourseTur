package Gun25_Proje3_Aciklamali;

public class Proje3GetPopulation {
    public static void main(String[] args) {

        String[] countryNames = {"USA" ,"Mexico" ,"Canada", "Türkiye"};
        int[] countryPopulations = {100000 , 120000 , 130000, 84000000};
        String str = "Türkiye";

        // burada populationOfCountry methoduna String countryNames ve int countryPopulations arrayleri
        // ile String str değişkenleri gönderiliyor, sonuçta ınt ülke nüfüsu dönüyor ve ekrana yazılıyor
        System.out.println(populationOfCountry(countryNames, countryPopulations, str));

    }

    // Bu method parametre olarak 2 array (bir String[], bir int[]) ve 1 String değişkeni alıyor
    // sonuçta int bir değer döndürüyor. Ülkeler ile nüfuslar karşılıklı sıralanmıştır.
    // countryNames[1] hangi ülke ise countryPopulations[1] o ülkenin nüfüsudur.
    // Bu method alınan ülke ismini aldığı array de bulursa nüfüsunu yoksa -1 return ediyor
    public static int populationOfCountry(String[] ulkeler, int[] nufuslar, String ulke){
        // burada ülkeler arrayi içerisinde ulke değişkenini arıyoruz
        for (int i = 0; i < ulkeler.length; i++) {
            // ülkeyi array içinde bulduğumuzda o ülkenin indexindeki nufuslar[i] değerini döndürüyoruz
            // burada equalsIgnoreCase kullanıldı büyük küçük harf problemi olmasın diye.
            // if de değeri bulduğumuzda return nufuslar[i]; yapıldığında artık methoddan çıkmış oluruz
            // return sonrası kodlar işletilmez
            if (ulke.equalsIgnoreCase(ulkeler[i]))  return nufuslar[i];
        }
        // Yukarıdaki if de ğlke bulunmaz ise for dan çıktıktan sonra
        // aranan ülkeyi arrayde bulamamışız demektir ve aşağıdaki return -1; işletilir.
        return -1;

    }
}
        /*  Önemli Açıklama
            eğer if kondition da else kullansa idik yani
            if (ulke.equalsIgnoreCase(ulkeler[i]))
                return nufuslar[i];
            else
                return -1;

            deseydik, arrayin ilk elemanında aranan bulunmaz ise else işletilir ve -1 return edilerek
            method so sonlandırılırdı. Bu durumda hiç bir zaman arrayin ikinci elemanı kontrol edilemezdi.
            method içnde return yapıldıktan sonda method orda kesilir ve başka işlem yapılmaz.
         */


/*
Soru 2:
    getPopulation:
      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
      countryNames Ülke isimleri
      countryPopulations Ülke nüfusları
    populationOfCountry adında bir metod yaznız.
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak
    Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
    göndersin.

      Ornegin;
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger (ulkeAdi) icin verilen ulke countryNames icinde yoksa return -1 olmali
*/