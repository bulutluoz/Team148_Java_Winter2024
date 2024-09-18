package day03_dataCasting_WrapperClasses;

import java.util.Scanner;

public class C03_Ornek {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // birinci tamsayiyi ikinci tamsayiya bolun
        // ve sonucu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Lutfen 2 tamsayi giriniz...");

        int sayi1= scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println( "Iki sayinin bolum sonucu : " + (sayi1 / sayi2) ) ; // 123 / 10 ==> 12,3

        // Java iki tamsayiyi boldugunde sonucun sadece tamsayi kismini yazdirir 12

        System.out.println( "Iki sayinin bolum double sonucu : " + (double)(sayi1 / sayi2) ) ; // 12.0
        // java once bolme islemini yapip sonra cast ettigi icin 12.0 yazdirdi


        System.out.println( "Sayi1'i double yapinca bolum double sonucu : " + ((double)sayi1 / sayi2) ) ; // 12.0

        System.out.println( "Sayi2'i double yapinca bolum double sonucu : " + (sayi1 / (double)sayi2) ) ; // 12.0

        System.out.println( "iki sayiyi da double yapinca bolum double sonucu : " + ((double)sayi1 / (double)sayi2) ) ; // 12.0

    }
}
