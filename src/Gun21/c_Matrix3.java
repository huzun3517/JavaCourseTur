package Gun21;

public class c_Matrix3 {

    public static void main(String[] args) {

        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //  2D arrayinden min number print et

        int matrix [][] = {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        //               matrix[0] matrix[1] matrix[2]   matrix[3]

        System.out.println("mat.length = " + matrix.length); // satır sayısıymış
        System.out.println("mat[0].length = " + matrix[0].length); // 0.satırdaki sütun sayısını verdi.
        System.out.println("mat[1].length = " + matrix[1].length); // 1.satırdaki sütun sayısını verdi.
        System.out.println("mat[2].length = " + matrix[2].length); // 2.satırdaki sütun sayısını verdi.
        System.out.println("mat[3].length = " + matrix[3].length); // 3.satırdaki sütun sayısını verdi.

        int min = matrix[0][0];

        for (int i = 0; i <matrix.length ; i++) { // mat.length --> satır sayısını verir yani 4

            for (int j = 0; j <matrix[i].length ; j++) { // 3 ün yerine mat[i] satırı temsil ediyor. mat[i].length

                if (matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("En kücük sayı = " + min);

    }
}
