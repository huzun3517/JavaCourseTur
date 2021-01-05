package Gun39.javaEnum.Ex4;

public class Ex4Main {

    public static void main(String[] args) {

        Months ay = Months.MART; // atama anında constructor gibi çalışan bölüm gün miktarını days e set ediyor.
        ay.getGunMiktari();

        System.out.println("ay.days = " + ay.days);

 /*       switch (ay){

            case OCAK:
                System.out.println("31");
                break;

            case SUBAT:
                System.out.println("28");
                break;

            case MART:
                System.out.println("30");
                break;

            case NISAN:
                System.out.println("31");
                break;
        }

  */


    }


}
