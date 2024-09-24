package day06_nestedIfElseStatements_ternary;

import java.util.Scanner;

public class C09_Ternary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi 100'den buyukse degerini 10 azaltin
        // sayi 100 veya daha kucukse degerini 10 artirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        sayi = sayi>100 ? sayi-10 : sayi+10 ;

        System.out.println(sayi); //


        // sayi ciftse sayinin degerini yariya indirin
        // sayi tekse sayinin degerini 20 artirin

        sayi = sayi%2 == 0 ? sayi/2 : sayi+20 ;

        System.out.println(sayi); //
    }
}
