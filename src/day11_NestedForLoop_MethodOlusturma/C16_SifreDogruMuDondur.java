package day11_NestedForLoop_MethodOlusturma;

public class C16_SifreDogruMuDondur {

    public static void main(String[] args) {

        //Soru 4 : verilen sifre icin
        //         asagidaki sartlari kontrol edip
        //         kullaniciya duzeltmesi gereken tum eksikleri yazdiran,
        //         tum sartlari kontrol ettikten sonra
        //         sifrede hata yoksa true, hata varsa false donduren
        //         bir method olusturun
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        System.out.println(sifreDogruMu("Ali kos")); // false
        /*
            method'un icinde hatalari yazdirdi
            ilk harf kucuk harf olmali
            son karakter rakam olmali
            sifre bosluk icermemeli
            sifrenin uzunlugu en az 10 karakter olmali
         */


        System.out.println(sifreDogruMu("aliOkulaKos123")); //true

    }



    public static boolean sifreDogruMu(String sifre){

        int sayac = 0;

        //         - ilk harf kucuk harf olmali

        if ( ! Character.isLowerCase( sifre.charAt(0)) ){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }


        //         - son karakter rakam olmali

        if (  ! Character.isDigit( sifre.charAt(sifre.length()-1) )){

            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        //         - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali

        if ( !(sifre.length() >=10) ){

            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }


        // sayac 0 - 4 arasi olabilir
        // eger 0'sa ==> hic hata yok hepsi uygun
        // eger 4'se ==> hepsi hatali

        if (sayac == 0) {
            return true;
        }else{
            return false;
        }

    }
}
