package Gun17;

public class h_NestedLoop6 {

    public static void main(String[] args) {

        /*
         TODO Write program that prints this using loops
               *
              **
             ***
            ****
           *****

         */

        for (int satir =1; satir <=5; satir++) { // satır kontrolü

            for (int bosluk =5- satir; bosluk > 0; bosluk--){ // boşluk kontrolü
                System.out.print(" ");
            }

            for (int sutun =1; sutun <=satir; sutun++){  // sütun kontrolü
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
