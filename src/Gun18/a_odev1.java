package Gun18;

public class a_odev1 {

    public static void main(String[] args) {

        /*
      TODO Write program that prints this using loops
        ***********
         *********
          *******
           *****
            ***
             *

         *********** -->satır = 1 iken --> 0b 11y
          *********  -->satır = 2 iken --> 1b 9y
           *******   -->satır = 3 iken --> 2b 7y
            *****    -->satır = 4 iken --> 3b 5y
             ***     -->satır = 5 iken --> 4b 3y
              *      -->satır = 6 iken --> 5b 1y

            6 satır
            1 tane satır döngüsü,
            sütunlar: 1 tane boşluk döngüsü, 1 tane yıldız döngüsü

         */

        for (int satir = 1; satir<=6; satir++){ // satır kontrol döngüsü

            for(int b=0; b <satir-1; b++){
                System.out.print(" ");
            }
            for (int yildiz = 13-(satir*2); yildiz > 0; yildiz--){

                System.out.print('*');
            }
            System.out.println();
        }


    }
}
