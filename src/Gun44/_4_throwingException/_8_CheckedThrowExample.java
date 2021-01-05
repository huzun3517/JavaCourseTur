package Gun44._4_throwingException;

import java.io.IOException;
import java.util.Scanner;

public class _8_CheckedThrowExample {
    //TODO
    // kullanıcıdan hava sıcaklığını isteyiniz.
    // ayrı bir metodda bunun kontrolünü yaparak hava
    // sıcaklığı 10 dan küçük ise IOException hatası oluşturunuz.
    // mainden çağırarak hatayı kontrol ediniz.
    
    public static void SicaklikKontrol(int sicaklik) throws IOException {
        //Eğer bir metod içerisinde Checked Throw var ise, metoda adına hata işareti eklenmeden derlemesine
        // izin verilmez. Hata çizgisini üzerine gelindiğinde Add... a tıklandığında otomatik ekleyecektir.
        // Bu şekilde bu metodu çağıran yerlerin try catch e alınması garantiye alınmış olur.
        
        if (sicaklik < 10){
            throw new IOException("Hava Gerçekten soğuk dışarı çıkma"); // checked olması için bu hata türü seçildi.
                    
        }
        System.out.println("Dışarıda basketbol oynayabilirsin.");        
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava Sıcaklığı: ");
        int sicaklik = scanner.nextInt();
        
        try {
            SicaklikKontrol(sicaklik);
        }
        catch (Exception ex)
        {
            System.out.println("ex = " + ex);
        }


    }
}
