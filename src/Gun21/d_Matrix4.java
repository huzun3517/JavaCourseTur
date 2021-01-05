package Gun21;

public class d_Matrix4 {

    public static void main(String[] args) {
     /*  sumTotal sorusu
         String 2D array oluştur

         {{"$12" , "$22" , "0$"},{"€9" , "€40" , "$1"}, {"€12","€2","€0"}}

         String de $ varsa 3.2 ile çarp

         String de € varsa 4.2 ile çarp

         double return et
    */

        String[][] matrix = {{"$12" , "$22" , "0$"},{"€9" , "€40" , "$1"}, {"€12","€2","€0"}};

        double toplam = 0;

        for (int i = 0; i <matrix.length ; i++) {

            for (int j = 0; j <matrix[i].length ; j++) {

                if (matrix[i][j].contains("$")) { // $ içeriyorsa

                  toplam += Integer.parseInt(matrix[i][j].replace("$","")) * 3.2;

                }
                else if (matrix[i][j].contains("€")) { // € içeriyorsa

                    toplam += Integer.parseInt(matrix[i][j].replace("€","")) * 4.2;

                }


            }

        }
        System.out.println("toplam = " + toplam);









    }
}
