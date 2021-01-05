package Gun12;

import java.util.Scanner;

public class a_odev1 {

    public static void main(String[] args) {
        // Okunan x ve y koordinatlarına göre noktanın bulunduğu bölgeyi veren programı yazınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("x koordinatını giriniz: ");
        int x = scanner.nextInt();

        System.out.print("y koordinatını giriniz: ");
        int y = scanner.nextInt();
        System.out.println("****************************");

        if (x > 0 && y > 0) {
            System.out.println("(" + x + "," + y + ")" + " noktası A bölgesindedir.");
        }

        else if (x < 0 && y > 0) {
            System.out.println("(" + x + "," + y + ")" + " noktası B bölgesindedir.");
        }

        else if (x < 0 && y < 0) {
            System.out.println("(" + x + "," + y + ")" + " noktası C bölgesindedir.");
        }

        else if (x > 0 && y < 0) {
            System.out.println("(" + x + "," + y + ")" + " noktası D bölgesindedir.");
        }

        else {
            System.out.println("(" + x + "," + y + ")" + " noktası Eksen üzerindedir.");
        }





    }
}


