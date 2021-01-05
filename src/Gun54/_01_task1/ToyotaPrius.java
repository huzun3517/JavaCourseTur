package Gun54._01_task1;

public class ToyotaPrius extends Vecihle implements IGas,IDeisel {
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "Ömür boyu değiştirmeden sür";
    }

    @Override
    public String changeOil() {
        return "130 litre benzin ile 1000 km yol al.";
    }

    @Override
    public String drive() {
        return "ilk 10 km elektrikte kullanın";
    }
}
