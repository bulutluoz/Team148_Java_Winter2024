package day02_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip
        //        bunlarin toplamini ve carpimini yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Ondalikli bir sayi giriniz...");
        double ondalikliSayi = scan.nextDouble();

        System.out.println("Bir tamsayi giriniz...");
        int tamsayi = scan.nextInt();


        System.out.println( "girilen sayilarin toplami : " + (ondalikliSayi + tamsayi) );
        System.out.println( "girilen sayilarin carpimi : " + (ondalikliSayi * tamsayi) );



    }
}
