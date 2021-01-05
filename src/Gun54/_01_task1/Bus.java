package Gun54._01_task1;

public class Bus extends Vecihle implements IDeisel {

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDeisel() {
        return "Bir depo mazot ile 1000 km gider.";
    }

    @Override
    public String drive() {
        return "Yavaş sür, yolcuları rahatsız etme";
    }
}
