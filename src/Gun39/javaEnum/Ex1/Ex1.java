package Gun39.javaEnum.Ex1;

public class Ex1 {

    public static void main(String[] args) {

        //TODO
        // verilen ay nosuna göre ayın kaç gün olduğunu yazdırınız.

        Aylar ay = Aylar.MART;
        System.out.println("ay = " + ay); // ay = MART
        System.out.println("ay.name() = " + ay.name()); // ay.name() = MART
        System.out.println("ay.ordinal() = " + ay.ordinal()); // ay.ordinal() = 2

        switch (ay){
            case OCAK:
                System.out.println(31);
                break;
            case SUBAT:
                System.out.println(28);
                break;
            case MART:
                System.out.println(30);
                break;
            case NISAN:
                System.out.println(31);
                break;
            case MAYIS:
                System.out.println(30);
                break;
        }
    }
}
