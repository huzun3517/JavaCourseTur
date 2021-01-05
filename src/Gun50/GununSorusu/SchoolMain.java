package Gun50.GununSorusu;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {

    public static void main(String[] args) {

        School school1 = new School("Semikler",3);

        ArrayList<Student> okulunogrencileri = school1.getStudentslist();

        int ogrenciSayisi = 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(ogrenciSayisi + ".Öğrencinin adı: ");
            String ogrAd = scanner.nextLine();

            System.out.print(ogrenciSayisi + ".Öğrencinin Adresi: ");
            String ogrAdres = scanner.nextLine();

            Scanner scannerInt = new Scanner(System.in);
            System.out.print(ogrenciSayisi + ".Öğrencinin Ücreti: ");
            int ucret = scannerInt.nextInt();

            Student student = new Student(ogrAd,ogrAdres,ucret);
            okulunogrencileri.add(student);
            ogrenciSayisi++;

        }while (ogrenciSayisi <= school1.getMaxStudents());



        ArrayList<Employee> okulunpersoneli = school1.getEmployeeslist();

        int isciSayisi = 1;
        do {
            System.out.print(isciSayisi + ".Personel adı: ");
            String perAd = scanner.nextLine();

            System.out.print(isciSayisi + ".Personel Adresi: ");
            String perAdres = scanner.nextLine();

            Scanner scannerInt = new Scanner(System.in);
            System.out.print(isciSayisi + ".Personel Maaşı: ");
            int perMaas = scannerInt.nextInt();

            Employee personel = new Employee(perAd,perAdres,perMaas);
            okulunpersoneli.add(personel);
            isciSayisi++;

        }while (isciSayisi <= 4);


        System.out.println("okulunogrencileri = " + okulunogrencileri.toString());
        System.out.println("okuluniscileri = " + okulunpersoneli.toString());




    }
}
