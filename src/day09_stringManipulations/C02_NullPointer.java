package day09_stringManipulations;

public class C02_NullPointer {

    public static void main(String[] args) {


        String isim1;

        // System.out.println(isim1);
        // Bir method icinde olusturulan String variable'lara
        // deger atamadan kullanamayiz


        String isim2 = "Ali";
        String isim3 = "";
        String isim4 = "Buse Sena";
        // isim3'e hiclik degeri atanmistir


        // EGER bir variable'a deger atamadan
        // variable'i listeleyebilmek istersek
        // o variable'i null olarak isaretleyebiliriz

        String isim5 = null;

        System.out.println(isim5); // null

        // NOT : null olarak isaretlenen variable'lar YAZDIRILABILIR
        //       ama baska method'larla kullanilamaz

        System.out.println(isim2.length()); // 3
        System.out.println(isim3.length()); // 0

        // System.out.println(isim5.length()); // NullPointerException


        System.out.println( "5. ogrenci : " + isim5); // 5. ogrenci : null

    }
}
