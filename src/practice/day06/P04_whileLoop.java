package practice.day06;

import java.util.Scanner;

public class P04_whileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

        Scanner scan =new Scanner(System.in);
        int number=1;
        int sayi=0;
        int enBuyukSayi=0;

        while(number<=5){
            System.out.print(number+". sayıyı giriniz: ");
            sayi= scan.nextInt();
            if (sayi>enBuyukSayi){
                enBuyukSayi=sayi;
            }
            number++;
        }
        System.out.println(" Girilen sayılardan en büyüğü: "+enBuyukSayi);

    }
}
