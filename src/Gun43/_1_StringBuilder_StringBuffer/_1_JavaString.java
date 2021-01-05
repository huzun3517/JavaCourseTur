package Gun43._1_StringBuilder_StringBuffer;

import java.util.Arrays;

public class _1_JavaString {

    public static void main(String[] args) {

        String cumle = "";
        cumle += "Bugün";
        cumle += "hava"; // String değişkeni çok fazla ekleme veya işlemlere göre performansı oldukça düşük.
        // Eğer çok fazla String işlemleri yapacaksak bunun için performansı oldukça iyi olan StringBuildir kullanılır.
        // Yapısı gereği hızlı çalışır. Fakat paralel çalışan uygulamalarda güvenli değildir. Ozaman StringBuffer kullanılır.

        // String, StringBuilder, StringBuffer

        StringBuilder s = new StringBuilder("Bu");
        
        s.append("gün"); // add gibi ekleme yapıyor bu yüzden tekrar atamaya gerek yok.
        s.append(" hava");
        s.append(" çok sıcak");

        System.out.println("s = " + s);
        System.out.println("s.length() = " + s.length());
        s.append(4); // ne eklenirse eklensin hepsi String e dönüşüyor.
        s.reverse(); // String i tersine çeviriyor.
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 hariç, 5 e kadar olan bölümünü sildi.
        System.out.println("s = " + s);
        
        s.deleteCharAt(3); // sadece 0 indexten itibaren verilen index teki karakteri siler.
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length()); // değişkenin içindeki karakter sayısı
        System.out.println("s.capacity() = " + s.capacity());
        // hafızada genişleyebilmesi için verilmiş ön alan, ancek eklendikçe artan bir alan, tampon genişleyebilme alanı
        
        s.insert(5,"545"); // 5 nolu index e insert yaptı.
        System.out.println("s = " + s);
        
        s.insert(4,3.45); // double bile eklenebilir ama String e çevrilip ekleyecektir.
        System.out.println("s = " + s);

        int[] dizi = {2,3,4,5,506};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);

        s = new StringBuilder("Bugünhavaçokgüzel");
        System.out.println("s = " + s); //s = Bugünhavaçokgüzel
        s.replace(3,8,"BU"); // başlangıç ve son verilen bölüme verilen String i atar,
        // eğer verilen büyük ise aradaki bölüm delete olur. üst sınır hariç.
        System.out.println("s = " + s); // s = BugBUaçokgüzel
        
    }
}
