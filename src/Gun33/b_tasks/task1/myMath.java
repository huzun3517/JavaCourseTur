package Gun33.b_tasks.task1;

public class myMath {

    public static int getMin(int value1,int value2){

        return Math.min(value1,value2);
    }

    public static int getMax(int value1,int value2){

        return Math.max(value1,value2);
    }

    public static int getMax(int...numbers){

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){
                max = numbers[i];
            }

        }
        return max;
    }

    public static int getMutlak(int value1){

        return Math.abs(value1);
    }

    public static double getUs(int value1,int value2){

        return Math.pow(value1,value2);
    }

    public static double getKarekok(int value1){

        return Math.sqrt(value1);
    }

    public static int getfaktoriyel(int value1){

        int faktr = 1;
        for (int i = 1; i <= value1 ; i++) {
            faktr *= i;
        }
        return faktr;
    }

    public static int randomNum(int min, int max) {
        int value = 0;
        value = (int) (Math.random() * (max - min) + min + 1);
        return value;
    }

    public static int getSum(int...numbers) {

        int sum = 0;

        for (int i = 0; i <numbers.length ; i++) {

            sum += numbers[i];
        }

        return sum;
    }

}
