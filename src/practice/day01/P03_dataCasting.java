package practice.day01;

import java.util.Scanner;

public class P03_dataCasting {
    public static void main(String[] args) {
   /*
           Kullncıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün
           sonucun tam sayı kısmını yazdırın
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz");

        System.out.print("1. Sayı: ");
        double sayi1 = scan.nextDouble();

        System.out.print("2. Sayı: ");
        double sayi2 = scan.nextDouble();


        //System.out.println("İki sayının bölümünün tam sayı kısmı: "+(int)(sayi1/sayi2));

        int bolum = (int) (sayi1 / sayi2);
        System.out.println("İki sayının bölümünün tam sayı kısmı: " + bolum);

        // Kod düzeni için---->  Mac: CMD + Option + L    Win: CTRL + ALT + L

    }
}
