package Gun24;

import java.util.ArrayList;

public class a_ArrayList1 {

    public static void main(String[] args) {
        // Array      : boyut sayısının belli olduğu ve değerlerin çok sık değiştirilmediği durumlarda
        int[] dizi = new int[5]; // Array: Daha sonradan boyutu değiştirilemiyor.

        // Arraylist  : Boyutu dinamik yani değişken ve değerlerin hızlı değimesi durumunda daha hızlı
        ArrayList<Integer> integerliste = new ArrayList<Integer>(); // tanımlama
        ArrayList<Boolean> booleanliste = new ArrayList<Boolean>();
        ArrayList<String> stringliste  = new ArrayList<>(); // <> arası en son kısımda boş bırakılabilir.

        // String Arraylist tanımlanması
        ArrayList<String> isimler = new ArrayList<>();

        // Eleman ekleme
        isimler.add("Ahmet");
        isimler.add("Ayşe");
        isimler.add("Kaya");
        System.out.println("1-isimler = " + isimler); // 1-isimler = [Ahmet, Ayşe, Kaya]

        //belli bir indexe eleman ekleme, eklendiği indexten sonrakiler bir aşağı kayar.
        isimler.add(1,"Zeynep");
        System.out.println("2-isimler = " + isimler); // 2-isimler = [Ahmet, Zeynep, Ayşe, Kaya]

        // 2 nolu indexteki elemanı verir.
        String elemanAtIndex2 = isimler.get(2);

        // 0 nolu indexteki elemanın değerini değiştirir.
        isimler.set(0,"Deniz");
        System.out.println("3-isimler = " + isimler); // 3-isimler = [Deniz, Zeynep, Ayşe, Kaya]

        // Eleman sayısını verir, Array deki length gib
        int elemanSayisi = isimler.size();

        // Listenin tamamen boş olup olmadığını verir.
        boolean listeBosMu = isimler.isEmpty();

        // Eleman silme
        isimler.remove("Ayşe");
        System.out.println("4-isimler = " + isimler); // 4-isimler = [Deniz, Zeynep, Kaya]

        isimler.remove(1);
        System.out.println("5-isimler = " + isimler); //  5-isimler = [Deniz, Kaya]

        //Bir elemanın indexini bulma
        int indexOfKaya = isimler.indexOf("Kaya");

        //Tüm elemanları boşaltma
        isimler.clear();
        System.out.println("6-isimler = " + isimler); // 6-isimler = []


    }
}
