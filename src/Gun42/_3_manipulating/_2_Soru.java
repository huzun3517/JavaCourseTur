package Gun42._3_manipulating;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _2_Soru {

    public static void main(String[] args) {

        /*TODO
           Which of the following can be inserted into the blank to create a date of June 21, 2014?
           A. new LocalDate(2014, 5, 21);
           B. new LocalDate(2014, 6, 21);
           C. LocalDate.of(2014, 5, 21);
           D. LocalDate.of(2014, 6, 21);
           E. LocalDate.of(2014, Calendar.JUNE, 21);
           F. LocalDate.of(2014, Month.JUNE, 21);           
         */
        
        LocalDate date1 = LocalDate.of(2014,6,21); // D
        System.out.println("date1 = " + date1);

        LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21);  // F
        System.out.println("date2 = " + date2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ENGLISH)));

    }
}
