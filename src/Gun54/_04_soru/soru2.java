package Gun54._04_soru;

public class soru2 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;
        int result = 0;
        int input[] = new int[5];
        try {
            input[0] = 0;
            input[1] = 1;
            input[2] = 2;
            input[3] = 3;
            input[4] = 4;
            input[5] = 5;
            result = num1 / num2;
            System.out.println("Result of Division : " + result);
        } catch (ArithmeticException e) {
            System.out.println("Err: Divided by Zero");
        } catch (Exception e) {
            System.out.println("Err: Exception");
 //     } catch (ArrayIndexOutOfBoundsException e) {   // Derleme zamanı hatası verir
            System.out.println("Err: Array Out of Bound");
        }
    }
}
