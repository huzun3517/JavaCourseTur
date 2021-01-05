package Gun19;

import java.util.Scanner;

public class a_Array7 {

    public static void main(String[] args) {
        //kullanıcıdan 5 adet sayıyı giriş sırasına göre tersten yazdırınız.

        Scanner scanner = new Scanner(System.in);
        int [] dizi = new int[5];

        for (int i=0 ; i<dizi.length; i++){
            System.out.print(i + ".indexi giriniz: ");
            dizi[i] = scanner.nextInt();
        }
        for (int i =dizi.length-1; i>=0; i--){
            System.out.print(" " + dizi[i] + " ");

        }


    }
}
