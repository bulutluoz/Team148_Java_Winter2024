package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C05_HaftaIciHaftaSonu {

    public static void main(String[] args) {

        // kullanicidan gun ismini alin
        // buyuk kucuk harf farketmez
        // girilen gunun hafta ici veya haftasonu oldugunu yazdirin
        // kullanici gun ismini yanlis yazarsa uyarin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz...");
        String gunIsmi = scanner.nextLine().toLowerCase();

        // Pazar  , PAZAR, pazar, PAzar, PaZaR ==> pazar

        switch ( gunIsmi ){

            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("haftaici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("Girilen gun ismi yanlis...");
        }

    }
}
