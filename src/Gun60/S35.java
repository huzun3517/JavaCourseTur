package Gun60;

public class S35 {

    public static void main(String[] args) {

        int num1[]= {1,2,3};
        int num2[]= {1,2,3,4,5};
        num2= num1;
        for (int x: num2 ) {
            System.out.println(x + ":");
        }
    }
}
