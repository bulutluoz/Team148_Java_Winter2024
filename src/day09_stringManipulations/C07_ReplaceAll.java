package day09_stringManipulations;

import java.util.Scanner;

public class C07_ReplaceAll {

    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve 16 haneli kredi karti numarasini alin
        // bilgileri asagidaki gibi yazdirin
        // Girilen bilgiler : C** D****,  **** **** **** 4567

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen 16 hane olarak kredi karti numaranizi giriniz...");
        String kkNo = scanner.nextLine();

    }
}
