package Gun03;

public class k_tekrar2 {

    public static void main(String[] args) {

        // değişken isimlendirme kuralları :  boşluk yok, harf,$, başlayabilir ve harf,$, sayıyla devam eder
        byte byteDegeR = 120;
        byte byteDeger = 120;
        short shortDeger = 32000;
        int  intDeger= 5;
        long longDeger = 6l;  // l zorunlu değil

        float floatDeger = 5.123456489f;  // f zorunlu double dan ayrılması için
        double doubleDeger = 6.1234567890123456789d; // d koyulabilir zorunlu değil

        char charDeger = 'A'; // karakterler tek tırnakla atanıyor
        char charDeger2 = 65 ; // karakterlerler temelde sayı olduğundan sayı degeri de atanabilir.
        // ekrana yazarken char tipi olduğundan harf olarak gözükür

        boolean boolDeger = true; // true veya false degeri alabilir.

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("charDeger = " + charDeger);
        System.out.println("charDeger2 = " + charDeger2);
        System.out.println("boolDeger = " + boolDeger);


    }
}
