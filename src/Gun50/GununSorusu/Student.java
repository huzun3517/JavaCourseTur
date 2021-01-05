package Gun50.GununSorusu;

public class Student extends Person {

    private double fee;

    public Student(String name, String address, double fee) {
        super(name, address);
        this.fee = fee;
    }


    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }


}
