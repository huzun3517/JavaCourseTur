package Gun36.b_tasks.task1;

public class task1 {

    public static void main(String[] args) {

        // TODO
        //  Ayrı bir Book class ı yazınız.fields: name,publishYear,autor.
        //  3 adet Consructor ekleyiniz.
        //  Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        //  3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        Book book1 = new Book("Mobi Dick",1934,"Herman Marville");
        Book book2 = new Book("Kavgam",1945);
        Book book3 = new Book("Vadideki Zambak");

        book1.ShowInfo();
        book2.ShowInfo();
        book3.ShowInfo();

     //   int sayi = 5;
     //   System.out.println(sayi); // toString yapıyor otomatik olarak.

        System.out.println(book1); // book1 in String e çevrilmiş hali, yani toString


    }




}
