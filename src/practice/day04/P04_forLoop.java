package practice.day04;

import java.util.Scanner;

public class P04_forLoop {
    public static void main(String[] args) {

        // /*
        //        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        //        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı,
        //                        kendisine eşitse o sayi mükemmeldir.
        //        ORNEK:
        //        INPUT     : 6
        //        OUTPUT : 1,2,3
        //                      1+2+3 = 6 = 6 (Mükemmel)
        //
        //                      mukemmel sayi kontrolu
        //                      1. kullanicidan sayi alalim
        //                      2. bir toplam degiskeni olusturuyoruz
        //                      3. sayinin bolenleri bul
        //                      4. bolenleri toplamla topla
        //                      5. sayiyla toplamin esitligini kontrol et
        //
        //        */
        System.out.println("==== Mükkemmel sayı Kontrol Modülü ====\n");
        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol etmek istedğiniz sayıyı giriniz: ");
        int sayi=scan.nextInt();

        int toplam=0;

        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+" ");
            }

        }

        System.out.println("");
        if (toplam==sayi){
            System.out.println(sayi+" sayısı bir mükemmel sayıdır");
        }else{
            System.out.println(sayi+" sayisi bir mükemmel sayı değildir");
        }



    }
}
