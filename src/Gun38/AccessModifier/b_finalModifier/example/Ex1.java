package Gun38.AccessModifier.b_finalModifier.example;

import java.util.Collections;

public class Ex1 {

    public static void main(String[] args) {

        // bir dairenin alanı pi*r*r dir.

        int yaricap = 4;

        double alan = yaricap * yaricap * Constants.pi;

        //Verilen saat,dakika ve gün bilgisini saniyeye çeviriniz.

        int gun = 23;
        int saat = 7;
        int dakika = 25;

        int saniyeCinsinden = gun * Constants.hourInDay*Constants.minuteInHour*Constants.secondInMinute +
                              saat * Constants.minuteInHour*Constants.secondInMinute + 
                              dakika * Constants.secondInMinute;

        System.out.println("saniyeCinsinden = " + saniyeCinsinden);





    }
}
