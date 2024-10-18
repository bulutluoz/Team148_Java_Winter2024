package day12_methodOverloading_WhileLoop;

import java.util.Scanner;

public class P05_whileLoop {

    /*
            Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
            Kullaniciya bitirmek istediginde Q'a basmasini soyleyin
            Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
            ve bunlarin toplaminin kac oldugunu yazdirin
            Kullanici negatif sayi girerse
            "negatif sayi kullanamazsiniz " yazdirin
            bu negatif sayiyi sayi adedine ve toplama eklemeyin

     */


  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

    String harf = "";
    int toplam = 0;
    int sayac = 0;
    int sayi = 0;

    while (!(harf.equals("Q") || harf.equals("q"))) {
        System.out.print("Toplanmak üzere pozitif Tamsayılar giriniz\nÇıkış yapamk için Q tuluna basınız\nSayı:");
        if (scan.hasNextInt()) { //Kullanıcının int bir sayı girip girmediğini kontrol ediyor
            sayi = scan.nextInt();

            if (sayi < 0) {
                System.out.println("negatif sayi kullanamazsiniz\n");
            } else {
                toplam += sayi;
                sayac++;
            }


        } else {
            harf = scan.next();

            if (!(harf.equals("q")||harf.equals("Q"))) {
                System.out.println("Hatalı tuşa bastınız. Bitirmek için Q tuşuna basmalınız\n ");
            }
        }

    }
      System.out.println("Hesaplanıyor...");
      System.out.println("Girdiğiniz "+sayac +" sayının toplamı: "+toplam+"\n ");
      System.exit(0);

    }
}

