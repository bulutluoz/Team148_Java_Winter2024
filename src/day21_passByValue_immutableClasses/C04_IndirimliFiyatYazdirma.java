package day21_passByValue_immutableClasses;

public class C04_IndirimliFiyatYazdirma {

    public static void main(String[] args) {

        // 3 farkli method olusturup
        // verilen fiyat variable'ina %10, %20 ve %40 indirim yapin
        // method'larda fiyatin indirimli halini kaydedip
        // "urunun %10 indirimli fiyati : 90" seklinde yazdirin

        double fiyat = 200;

        indirimliFiyatyazdir10(fiyat); // 180

        indirimliFiyatyazdir20(fiyat); // 160

        indirimliFiyatyazdir40(fiyat); // 120

    }

    public static void indirimliFiyatyazdir10(double fiyat){

        fiyat = 90 * fiyat / 100 ;

        System.out.println("%10 indirimli fiyat : " + fiyat);

    }

    public static void indirimliFiyatyazdir20(double fiyat){

        fiyat = 80 * fiyat / 100 ;

        System.out.println("%20 indirimli fiyat : " + fiyat);

    }

    public static void indirimliFiyatyazdir40(double fiyat){

        fiyat = 60 * fiyat / 100 ;

        System.out.println("%60 indirimli fiyat : " + fiyat);

    }
}
