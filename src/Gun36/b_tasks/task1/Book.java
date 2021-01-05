package Gun36.b_tasks.task1;

public class Book {

    String name;
    int publishYear;
    String autor;

    public Book(String name, int publishYear, String autor){
        this.name = name;
        this.publishYear = publishYear;
        this.autor = autor;
    }

    public Book(String name, int publishYear){
        this(name,publishYear,"");
    }

    public Book(String name){
        this(name,0,"");
    }

    public void ShowInfo(){

        System.out.println(name + " " + publishYear + " " + autor);
    }

    // toString metodu deniyor
    public String toString(){

        return name + " " + publishYear + " " + autor;
    }






}
