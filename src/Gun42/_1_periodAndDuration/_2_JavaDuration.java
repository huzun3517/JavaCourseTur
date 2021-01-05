package Gun42._1_periodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _2_JavaDuration {

    public static void main(String[] args) {

        LocalTime geceYarisi = LocalTime.of(0,0);
        LocalTime ogleVakti = LocalTime.of(13,3,2,5);

        Duration fark = Duration.between(geceYarisi,ogleVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark.toMillis() = " + fark.toMillis());

        System.out.println("fark.toHours() = " + fark.toHours()); // Gn dahil Toplam saati verir.
        System.out.println("fark.toMinutes() = " + fark.toMinutes()); // saat dahil toplam dakikayı verir.
        System.out.println("fark.toDays() = " + fark.toDays()); // Toplam günü verir.

        System.out.println("fark.toHoursPart() = " + fark.toHoursPart()); // Bu bölüm sadece saat bölümünü verir.
        System.out.println("fark.toMinutes() = " + fark.toMinutesPart()); // Bu bölüm sadece dakika bölümünü verir, toplamı vermez.
        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart()); // bu bölüm saniye bölümünü verir.
        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());
        System.out.println("fark.toNanosPart() = " + fark.toNanosPart());
        

    }
}
