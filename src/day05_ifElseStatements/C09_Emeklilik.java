package day05_ifElseStatements;

import java.util.Scanner;

public class C09_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        if (yas >= 65) System.out.println("Emekli olabilirsin");
        else System.out.println("Emekli olabilmek icin " + (65-yas) + " yil daha calismalisin");
    }
}
