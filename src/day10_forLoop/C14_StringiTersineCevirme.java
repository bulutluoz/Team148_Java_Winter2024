package day10_forLoop;

import java.util.Scanner;

public class C14_StringiTersineCevirme {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");

        String metin = scanner.nextLine();

        String tersMetin = "";


        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        System.out.println("Metnin tersten yazilisi : " + tersMetin);

        // Tersten yazilisi ayni olan metinlere PALINDROME denir

        // girilen metnin palindrome olup olmadigini yazdirin

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        }else System.out.println("Girilen metin PALINDROME degil");

    }
}
