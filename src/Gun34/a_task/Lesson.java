package Gun34.a_task;

public class Lesson {

    String name;
    int hour;

    // return (döndürme) yoksa void varsa tipi yazılır.
    public static Lesson createLesson(String name, int hour){
        Lesson ders=new Lesson();
        ders.name=name;
        ders.hour=hour;
        return ders;
    }
}
