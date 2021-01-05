package Gun21;

public class a_Matrix1 {

    public static void main(String[] args) {

        int sayi = 0; // bu hafızada bir tane sayı yeri ayırır.
        int [] dizi = new int[5]; // bu hafızada 5 tane (0,1,2,3,4 indisli) int yeri ayırır.
        int[][] matris = new int[4][5]; // bu hafızada 20 tane ama 4 satır, 5 sütun şeklinde int ayırır.

        // 1.satır için
        matris[0][0] = (int)(Math.random()*100) + 1;
        matris[0][1] = (int)(Math.random()*100) + 1;
        matris[0][2] = (int)(Math.random()*100) + 1;
        matris[0][3] = (int)(Math.random()*100) + 1;
        matris[0][4] = (int)(Math.random()*100) + 1;

        // 2.satır için
        matris[1][0] = (int)(Math.random()*100) + 1;
        matris[1][1] = (int)(Math.random()*100) + 1;
        matris[1][2] = (int)(Math.random()*100) + 1;
        matris[1][3] = (int)(Math.random()*100) + 1;
        matris[1][4] = (int)(Math.random()*100) + 1;

        for (int satir = 0; satir <4 ; satir++) {
            for (int sutun = 0; sutun <5 ; sutun++) {
                matris[satir][sutun] = (int)(Math.random()*100) + 1;
            }
        }

        for (int satir = 0; satir <4 ; satir++) {
            for (int sutun = 0; sutun <5 ; sutun++) {
                System.out.print(matris[satir][sutun] + " ");
            }
            System.out.println();
        }







        }
}
