package Gun36.a_Example;

//bir tür yapısı: class
public class Student {
    int id;
    String name;
    String surname;
    int classroom;

    //2.Yöntem için yazıldı
  /*  public static Student createStudent(int id, String name, String surname, int classroom){

        Student ogrenci = new Student();
        ogrenci.id = id;
        ogrenci.name = name;
        ogrenci.surname = surname;
        ogrenci.classroom = classroom;

        return ogrenci;
    }

   */

    //Constructor : yapıcı metod: ilk oluşmada yapılması istenen işlemlerin yazıldığı metod.

    public Student(int id, String name, String surname, int classroom){

        System.out.println("Constructor çalıştı...");

        //this: class ın kendisini gösteriyor yani Student ı gösteriyor.
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.classroom = classroom;
    }

    public Student(int id, String name, String surname){

    /*  this.id = id;
        this.name = name;
        this.surname = surname;
        this.classroom = 0;
     */
        this(id,name,surname,0);
    }

    public Student(int id, String name){

   /*   this.id = id;
        this.name = name;
        this.surname = "";
        this.classroom = 0;
    */
        this(id,name,"",0);
    }

    public Student(int id){

    /*  this.id = id;
        this.name = "";
        this.surname = "";
        this.classroom = 0;
     */
        this(id,"","",0);
    }

    public Student(){

    /*  this.id = 0;
        this.name = "";
        this.surname = "";
        this.classroom = 0;

     */

        this(0,"","",0);
    }


}
