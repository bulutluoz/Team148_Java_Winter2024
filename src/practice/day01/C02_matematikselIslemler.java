package practice.day01;

import java.util.Scanner;

public class C02_matematikselIslemler {

    public static void main(String[] args) {
        // Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 4 basamaklı bir sayı giriniz: ");
        int sayi= scan.nextInt();
        System.out.println("Girmiş olduğunuz sayı: "+sayi); //4586

        int birlerBasamagi=sayi%10; // 6
        System.out.println("birlerBasamagi = " + birlerBasamagi);
        sayi=sayi/10;  //sayi: 458

        int onlarbasamagi=sayi%10; // 8
        System.out.println("onlarbasamagi = " + onlarbasamagi);
        sayi=sayi/10; //45

        int yuzlerBasamagi=sayi%10;  // 5
        System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);

        int binlerBasamagi=sayi/10;
        System.out.println("binlerBasamagi = " + binlerBasamagi);

      //  int rakamlarToplami=binlerBasamagi+yuzlerBasamagi+onlarbasamagi+birlerBasamagi;
      //  System.out.println("Girilen Sayının Rakamları Toplamı = " + rakamlarToplami);

        System.out.println("Girilen Sayının Rakamları Toplamı = " + (binlerBasamagi+yuzlerBasamagi+onlarbasamagi+birlerBasamagi));




    }
}
