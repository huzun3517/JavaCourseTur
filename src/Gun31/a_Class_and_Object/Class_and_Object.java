package Gun31.a_Class_and_Object;

class Main{

    public static void main(String[] args) {
        
        Araba araba1 = new Araba(); // Nesne, Araba sınıfından türetildi
        araba1.model = "honda civic";
        araba1.motorhacmi = 1600;
        araba1.yili = 2020;

        System.out.println("model = " + araba1.model);
        System.out.println("motorhacmi = " + araba1.motorhacmi);
        System.out.println("yili = " + araba1.yili);
        
        
    }   
    
}

class Araba {
    //Properties, Attributes, fields
    String model;
    int yili;
    double motorhacmi;
}
