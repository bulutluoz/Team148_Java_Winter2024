package day05_ifElseStatements;

import java.util.Scanner;

public class C14_ElseIleBitmezse {

    public static void main(String[] args) {

        /*
            Bir if else if... cumlesinde
            kodun sonu else ile bitmezse Java kod icin hata vermez
            ANCAKKKK else ile bitmeyen kodlarda
            bazi degerler icin sonuc uretilemeyecegini BILMEMIZ GEREKIR
         */

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if ( sayi % 3 == 0 && sayi % 5 == 0 ){
            System.out.println("super");
        } else if ( sayi % 3 == 0) {
            System.out.println( "3'un kati");
        } else if ( sayi % 5 == 0) {
            System.out.println( "5'in kati");
        }



        /*

            Eger ayni sayiya farkli sonuclar verilmesi mumkun olan bir kod yaziyorsak
            Once en kisitlayici olani yazmaliyiz
            aksi durumda digerleri verilen degeri yakalayacagi icin
            en dar olana hic bir deger kalmaz

            Ornegin 30 sayisi hem 3'e hem 5'e bolunur
                    asagidaki gibi once 3 veya 5'i kontrol edersek
                    onlar 30'u yakalar
                    ve 30 icin super yazdirma ihtimali kalmaz

                if ( sayi % 5 == 0) System.out.println( "5'in kati");
                else if ( sayi % 3 == 0) System.out.println( "3'un kati");
                else if (sayi % 3 == 0 && sayi % 5 == 0) System.out.println("super");


         */




    }
}
