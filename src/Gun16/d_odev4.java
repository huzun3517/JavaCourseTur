package Gun16;

public class d_odev4 {

    public static void main(String[] args) {

        //    4- 1-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız

        /*
        char c=(char)i;  // bilgisayar harfleri bilmez ,bu sebeple saklayamaz
            // bu yüzden karakterleri karşılık gelen bir sayı ile saklar.
            // bu yüzden char yani karakterler aslında sayı olarak saklanır.
            // bu özellikten dolayı char saklanacak yere direk karakterin karşılık gelen sayısı
            // atanabilir yani A harfi de tanabilir, 65 i char a çevirip de atanabilir.  */


     /* for(int i=0; i<=255;i++)
        {
            System.out.println(i+" - "+c);
        }
         */

        int i=0;
        while (i<=255) {
            char c = (char) i;
            System.out.println(i + " - " + c);
            i++;
        }

    }
}
