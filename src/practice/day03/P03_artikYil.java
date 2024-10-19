package practice.day03;

import java.util.Scanner;

public class P03_artikYil {
    public static void main(String[] args) {
/*
        Kullnıcıdan artık yıl olup olmadığını kontrol etmek istediği yılı alın

        Koşul 1: 4 ile bölünemeyen yıllar artık yıl değildir

        Koşul 2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır

        Koşul3 : 4'ün katı olmasına rağmen 100 ile bölünebilen yıllrdan
                400 ile bölünebilen yıllar artık yıldır
 */


        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol etmek istediğini yılı giriniz: ");
        int k=scan.nextInt();

        if (k%100==0 && k%400==0) {
            System.out.println("Girmiş olduğunuz "+ k +" yılı bir artık yıldır.");
        } else if (k%4==0 && k%100!=0) {
            System.out.println("Girmiş olduğunuz "+ k +" yılı bir artık yıldır.");
        }else{
            System.out.println("Girmiş olduğunuz "+ k +" yılı bir artık yıl değildir");
        }

        System.out.println("------------ Ternary Çözümü --------------");
        String result=k%100==0 ? (k%400==0 ? "Artık Yıldır" : "Artık Yıl Değildir")
                        : (k%4==0 ? "Artık Yıldır" : "Artık Yıl Değildir");
        System.out.println(result);
    }
}
