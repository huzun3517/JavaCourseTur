package Gun13;

import java.util.Scanner;

public class f_switch3 {

    public static void main(String[] args) {

        // Girilen bir ay numarasına göre, ayın kaç gün olduğunu yazdırınız.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ay numarası giriniz: ");
        int ayNo = scanner.nextInt();

        switch (ayNo) {
        /*  case 1: System.out.println("31");break;
            case 2: System.out.println("28");break;
            case 3: System.out.println("31"); break;
            case 4: System.out.println("30");break;
            case 5: System.out.println("31");break;
            case 6: System.out.println("30");break;
            case 7: System.out.println("31");break;
            case 8: System.out.println("31");break;
            case 9: System.out.println("30");break;
            case 10: System.out.println("31");break;
            case 11: System.out.println("30");break;
            case 12: System.out.println("31");break;
            default: System.out.println("Hatalı no");
        }
         */

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.print("yıl =");
                int yil = scanner.nextInt();
                scanner.nextLine();
                if (yil % 4 == 0)
                    System.out.println("29");
                else
                    System.out.println("28");
                break;
            default:
                System.out.println("Hatalı No...");


        }
    }
}
