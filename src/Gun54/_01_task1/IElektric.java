package Gun54._01_task1;

// todo bir interface bir başka interface den mirasını aldık, yani exend ettik.
public interface IElektric extends IVehicle {

    final static int batteryLife = 100;

    String changeBattery();
// todo Soyut yani süslü parantezli kısmı olmayan, yani gövdesi olmayan sadece adı ve parametresleri olan
//  metodlara Abstract metod diyoruz.


    // todo Interface lerde sadece aşağıdaki şekilde gövdeli metod kullanılabilir.

    // todo default belirteci ile
    default void print() {

        System.out.println("default tipli metod yazılabilir...");

    }
    // todo veya static şekilde
     static void autoPilot() {

         System.out.println("otonom sürüş modu");
     }
}
