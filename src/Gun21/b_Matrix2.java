package Gun21;

public class b_Matrix2 {

    public static void main(String[] args) {

        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //  2D arrayinden max number print et

        int matrix [][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        //               matrix[0] matrix[1] matrix[2]   matrix[3]
        int max = matrix[0][0];

        for (int i = 0; i <matrix.length ; i++) { // mat.length --> satır sayısını verir yani 4

            for (int j = 0; j <matrix[i].length ; j++) { // 3 ün yerine mat[i] satırı temsil ediyor. mat[i].length

                if (matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("En büyük sayı = " + max);

        }

        }
