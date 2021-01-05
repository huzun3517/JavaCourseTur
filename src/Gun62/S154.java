package Gun62;

public class S154 {

//    int count; --> sorunun orjinali
    static int count;

    public static void displayMsg () {
        System.out.println("Welcome Visit Count: "+ count++); // line n1
        // static olmayan dışardaki değişkenler static metodun içinden çağrılamaz.
    }

    public static void main(String[] args) {
        S154.displayMsg();
        displayMsg();  // line n2
    }

}