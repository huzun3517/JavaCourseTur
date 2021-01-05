package Gun21;

public class h_Odev2 {

    public static void main(String[] args) {

        /*
        Günün Sorusu :  3x3 lük 2 matrisi random (0-9 arası) doldurup,
        çarpımını ekrana yan yana yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız @Student
         */

        int[][] matris = new int[3][3];
        int[][] matris2 = new int[3][3];
        int[][] matrisCarpim = new int[3][3];

        for (int i = 0; i <matris.length ; i++) { // matris-matris2 ve matrisCarpim degerlerini dolduruyoruz
            for (int j = 0; j <matris[i].length ; j++) {
                matris[i][j] = (int)(Math.random()*9) + 1;
                matris2[i][j] = (int)(Math.random()*9) + 1;
                matrisCarpim[i][j] = matris[i][j] * matris2[i][j];
            }
        }

        for (int i = 0; i <matris.length ; i++) {  // matris bastırıyoruz
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("*********");

        for (int i = 0; i <matris2.length ; i++) {  // matris2 yi bastırıyoruz
            for (int j = 0; j < matris2[i].length; j++) {
                System.out.print(matris2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("*********");

        for (int i = 0; i <matrisCarpim.length ; i++) {  // matrisCarpim ı bastırıyoruz
            for (int j = 0; j < matrisCarpim[i].length; j++) {
                System.out.print(matrisCarpim[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
