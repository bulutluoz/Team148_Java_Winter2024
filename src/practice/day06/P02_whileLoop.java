package practice.day06;

import java.util.Scanner;

public class P02_whileLoop {
    /*
     * Kullanıcıdan alınan sayinin basamak degerlerinin toplamini
     * while loop ile yapin birkod yazınız.
     */


    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.print("Lütfen en az 3 basamaklı bir sayı giriniz: ");
        int sayi= scan.nextInt();
        int toplam=0;

        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println("Girdiğiniz sayının basamkları toplamı= "+toplam);

    }
}
