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


           } else if (scan.hasNextLine()) {
               harf = scan.nextLine();
               if (harf.equals("q")||harf.equals("Q")) {
               System.out.println("Hesaplanıyor...\n");
               System.out.println("Girdiğiniz "+sayac +" sayının toplamı: "+toplam+"\n ");
               System.exit(0);
               }else{
                   System.out.println("Hatalı tuşa bastınız. Bitirmek için Q tuşuna basmalınız\n ");
               }
           }

       }

    //   //-----Mammad Çözüm------


    //   String harf2 = "";
    //   int toplam2 = 0;
    //   int sayac2 = 0;
    //   int sayi2 = 0;
    //   while (!(harf2.equals("Q") || harf2.equals("q"))) {
    //       System.out.println("Toplanmak uzere pozitif tamsayilar giriniz\nCikis yapmak icin Q tusuna basiniz\nSayi: ");
    //       if (scan.hasNextInt()) {  // Kullanıcının int bir sayı girip girmediğini kontrol ediyor
    //           sayi2 = scan.nextInt();
    //           if (sayi2 < 0) {
    //               System.out.println("Negatif sayi kullanilamaz");
    //           } else {
    //               toplam2 += sayi2;
    //               sayac2++;
    //           }
    //       } else {
    //           // Harf girdisini alıyoruz ve kontrol ediyoruz.
    //           harf2 = scan.next();
    //           if (!(harf2.equals("Q") || harf2.equals("q"))) {
    //               System.out.println("Lütfen geçerli bir sayı veya 'Q' giriniz.");
    //           }
    //       }
    //   }
    //   // Sonuçları yazdırıyoruz.
    //   System.out.println("Girilen pozitif tamsayi adedi: " + sayac2);
    //   System.out.println("Girilen pozitif tamsayilarin toplami: " + toplam2);
    }
}

