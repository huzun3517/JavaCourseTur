package Gun21;

import java.util.Scanner;

public class i_MatrisCarpimiMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Matris Buyutunu Giriniz: ");
        int matrisBoyutu = sc.nextInt();
        matrisBoyutu = matrisBoyutu<2 ? 3 : matrisBoyutu;

        System.out.print("Matris, 0 ile Hangi Sayi Arasinda Doldurulsun: ");
        int maxNumber = sc.nextInt();
        maxNumber = maxNumber<2 ? 9 : maxNumber;


        int[][] mat1 = matrisDoldur(matrisBoyutu, maxNumber);
        int[][] mat2 = matrisDoldur(matrisBoyutu, maxNumber);

        System.out.println("0-" + maxNumber + " arasi sayilarla random doldurulan "
                + matrisBoyutu + "x" + matrisBoyutu + " 2 adet Matrisin Carpiminin:");

        System.out.println("Dikey Yazilimi");
        matrisCarpiminiDikeyYazdir(mat1, mat2);
        System.out.println();

        System.out.println("Yatay Yazilimi");
        matrisCarpiminiYatayYazdir(mat1, mat2);
    }




    // 0-max arasi random int sayi üreten method
    public static int randomNum(int max){
        return (int)(Math.random()*(max+1));
    }


    // Matris'i 0-max random sayilarla dolduran method
    public static int[][] matrisDoldur(int boyut, int max) {
        int[][] mat = new int[boyut][boyut];
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat.length; j++)
                mat[i][j] = randomNum(max);
        return mat;
    }


    // Matris'i yazdiran method
    public static void matrisYazdir(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris.length; j++)
                System.out.print(matris[i][j] + "\t");
            System.out.println();
        }
    }


    // Matrisler çarpımıni yapan method
    public static int[][] matrisCarp(int[][] mat1, int[][] mat2) {
        int[][] matrisCarpim = new int[mat1.length][mat1.length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                int carpim = 0;
                for (int k = 0; k < mat1.length; k++) {
                    carpim += mat1[i][k] * mat2[k][j];
                }
                matrisCarpim[i][j] = carpim;
            }
        }
        return matrisCarpim;
    }

    // Matris islemlerini yan yana yazan void method
    public static void matrisCarpiminiDikeyYazdir(int[][] matris1, int[][] matris2) {
        matrisYazdir(matris1);
        System.out.println("____________________");
        matrisYazdir(matris2);
        System.out.println("____________________");
        matrisYazdir(matrisCarp(matris1, matris2));
    }


    // Matris islemlerini yan yana yazan void method
    public static void matrisCarpiminiYatayYazdir(int[][] matris1, int[][] matris2) {
        int[][] matrisCarpim = new int[matris1.length][matris1.length];
        matrisCarpim = matrisCarp(matris1, matris2);

        int matrisBoyutu = matris1.length;

        for (int m = 0; m<matrisBoyutu; m++) {

            String matrisSatiri1 = "";
            String matrisSatiri2 = "";
            String carpimSatiri = "";

            // matris satırları string olarak düzenleniyor
            for (int n = 0; n<matrisBoyutu; n++) {
                matrisSatiri1 += matris1[m][n] + "\t";
                matrisSatiri2 += matris2[m][n] + "\t";
                carpimSatiri += matrisCarpim[m][n] + "\t";
            }

            // 1. matrisin satırı ekrana yazdırılıyor
            System.out.print(matrisSatiri1.trim());

            // 1. matris ile 2. matris arası boşluk ya da X yazdırılıyor
            if (m==matrisBoyutu/2)
                System.out.print("\tX\t");
            else
                System.out.print("\t\t");

            // 2. matrisin satırı | | simgeleri arasında ekrana yazdırılıyor
            System.out.print(matrisSatiri2.trim());

            // 2. matris ile çarpım matrisi arası boşluk ya da = yazdırılıyor
            if (m==matrisBoyutu/2)
                System.out.print("\t=\t");
            else
                System.out.print("\t\t");

            // çarpım matrisinin satırı | | simgeleri arasında ekrana yazdırılıyor
            System.out.print(carpimSatiri.trim());

            // bir sonraki martis satırını aşağıya yazdırmak için alt satıra geçiliyor
            System.out.println();
        }
    }


}

