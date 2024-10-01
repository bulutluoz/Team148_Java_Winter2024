package day10_forLoop;

import java.util.Scanner;

public class C15_AsalSayiKontrolu {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayi giriniz: ");
        int girilenSayi= scan.nextInt();

        /*
            verilen sayinin ASAL OLMADIGINA hemen karar verebiliriz
            cunku herhangi bir tamsayiya bolunurse ASAL OLAMAZ

            AMMMA asal olduguna hemen karar veremeyiz
            2'den o sayiya kadar tum tamsayilari deneyip
            hicbirine bolunmezse o zaman ASAL DIYEBILIRIZ
         */

        int flag = 20;


        for (int i = 2; i < girilenSayi ; i++) {

            if (girilenSayi % i == 0){
                System.out.println("Girilen sayi ASAL SAYI degil");
                flag = 42;
                break;
            }
        }


        // flag icin 2 olasi deger var
        // eger flag == 20 ==> ASALDIR

        if (flag == 20) System.out.println("Girilen sayi ASAL");
    }
}
