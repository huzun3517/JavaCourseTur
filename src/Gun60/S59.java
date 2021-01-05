package Gun60;

public class S59 {

    public static void main(String[] args) {

        int[] intArr = {8,16,32,64,128};

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i] + " ");// for döngüsünde intArr[i] yazdırılmalı
        }

        for (int i : intArr){
            System.out.println(i + " ");// for eachde ise intArr i'ye atandığı için i print edilmeli
        }

    }
}