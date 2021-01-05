package Gun21;

import java.util.Scanner;

public class MatrisCarpimi {
    public static void main(String[] args) {

        // 3x3 lük 2 matrisi random (0-9 arası) doldurup,
        // çarpımını ekrana yan yana yani 1.matris x 2.matris = sonuç matrisi şeklind eyazdırınız

        Scanner sc = new Scanner(System.in);
        System.out.println("Çarpımı Yapılacak Kare Matrislerin Boyutu 3x3 lük Matris Çarpımı ise 3 Giriniz");
        System.out.print("Kare Matrislerin Boyutu: ");

        int matrisBoyutu = sc.nextInt();
        matrisBoyutu = matrisBoyutu < 2 ? 3 : matrisBoyutu;

        // Matris tanımlamaları yapılıyor
        int[][] matris1 = new int[matrisBoyutu][matrisBoyutu];
        int[][] matris2 = new int[matrisBoyutu][matrisBoyutu];
        int[][] matrisCarpim = new int[matrisBoyutu][matrisBoyutu];

        // Çarpılacak matrislerin içleri random sayı ile dolduruluyor
        for (int i = 0; i < matrisBoyutu; i++) {
            for (int j = 0; j < matrisBoyutu; j++) {
                matris1[i][j] = (int) (Math.random() * 10);
                matris2[i][j] = (int) (Math.random() * 10);
            }
        }

        // Matris çarpımı yapılıyor
        for (int i = 0; i < matrisBoyutu; i++) {
            for (int j = 0; j < matrisBoyutu; j++) {
                int carpim = 0;
                for (int k=0; k<matrisBoyutu; k++){
                    carpim += matris1[i][k] * matris2[k][j];  // 1. matrisin satırı ile 2. matrisin sütunu çarpılır
                }
                matrisCarpim[i][j] = carpim;                  // çarpım sonucu çarpım matrisine yazılıyor
            }
        }

        // Matris 1.Matris X 2. Matris = Sonuç Matrisi şeklinde ekrana yazdırılıyor
        for (int m = 0; m<matrisBoyutu; m++) {

            String matrisSatiri1 = "";
            String matrisSatiri2 = "";
            String carpimSatiri = "";

            // matris satırları string olarak düzenleniyor
            for (int n = 0; n<matrisBoyutu; n++) {
                matrisSatiri1 += matris1[m][n] + " ";
                matrisSatiri2 += matris2[m][n] + " ";
                carpimSatiri += matrisCarpim[m][n] + "\t";
            }

            // 1. matrisin satırı | | simgeleri arasında ekrana yazdırılıyor
            System.out.print("| " + matrisSatiri1.trim() + " |");

            // 1. matris ile 2. matris arası boşluk ya da X yazdırılıyor
            if (m==matrisBoyutu/2)
                System.out.print("\tX\t");
            else
                System.out.print("\t\t");

            // 2. matrisin satırı | | simgeleri arasında ekrana yazdırılıyor
            System.out.print("| " + matrisSatiri2.trim() + " |");

            // 2. matris ile çarpım matrisi arası boşluk ya da = yazdırılıyor
            if (m==matrisBoyutu/2)
                System.out.print("\t=\t");
            else
                System.out.print("\t\t");

            // çarpım matrisinin satırı | | simgeleri arasında ekrana yazdırılıyor
            System.out.print("| " + carpimSatiri.trim() + "\t|");

            if (m== matrisBoyutu-1) System.out.print("(" + matrisBoyutu + "x" + matrisBoyutu + ")");
            // bir sonraki martis satırını aşağıya yazdırmak için alt satıra geçiliyor
            System.out.println();
        }
    }
}

