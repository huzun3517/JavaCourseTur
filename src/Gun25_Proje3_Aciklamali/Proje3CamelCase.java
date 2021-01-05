package Gun25_Proje3_Aciklamali;

public class Proje3CamelCase {

    public static void main(String[] args) {

        // Cümle Scanner ile de kullanıcıdan alınabilir.
        // Scanner sc = new Scanner(System.in);
        // String strGiden = sc.nextLine();

        String strGiden = "      Bugün      haVA    COK         cok GÜZEl    ";
        // strGiden değişkeni  camelcase methoduna atılıp dönen sonuç ekraya yazdırılıyor
        System.out.println( camelcase(strGiden) );

    }

    // Bu method String bir str alıp, sonuçta String döndürecek
    // Bu method düzensin girilen bir metni, kelimeler arası bir boşluk ve
    // kelimelerin ilk harfleri büyük olacak şekilde düzenleyin return ediyor.
    public static String camelcase(String str){
        // metin "      Bugün      haVA    COK         cok GÜZEl    "  şeklinde ise
        // gelen metnin trim ile baştakı ve sondakı boşlukları temizliyoruz --> "Bugün      haVA    COK         cok GÜZEl"  olur
        // replaceAll("[ ]+", " "); ile tek ya da fazla boşluk yerıne tek boşluk yazıyoruz  --> "Bugün haVA COK  cok GÜZEl"  olur
        str = str.trim().replaceAll("[ ]+", " ");

        // split(" "); ile str yi arraylere atıyoruz
        String[] strArr = str.split(" ");       //  strArr = {"Bugün", "haVA", "cok", "GÜZEl"}  oldu

        // return etmek ve array deki kelimeleri birleştşrmek için değişken tanımlıyoruz
        String strDonen = "";

        // for loop ile array içindeki kelimeleri gezerek işlem yapacaz
        for (int i=0; i<strArr.length; i++){
            // strDonen stringine sıradaki kelimenin
            // ilk harfini alıp büyük harfe çeviriyoruz (strArr[i].substring(0,1).toUpperCase())
            // index 1 den kelime sonuna kadar alıp küçük harfe ceviriyoruz  (strArr[i].substring(1).toLowerCase())
            // bunları toplayıp sonuna da kelime arası bosluk olsun diye " " ekleyip bir sonraki array elemanına geçiyoruz
            strDonen += strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1).toLowerCase() + " ";
        }

        // return edilecek strDonen ifadesinin snundaki " " bosluğu kaldırmak için trim() edip return ediyoruz.
        return strDonen.trim();
    }


    
/*
Soru 1:
CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
            Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

    str -->        bugün   haVa   çok   güzel
    str.trim()  bugün     hava   çok            güzel
    str.trim().replaceAll("\\s+", " ")     bugün hava çok güzel
    String[] arr = str.trim().replaceAll("\\s+", " ").split(" ")    {"bugün", "hava", "çok", "güzel"}

*/




}
