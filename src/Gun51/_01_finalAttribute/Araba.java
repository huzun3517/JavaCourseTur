package Gun51._01_finalAttribute;

public class Araba extends Tasit {


    public Araba(String model) {
        super(model);

        // super.model = "opel";  // final olduğu için değiştirilemiyor.
    }
}
