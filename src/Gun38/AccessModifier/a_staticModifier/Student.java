package Gun38.AccessModifier.a_staticModifier;

public class Student {
    int id;
    String name;
    String surnName;

    static int ogrenciSayisi = 0;

    public Student(String name, String surnName) {
        this.name = name;
        this.surnName = surnName;

        ogrenciSayisi++;

        this.id = ogrenciSayisi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surnName='" + surnName + '\'' +
                '}';
    }
}
