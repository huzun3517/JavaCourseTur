package Gun33.b_tasks.task1;

public class Main {

    public static void main(String[] args) {
        //TODO
        // Math sınıfındaki metotlardan 5 tanesini kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarınızı kullanabilirsiniz.)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek kullanımlarını yazınız.

        System.out.println("En kücük sayı = " + myMath.getMin(5,36));
        System.out.println("En büyük sayı = " + myMath.getMax(5,4));
        System.out.println("En büyük sayı = " + myMath.getMax(3,4,6,7,8,0,-5,21));
        System.out.println("Sayının mutlak değeri = " + myMath.getMutlak(-10));
        System.out.println("Sayının üssü= " + myMath.getUs(3,2));
        System.out.println("Sayının karekökü = " + myMath.getKarekok(9));
        System.out.println("Sayının faktöriyeli = " + myMath.getfaktoriyel(5));
        System.out.println("Random sayı = " + myMath.randomNum(5,20));
        System.out.println("Sayıların toplamı = " + myMath.getSum(3,7,-9,66,34,-23,0));


    }

}
