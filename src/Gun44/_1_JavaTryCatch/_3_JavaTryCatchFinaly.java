package Gun44._1_JavaTryCatch;

public class _3_JavaTryCatchFinaly {

    public static void main(String[] args) {

        //TODO
        // NOT: str nin içini boşaltıp hatayı gör. o şekilde çalıştır.
        
        try{ // hatanın olma ihtimalinin olduğu kodların alındığı blok
            // database i aç
            String str = "bugun";
            System.out.println("hatadan bir önceki adım");
            char ilkHarf = str.charAt(0);
            System.out.println("hatadan bir sonraki adım");
            
        }
        catch (Exception ex) // hata olduğunda çalışacak kodlar bu bloğa yazılır
        {
            System.out.println("Catch bölümü çalıştı");
        }
        finally { // hata olsun veya olmasın çalışacak final bölümü: herzaman çalışır
            // kullanım sebebi: try catch in içinde yapılmış işlemlerde arda kalan kapama gibi bu bölüme ait işlemler
            // yapılarak kod düzeni sağlanmış olur.
            {
                System.out.println("Finaly bölümü çalıştı.");
                // database kapat
            }
            System.out.println("tüm hata kodlarından sonraki normal kodların yazıldığı bölüm çlaıştı.");
        }
        
        
        
        
        
        
    }
}
