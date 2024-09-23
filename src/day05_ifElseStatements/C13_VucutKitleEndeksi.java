package day05_ifElseStatements;

import java.util.Scanner;

public class C13_VucutKitleEndeksi {
    public static void main(String[] args) {

        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin
        //    (kilo*10000 / (boy *boy))
        // vucut kitle endeksi
        //      30’dan buyukse obez,
        //      25-30 arasi ise kilolu,
        //      20-25 arasi ise normal,
        //      20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kg olarak kilonuzu giriniz...");
        double kilo = scanner.nextDouble();

        System.out.println("cm olarak boyunuzu giriniz...");
        double boy = scanner.nextDouble();
        double vke = (kilo * 10000 / (boy * boy));


        if (   !(kilo < 30 || boy < 50 ) ) {
            System.out.println("Vucut kitle endeksiniz : " + vke);
        }


        if (kilo < 30 || boy < 50 )
            System.out.println("Verilen degerler icin Vucut kitle endeksi hesaplanamaz...");
        else if (vke > 30 ) System.out.println( "Durumunuz : Obez ");
        else if (vke > 25) System.out.println( "Durumunuz : Kilolu ");
        else if (vke > 20) System.out.println( "Durumunuz : Saglikli degerlere sahipsiniz ");
        else System.out.println( "Durumunuz : Zayifsiniz ");




    }
}
