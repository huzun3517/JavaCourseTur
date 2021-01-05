package Gun46.Encapsulation1;

public class Kisi {

    String ad;
    String soyad;
    private int yas;

    // setter method
    public void setYas(int yas) {

        this.yas = Math.abs(yas); // Mutlak değer


/*          2.YÖNTEM
        if (yas > 0) {
            this.yas = yas;
        }

        else {
            this.yas = -yas;
        }
 */
    }
// getter method
    public int getYas() {

        return this.yas;
    }


}
