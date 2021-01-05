package Gun54._01_task1;

public class TeslaCar extends Vecihle implements IElektric {


    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "2 yılda bir batarya değiştir.";
    }

    @Override
    public String drive() {
        return "hızlı sür, Auto pilot sür.";
    }
}




