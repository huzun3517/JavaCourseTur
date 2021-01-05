package Gun61;

public class S71 {

    public static void main(String[] args) {

        int [][] arr = new  int [2][4];
        arr[0] = new int[]{1,3,5,7};
        arr[1] = new int[]{1,3};
        for (int [] a: arr ) {// 0 ve 1. satırları verir
            for (int i = 0; i < arr.length; i++) {  // sınır 2 : arr.length: arr nin kaç satır olduğunu gösterir,
                                                    // a.leng ise o satırdaki sütun sayısını
                System.out.println(a[i]+ " "); // a[0], a[1] yazar sadece 1 ve 3'ü yazar 1. satırdan
                // 2. satıra geçtiğinde yine : a[0], a[1] yazar yani 2. satırın 1 ve 3'ünü yazar.
            }System.out.println();
        }

    }
}
// 1 3
// 1 3

