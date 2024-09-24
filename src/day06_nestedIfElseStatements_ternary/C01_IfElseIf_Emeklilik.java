package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C01_IfElseIf_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz K: Kadin, E: Erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();


        if (cinsiyet == 'K' && yas>=60 && yas<80 ) {
            System.out.println("Kadinlar 60 yasindan buyuk oldugu icin emekli olabilir");
        } else if (cinsiyet == 'K' && yas<60 && yas>20) {
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calisman gerekir");
        } else if (cinsiyet == 'E' && yas >=65 && yas <80) {
            System.out.println("Erkekler 65 yasindan buyuk oldugu icin emekli olabilir");
        } else if (cinsiyet == 'E' && yas<65 && yas>20) {
            System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir");
        }else{
            System.out.println("Girilen degerlerde hata var");
        }
    }
}
