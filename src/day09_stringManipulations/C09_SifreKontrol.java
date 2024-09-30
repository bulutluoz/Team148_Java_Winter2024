package day09_stringManipulations;

import java.util.Scanner;

public class C09_SifreKontrol {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

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

        if (sayac == 0){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
