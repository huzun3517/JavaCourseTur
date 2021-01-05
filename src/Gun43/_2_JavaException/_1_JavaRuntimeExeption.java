package Gun43._2_JavaException;

public class _1_JavaRuntimeExeption {

    public static void main(String[] args) {

        System.out.println("Program çalıştı...");
        String str = "";

        str.charAt(3);
        //StringIndexOutOfBoundsException: Hatanın özel adı.String index in dışına çıkmış.
        // (JavaRuntimeExeption.java:10) --> 10.satırda hata var.

        // TODO
        //  Çalışma zamanı hatası şeklinde bir hata grubu var : RunTime Error, Exception
        //  Derlenme zamanı hatası şeklinde bir hata grubu var : Compile Error, Exeption

    }
}
