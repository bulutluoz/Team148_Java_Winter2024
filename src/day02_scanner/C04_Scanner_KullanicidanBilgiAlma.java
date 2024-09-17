package day02_scanner;

import java.util.Scanner;

public class C04_Scanner_KullanicidanBilgiAlma {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alip, sayinin karesini yazdirin

        // 1.adim : Bir scanner objesi olusturun

        Scanner scanner = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in);
        //Scanner s = new Scanner(System.in);
        //Scanner ali = new Scanner(System.in);
        // objenin adini istedigimiz gibi belirleyebiliriz
        // ANNCAKK Scanner class'indan olusturulan bir obje oldugunu belirten bir isim olmasi TERCIH EDILIR

        // 2.adim : kullaniciya ne istediginizi soyleyin

        System.out.println("Lutfen bir tamsayi giriniz...");


        // 3.adim : kullanicidan istedigimiz datanin turune uygun
        //          next...() method'unu kullanip konsoldan degeri alin

        int girilenSayi = scanner.nextInt();

        System.out.println("Girdiginiz sayinin karesi : " + girilenSayi * girilenSayi );


    }
}
