package day02_scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        // non-primitive data turleri bir class'dan olusturuldugu icin
        // isimleri buyuk harfle baslar

        String metin1 = "Java candir.";


        int sayi1 = 10;
        boolean bl = true;
        char chr = 'k';
        double dbl = 34.7;


        System.out.println(metin1.toUpperCase()); // JAVA CANDIR.

        System.out.println(metin1.toLowerCase()); // java candir.

        System.out.println(metin1.charAt(0)); // J
        System.out.println(metin1.charAt(2)); // v
        System.out.println(metin1.charAt(6)); // a
        System.out.println(metin1.charAt(8)); // d




    }
}
