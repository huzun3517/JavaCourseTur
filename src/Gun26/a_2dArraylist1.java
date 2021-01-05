package Gun26;

import java.util.ArrayList;

public class a_2dArraylist1 {

    public static void main(String[] args) {
     /*
        int sayi = 5; // tek bir rakam saklayabilen değişken
        int[] dizi = new int[5]; // 5 adet rakam saklayabilen değişken
        int[][] mat = new int[5][5]; // 5x5 --> 25 adet rakam
        ArrayList<Integer> arrayList = new ArrayList<>(); // İstenildiği kadar değişken eklenebilir.
      */

        int[][] mat = new int[5][5]; // 5x5 --> 25 adet rakam
        ArrayList<ArrayList<Integer> > notlarArrList = new ArrayList<>();
        // boşluklar gereksiz.

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(90);
        matNotlar.add(80);
        matNotlar.add(70);

        ArrayList<Integer> turNotlar = new ArrayList<>();
        turNotlar.add(95);
        turNotlar.add(85);
        turNotlar.add(75);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(45);
        kimNotlar.add(55);
        kimNotlar.add(65);
        kimNotlar.add(35);

        notlarArrList.add(matNotlar);
        notlarArrList.add(turNotlar);
        notlarArrList.add(kimNotlar);

    /*    for (int i = 0; i <matNotlar.size(); i++) {
            System.out.println("matNotlar = " + matNotlar.get(i));
        }

     */

        System.out.println("notlarArrlist.size() = " + notlarArrList.size());

        for (int i = 0; i <notlarArrList.size(); i++) { // defterdeki derslerin not listesinin kaç tane olduğunu, yaprak sayısı
           // System.out.println("notlarArrlist = " + notlarArrList.get(i));
            for (int j = 0; j <notlarArrList.get(i).size() ; j++) { // 1 yapraktaki not sayısı
                System.out.println("i.yapraktaki j.not = " + notlarArrList.get(i).get(j));

            }
        }

        // bana öyle bir metod yazınki, metoda dersin nosunu göndereceğim bana ortalamasını verecek.
        
        int matOrt = dersOrtalamaBul(0,notlarArrList);
        System.out.println("matOrt = " + matOrt);

        int turOrt = dersOrtalamaBul(1,notlarArrList);
        System.out.println("turOrt = " + turOrt);

        int kimOrt = dersOrtalamaBul(2,notlarArrList);
        System.out.println("kimOrt = " + kimOrt);

        System.out.println("**********************************************");

        // Öyle bir metod yazınki tüm derslerin ortalamasını bulsun
        int tumOrt = tumDersOrtBul(notlarArrList);
        System.out.println("tumOrt = " + tumOrt);

        System.out.println("**********************************************");

        // Öyle bir metod yazınki tüm derslerdeki 1.Sınavın ortalamasını bulsun.
        int simav1Ort = sinavSiraOrtBul(0,notlarArrList);
        System.out.println("simav1Ort = " + simav1Ort);

        System.out.println("**********************************************");





    }
    // bana öyle bir metod yazınki, metoda dersin nosunu göndereceğim bana ortalamasını verecek.
    public static int dersOrtalamaBul(int dersNo,ArrayList<ArrayList<Integer> >notlarArrlist){
        int ort =0;
        int toplam =0;

        for (int i = 0; i < notlarArrlist.get(dersNo).size() ; i++) {
            toplam += notlarArrlist.get(dersNo).get(i);

        }
        return toplam / notlarArrlist.get(dersNo).size();



}
    // Öyle bir metod yazınki tüm derslerin ortalamasını bulsun
    public static int tumDersOrtBul(ArrayList<ArrayList<Integer> >notlarArrlist){
        int toplam =0;
        int notMiktari = 0;


        for (int i = 0; i < notlarArrlist.size() ; i++) {
            for (int j = 0; j < notlarArrlist.get(i).size(); j++) {
                toplam += notlarArrlist.get(i).get(j);
                notMiktari++;

            }


        }

        return toplam / notMiktari;
        }

        // Öyle bir metod yazınki tüm derslerdeki 1.Sınavın ortalamasını bulsun.
        public static int sinavSiraOrtBul(int sinavSira, ArrayList<ArrayList<Integer> >notlarArrlist ){

            int toplam =0;

            for (int i = 0; i < notlarArrlist.size() ; i++) {
                    toplam += notlarArrlist.get(i).get(sinavSira);

                }


            return toplam / notlarArrlist.size();


        }

        //Yukarıdaki örnek de sınavSirasi olarak 3 gönderildiğinde yani(4.Sınav) hata verecektir.
        // hatanın sebebini ve nasıl düzeltileceğini bulunuz.

        // 2.Ödev
        // Recursive (ÖzYinelemeli Metodlar) konusu google dan ve youtube den






}
