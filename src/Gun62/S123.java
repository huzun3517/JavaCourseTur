package Gun62;

public class S123 {
    int a1;
    public static void doProduct(int a){
        a = a * a;
    }
    public static void doString(String s){
        s.concat(" " + s);
    }

    public static void main(String[] args) {
        S123 item = new S123();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;

        doProduct(i); // i değeri metodda primitive tipe dönüşerek işleme girdiğinden,nesne de olsa değeri değişemiyor.
        doString(sb); // sb metoda gönderiliyor ancak atama yapılmadığından concat sonucu değiştirmiyor.
        doProduct(item.a1); // burada a1 zaten primitive değer olduğundan değer etki edemiyor maindeki değer kalıyor.

        System.out.println(i + " " + sb + " " + item.a1);
    }
}
// 10 Hello 11