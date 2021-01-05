package Gun31.b_Example;

//TODO bir student class ı tanımlayınız; fields: name, grade
// Ayrı bir dosyada Scholl class ı tanımlayınız; fields: name,adress,principalName,tuitionFees

public class Main {

    public static void main(String[] args) {

        Student ogrenci1 = new Student();
        
        ogrenci1.name = "Ayşe";
        ogrenci1.grade = 3;
        
        //1.Yöntem
        School okulu = new School();
        okulu.name = "Marmara Üniversitesi";
        okulu.adress = "göztepe";
        okulu.principalName = "Rektör";
        okulu.tuitionFees = 0;
        
        ogrenci1.schoolInfo = okulu;
        
        //2.Yöntem
        ogrenci1.schoolInfo = new School();
        ogrenci1.schoolInfo.name = "Marmara Üniversitesi";
        ogrenci1.schoolInfo.adress = "göztepe";
        ogrenci1.schoolInfo.principalName = "Rektör";
        ogrenci1.schoolInfo.tuitionFees = 0;

        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);

        System.out.println("ogrenci1.schoolInfo.name = " + ogrenci1.schoolInfo.name);

        Student ogrenci2 = new Student();
        
        
    }
    
    
    
    
    


   
}
