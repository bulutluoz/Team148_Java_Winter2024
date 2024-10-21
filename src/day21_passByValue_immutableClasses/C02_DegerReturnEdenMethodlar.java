package day21_passByValue_immutableClasses;

import java.util.Scanner;

public class C02_DegerReturnEdenMethodlar {

    public static void main(String[] args) {


        // Verilen isim ve soyismi duzenleyip
        // Ilk harfleri buyuk, geriye kalan harfler kucuk olacak sekilde
        // "Isim Soyisim" halinde bize donduren bir method olusturun

        // kullanicidan isim ve soyisim alip
        // method'da duzenleyip yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println(ismiDuzenle(isim, soyisim));

    }


    public static String ismiDuzenle(String isim, String soyisim){

        isim = isim.substring(0,1).toUpperCase()+
               isim.substring(1).toLowerCase();

        soyisim = soyisim.substring(0,1).toUpperCase()+
                  soyisim.substring(1).toLowerCase();

        String duzenlenmisIsim = isim + " " + soyisim;

        return duzenlenmisIsim;

    }
}
