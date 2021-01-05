package Gun06;

import java.util.Scanner;

public class h_Ornek7 {

    public static void main(String[] args) {

        // Kullanıcıdan username(String), password(int) ve gizli soruyu(cümle)
        // alıp ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username : ");
        String username = scanner.nextLine();

        System.out.print("Password : ");  // Scanner scanner2 = new Scanner(System.in);
        int password = scanner.nextInt(); // System.out.print("Password : ");
        scanner.nextLine();                // int password = scanner.nextInt();

        System.out.print("Gizli Soru : ");
        String  gizli = scanner.nextLine(); // satır okuma

        System.out.println("Username: " + username);
        System.out.println("Password: " +password );
        System.out.println("Gizli soru: " + gizli);
    }
}
