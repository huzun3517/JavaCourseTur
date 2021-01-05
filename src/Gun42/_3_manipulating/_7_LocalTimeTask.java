package Gun42._3_manipulating;
import org.junit.Assert;
import org.junit.Test;
import java.time.LocalTime;

public class _7_LocalTimeTask {
    // TODO
    //  using current LocalTime
    //  1. test current time with plus minute and plus hour :
    //  Şu andaki zamana 1 saat ve 1 dakika ekleyerek sonucun saatini ve dakikasını ayrı ayrı test ediniz.
    @Test
    public void testPlus(){
        LocalTime time = LocalTime.now();
        LocalTime actualtime = time.plusHours(1).plusMinutes(1);
        Assert.assertEquals(22,actualtime.getHour());
        Assert.assertEquals(49,actualtime.getMinute());
    }

    //  TODO
    //   2. test current time with minus minute and plus hour:
    //   Şu andaki zamana 1 saat ve 1 dakika çıkartarak sonucun saatini ve dakikasını ayrı ayrı test ediniz.
    @Test
    public void testMinus(){
        LocalTime time = LocalTime.now();
        LocalTime actualtime = time.minusHours(1).minusMinutes(1);

        Assert.assertEquals(20,actualtime.getHour());
        Assert.assertEquals(47,actualtime.getMinute());
    }
}