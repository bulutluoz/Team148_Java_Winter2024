package day13_doWhileLoop_scope;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayidan baslayarak 0'a kadar olan tamsayilari yazdirin

        /*

        Do While Loop icin

        Arti ozellikleri
        - kontrolden once loop body'si bir kere calisir
          boylece ilk atamada hata yapma riskini giderir
        - loop body calisma sayisi ile kontrol sayisi ayni

        Eksi ozellikleri
        - kontrolden once loop body'si bir kere calisir
          eger kullanici istenmeyen bir deger girmisse
          o deger bir defa loop'da calistirirlir

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        do {

            System.out.print(girilenSayi + " ");
            girilenSayi--;

        }while(girilenSayi>0);





    }
}
