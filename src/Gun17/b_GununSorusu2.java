package Gun17;

import java.util.Scanner;

public class b_GununSorusu2 {

    public static void main(String[] args) {

         /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negatif de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

            Scanner scanner = new Scanner(System.in);
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str3 = scanner.nextLine();

            /*
            int i1 = Integer.parseInt(str1.replaceAll("[$A-Za-z]", ""));
            int i2 = Integer.parseInt(str2.replaceAll("[$A-Za-z]", ""));
            int i3 = Integer.parseInt(str3.replaceAll("[$A-Za-z]", ""));

             */

            int i1 = Integer.parseInt(str1.replaceAll("[^0-9,-]", ""));
            int i2 = Integer.parseInt(str2.replaceAll("[^0-9,-]", ""));
            int i3 = Integer.parseInt(str3.replaceAll("[^0-9,-]", ""));

            int toplam = i1 + i2 + i3;

            if (toplam > 0) {
                System.out.println(toplam);
            } else {
                System.out.println(-1);
            }


        }
    }

