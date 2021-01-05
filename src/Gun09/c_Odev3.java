package Gun09;

import java.util.Scanner;

public class c_Odev3 {

    public static void main(String[] args) {

        // 3-Girilen bir stringdeki bütün boşluk karakterlerini _ ile değiştiriniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("String olan bir değer giriniz : ");
        String deger = scanner.nextLine();

        System.out.println("orjinal hali = " + deger);
        System.out.println("boşluk-> _ değişmiş hali = " + deger.replace(" ","_"));










    }
}
