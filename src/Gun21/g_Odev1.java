package Gun21;

public class g_Odev1 {

    public static void main(String[] args) {

        /*
        Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup,
        toplamını ekrana yan yana yani 1.matris + 2.matris = sonuç matrisi şeklinde yazdırınız
         */

        int[][] matris = new int[3][3];
        int[][] matris2 = new int[3][3];

        for (int i = 0; i <matris.length ; i++) {
            for (int j = 0; j <matris[i].length ; j++) {
                matris[i][j] = (int)(Math.random()*9) + 1;
                matris2[i][j] = (int)(Math.random()*9) + 1;
            }
        }

        for (int i = 0; i <matris.length ; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*******");

        for (int i = 0; i <matris2.length ; i++) {
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.print(matris2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*******");

        int[][] matrisToplam = new int[3][3];

        for (int i = 0; i <matrisToplam.length ; i++) {
            for (int j = 0; j < matrisToplam[i].length; j++) {
                matrisToplam[i][j]= matris[i][j] + matris2[i][j];
            }
        }

        for (int i = 0; i <matrisToplam.length ; i++) {
            for (int j = 0; j < matrisToplam[i].length; j++) {
                System.out.print(matrisToplam[i][j] + " ");
            }
            System.out.println();
        }










    }
}
