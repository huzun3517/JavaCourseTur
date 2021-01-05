package Gun19;

public class SORU {

    public static void main(String[] args) {

        // 2 ders ve 3 öğrencinin notlarını kendiniz tanımlarken 2 boyutlu dizide veriniz.
        // Daha sonra ayrı bir döngü ile her bir dersin not ortalalmasını bulunuz.

        int dizi[][] = {{65,76,90},{80,66,95}};

        for (int i =0; i<2; i++){
            for (int j =0; j<3; j++) {
                System.out.println(dizi[i][j] + " ");
            }
            System.out.println();
        }
        int notTop1 =0;
        for (int j =0; j<3; j++){
                notTop1+= dizi[0][j];
            }

        int notTop2 =0;
        for (int j =1; j<3; j++){
            notTop2+= dizi[1][j];
        }

        System.out.println("1.Dersin Ortalaması = " + (notTop1/3) );
        System.out.println("2.Dersin Ortalaması = " + (notTop2/3) );





    }
}
