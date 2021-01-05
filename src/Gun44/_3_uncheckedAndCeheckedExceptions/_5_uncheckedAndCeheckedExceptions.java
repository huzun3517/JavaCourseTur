package Gun44._3_uncheckedAndCeheckedExceptions;

import java.io.FileInputStream;

public class _5_uncheckedAndCeheckedExceptions {

    public static void main(String[] args) {
//    TODO
//      Dosya okuma/ yazma işlemi
//      bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
//      buyüzden try-catch e alınması bu kodun zorunlu tutuluyor.
//      bu gibi sunumlara karşılık gelen hatalara Checked Exception denir.
//      Özellikle IO (inputOutput) işlemleri Checked Exception dır.

        try {
            FileInputStream file = new FileInputStream("dosya.txt");
        }
        catch (Exception ex)
        {

        }

    }
}