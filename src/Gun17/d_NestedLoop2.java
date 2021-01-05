package Gun17;

public class d_NestedLoop2 {

    public static void main(String[] args) {

        // Aşağıdaki şekilde çıktı veren programı print içerisinde
        // sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

        for (int i =0; i<5; i++) {

            for (int j=0; j<5;j++){ // iç döngü
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
