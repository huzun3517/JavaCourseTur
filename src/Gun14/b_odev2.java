package Gun14;

import java.util.Scanner;

public class b_odev2 {

    public static void main(String[] args) {

        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        /*
        Kaçıncı basamağı istiyorsak ilk önce o basamağa böleceğiz sonrasında kaç basamaklı olursa olsun %10 alacağız.
        Örneğin: 100. basamak diyorsa, kullanıcının girdiği sayı kaç basamaklı olursa olsun (sayı/100)%10 yapıyoruz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int birler= (sayi % 10) ;
        int onlar = (sayi / 10) % 10;
        int yuzler = (sayi / 100) % 10;

        switch (yuzler) {
            case 1: System.out.print("");break;
            case 2: System.out.print("iki");break;
            case 3: System.out.print("üç"); break;
            case 4: System.out.print("dört");break;
            case 5: System.out.print("beş");break;
            case 6: System.out.print("altı");break;
            case 7: System.out.print("yedi");break;
            case 8: System.out.print("sekiz");break;
            case 9: System.out.print("dokuz");break;
        }
        System.out.print(" yüz ");

        switch (onlar) {
            case 1: System.out.print("on");break;
            case 2: System.out.print("yirmi");break;
            case 3: System.out.print("otuz"); break;
            case 4: System.out.print("kırk");break;
            case 5: System.out.print("elli");break;
            case 6: System.out.print("atmış");break;
            case 7: System.out.print("yetmiş");break;
            case 8: System.out.print("seksen");break;
            case 9: System.out.print("doksan");break;
        }
        switch (birler) {
            case 1: System.out.println(" bir");break;
            case 2: System.out.println(" iki");break;
            case 3: System.out.println(" üç"); break;
            case 4: System.out.println(" dört");break;
            case 5: System.out.println(" beş");break;
            case 6: System.out.println(" altı");break;
            case 7: System.out.println(" yedi");break;
            case 8: System.out.println(" sekiz");break;
            case 9: System.out.println(" dokuz");break;
        }

    }
}
