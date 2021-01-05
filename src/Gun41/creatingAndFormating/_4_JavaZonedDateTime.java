package Gun41.creatingAndFormating;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _4_JavaZonedDateTime {

    public static void main(String[] args) {
        
        //todo Başka ülke veya bölgelerin saat dilimine göre zamanı alma

        // todo Newyork un saat dilimine saati aldım.
        ZonedDateTime zdt =ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtLocal = ZonedDateTime.now();

        System.out.println("zdtLocal = " + zdtLocal);
        System.out.println("zdt = " + zdt);

        System.out.println("------------------------------------------------------");

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("zdtLocal = " + zdtLocal.format(format1));
        System.out.println("zdt = " + zdt.format(format1));

        Set<String> bolgeler=ZoneId.getAvailableZoneIds();

        for (String s: bolgeler) {
            if (s.toLowerCase().contains("new"))
                System.out.println("s = " + s);
        }


    }
}
