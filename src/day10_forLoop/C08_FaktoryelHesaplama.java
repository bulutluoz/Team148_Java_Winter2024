package day10_forLoop;

import java.util.Scanner;

public class C08_FaktoryelHesaplama {

    public static void main(String[] args) {

        // Kullanicidan 14’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // 5 ! = 5 * 4 * 3 * 2 * 1 ==> 120


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 14'den kucuk pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        int faktoryelDegeri = 1 ;

        for (int i = sayi; i >= 1 ; i--) {

            faktoryelDegeri *= i ;


        }

        System.out.println(sayi + "! = " + faktoryelDegeri);

    }
}
