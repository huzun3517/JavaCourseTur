package Gun54._01_task1;

import java.util.ArrayList;
import java.util.Arrays;

public class OtoGaleriMain {

    public static void main(String[] args) {

        TeslaCar tesla = new TeslaCar("Testla p90",310);
        ToyotaPrius toyota = new ToyotaPrius("pirus",1200);
        Bus otobus = new Bus("302",6000);

        tesla.print();
        IElektric.autoPilot();


        ArrayList<Vecihle> arabalar = new ArrayList<>(Arrays.asList(tesla,toyota,otobus));
        ArrayList<IVehicle> arabalar2 = new ArrayList<>();
        ArrayList<Object> arabalar3 = new ArrayList<>();

        for (Vecihle arac: arabalar) {
            System.out.println(arac.getClass().getSimpleName());
        }








    }
}
