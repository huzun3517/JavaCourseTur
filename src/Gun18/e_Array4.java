package Gun18;

import java.util.Scanner;

public class e_Array4 {

    public static void main(String[] args) {
        // 5 elemanlı int bir dizi tanımlayınız.Kullanıcıdan değerleri alarak
        // bu diziyi doldurunuz.Daha sonra ortalamadan büyük eleman sayısını bulunuz.

        Scanner scanner = new Scanner(System.in);

        int [] dizi = new int[5];
        int top = 0;

        for (int i=0 ; i<dizi.length; i++){
            System.out.print("Sayı giriniz: ");
            dizi[i] = scanner.nextInt();
            top += dizi[i];
        }
        
        int ort = top / dizi.length;
        
        int ortgecenmiktar = 0;
                
        for (int i =0; i< dizi.length; i++){
            
            if (dizi[i] > ort)
                ortgecenmiktar++;                
        }
        System.out.println("ortgecenmiktar = " + ortgecenmiktar);


    }
}
