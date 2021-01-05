package Gun33.b_tasks.task2;

import java.util.ArrayList;

public class Lesson {

    String name;
    int credit;

    public static Lesson lessonCreate(String name, int credit) {

        Lesson ders = new Lesson();
        ders.name = name;
        ders.credit = credit;
        return ders;
    }
}
