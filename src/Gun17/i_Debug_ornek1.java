package Gun17;

public class i_Debug_ornek1 {

    public static void main(String[] args) {

        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek.
        // için başlamasını istediğimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılır. Program ilk olarak breakpoint de durur ve
        // F8 ile adım adım ilerletilir. Bu şekilde hem değerler izlenir.
        // hemde nasıl çalıştığı test edilebilir.
        
        int a = 10;
        
        a = 1000;
        
        a += 100;
        
        a *= 10;

        System.out.println("a = " + a);
    }
}
