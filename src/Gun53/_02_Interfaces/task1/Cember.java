package Gun53._02_Interfaces.task1;

public class Cember implements ISekil {

    @Override
    public int cevresi(int... numbers) {
        return (int)(2 * ISekil.PI * numbers[0]);
    }

    @Override
    public int alanı(int... numbers) {
        return  (int)(ISekil.PI * numbers[0] * numbers[0]);
    }
}
