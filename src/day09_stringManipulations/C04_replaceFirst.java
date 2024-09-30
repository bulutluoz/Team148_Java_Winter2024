package day09_stringManipulations;

import java.util.Scanner;

public class C04_replaceFirst {

    public static void main(String[] args) {


        String str = "Java ile yazilim dunyasina giris yap";

        System.out.println(str.replaceFirst("a", "A")); // JAva ile yazilim dunyasina giris yap


        // str.replaceFirst('a','A'); replaceFirst() char parametre kabul etmez


        str = "Java 1-3 ayda ogrenilir";

        System.out.println(str.replace("1", "2")); // Java 2-3 ayda ogrenilir

        // Kullanicidan bir cumle isteyin
        // eger cumle icinde rakam varsa, ilk rakam yerine X yazin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();

        // regex regular expression  ==> belirlenmis kisaltmalar
        /*
                \\d	Bir rakam (0-9)
                \\D	Rakam olmayan karakter
                \\w	Bir kelime karakteri (a-z, A-Z, 0-9 ve _ )
                \\W	Kelime karakteri olmayan bir karakter
                \\s	Beyaz boşluk karakteri (boşluk, tab, yeni satır vb.)
                \\S	Beyaz boşluk olmayan karakter
         */

        System.out.println(cumle.replaceFirst("\\d", "X"));


    }
}
