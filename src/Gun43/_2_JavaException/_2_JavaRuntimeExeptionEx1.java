package Gun43._2_JavaException;

import java.util.Scanner;

public class _2_JavaRuntimeExeptionEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Sayıyı giriniz: "); //  5.5 kesirli girersek-->  Compile Error, Exeption hatası verir
        int a = scanner.nextInt();              // java.lang.ArithmeticException: / by zero

        System.out.print("2.Sayıyı giriniz: ");   // 5/0 şeklinde 0 a böldürmeye çalışırsak--> RunTime Error, Exception
        int b = scanner.nextInt();                // _2_JavaRuntimeExeptionEx1.java:11) --> hatanın satırını verir.

        System.out.println("a/b = " + a/b);
    }
    
    
}
