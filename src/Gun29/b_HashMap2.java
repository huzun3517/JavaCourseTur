package Gun29;

import java.util.HashMap;
import java.util.Map;

public class b_HashMap2 {

    public static void main(String[] args) {

        Map<String,String> userMap = new HashMap<>();
        userMap.put("name","Ahmet Zan");
        userMap.put("email","ahmet@hotmail.com");
        userMap.put("adres","Şişli / İstanbul");
        userMap.put("MobilTel","0 532 2300000.com");

        System.out.println("userMap.get(name) = " + userMap.get("name")); // userMap.get(name) = Ahmet Zan
        System.out.println("userMap.get(adres) = " + userMap.get("adres")); // userMap.get(adres) = ahmet@Şişli / İstanbul

        Map<String,String> userMap2 = new HashMap<>();
        userMap2.put("name","Ayşe Yılmaz");
        userMap2.put("email","ayse@hotmail.com");
        userMap2.put("adres","Pendik / İstanbul");
        userMap2.put("MobilTel","0 549 2300000");

        System.out.println("userMap2.get(name) = " + userMap2.get("name")); // userMap2.get(name) = Ayşe Yılmaz
        System.out.println("userMap2.get(adres) = " + userMap2.get("adres")); //userMap2.get(adres) = Pendik / İstanbul

        Map<String, Map<String,String>> kartvizitler = new HashMap<>();
        kartvizitler.put("Ahmet",userMap);
        kartvizitler.put("Ayşe",userMap2);
        System.out.println("kartvizitler = " + kartvizitler);

        String ahmetinAdresi = kartvizitler.get("Ahmet").get("adres");
        System.out.println("ahmetinAdresi = " + ahmetinAdresi); // ahmetinAdresi = Şişli / İstanbul
        System.out.println("kartvizit.get(Ayşe).get(MobilTel) = " + kartvizitler.get("Ayşe").get("MobilTel"));
        //kartvizit.get(Ayşe).get(MobilTel) = 0 549 2300000

    }
}
