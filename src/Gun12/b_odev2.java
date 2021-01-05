package Gun12;

import java.util.Scanner;

public class b_odev2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("P(x,y) noktasının");

        System.out.print("x koordinatını giriniz: ");
        int x = scanner.nextInt();

        System.out.print("y koordinatını giriniz: ");
        int y = scanner.nextInt();


        if (x < -2 || x > 8 || y < 1 || y > 4) {
            System.out.println("P(" + x + "," + y + ") noktası Dikdörtgenin DIŞINDA");
        }

        else if (x < 8 && x > -2 && y >1 && y < 4) {
            System.out.println("P(" + x + "," + y + ") noktası Dikdörtgenin İÇİNDE");
        }

        else {
            System.out.println("P(" + x + "," + y + ") noktası Dikdörtgenin ÜSTÜNDE");
        }
        //çizgiüzerindekini yazmamaız gerekseydi
        // if (  ((x==8 || x== -2) && (y > 1 || y < 4) )      // sol ve sağ kenar
        //   || ((y==1 || y == 4) && (x> -2 || x < 8) )      // üst ve alt çizgi
        //
    }
}
