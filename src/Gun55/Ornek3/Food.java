package Gun55.Ornek3;

public abstract class Food {

    private String name;

    public abstract void madeln(); // menşei
    public abstract void taste(); // tadı

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
