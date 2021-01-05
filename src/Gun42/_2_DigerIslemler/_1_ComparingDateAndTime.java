package Gun42._2_DigerIslemler;

import java.time.LocalDate;

public class _1_ComparingDateAndTime {

    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dun = bugun.minusDays(1);

        boolean after = bugun.isAfter(dun); // bugün dünden sonra mı? true
        System.out.println("after = " + after);
        
        boolean before = bugun.isBefore(dun); // bugun dünden önce mi? false;
        System.out.println("before = " + before);

        boolean equal = bugun.isEqual(dun); // bugün dün e eşit mi? false;
        System.out.println("equal = " + equal);

        boolean leapYear = bugun.isLeapYear(); // Artık Yıl mı?
        System.out.println("leapYear = " + leapYear);
        
        int fark = bugun.compareTo(dun); // 2 tarih arasındaki farkın en büyük parçası arasındaki farkı verir.
        System.out.println("fark = " + fark);

        int fark2 = bugun.compareTo(dun.plusYears(2)); //--> -2  iki tarih arasındaki farkın en büyük parçası
                                                       // arasındaki farkı verir.
        System.out.println("fark2 = " + fark2);

        int fark3 = bugun.compareTo(dun.plusYears(-2)); //--> 2
        System.out.println("fark3 = " + fark3);

/*  TODO
        2020-05-23 > 2018-04-02  --> compareTo --> 2 en büyük fark yılda olduğu için
        2020-05-23 > 2020-04-02  --> compareTo --> 1 en büyük fark ayda olduğu için
        2020-05-23 > 2020-05-02  --> compareTo --> 21 en büyük fark günde olduğu için
 */



    }
}
