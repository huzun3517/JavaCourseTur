package Gun53._02_Interfaces.task1;

public class Dikdortgen implements ISekil {

    @Override
    public int cevresi(int... numbers) {

        if (numbers.length == 1)
            return (numbers[0] + numbers[0])*2;

        else

        return (numbers[0] + numbers[1])*2;
    }

    @Override
    public int alanı(int... numbers) {

        if (numbers.length == 1)
            return (numbers[0] * numbers[0]);

        else

        return (numbers[0] * numbers[1]);
    }
}
