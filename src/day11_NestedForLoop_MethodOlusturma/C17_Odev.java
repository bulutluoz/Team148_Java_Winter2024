package day11_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C17_Odev {

    public static void main(String[] args) {

        // Kullanicidan bir sifre isteyin
        // C16'daki method'u kullanarak sifreyi kontrol edin
        // ve sifre uygun oluncaya kadar islemi tekrar edin
        // sifre uygun oldugunda kac denemede uygun sifre yazabildigini soyleyin

        Scanner scanner = new Scanner(System.in);


//        for (int i = 1; i <10000 ; i++) {
//
//            System.out.println("Lutfen bir sifre giriniz...");
//            String sifre = scanner.nextLine();
//
//            if (C16_SifreDogruMuDondur.sifreDogruMu(sifre)){
//
//                System.out.println(i + " denemede gecerli sifre girdiniz...");
//                break;
//
//            }
//
//        }

        boolean sormayaDevamEdeyimMi = true;
        int sayac = 1;

        while ( sormayaDevamEdeyimMi ){

            System.out.println("Lutfen bir sifre giriniz...");
            String sifre = scanner.nextLine();

            if ( C16_SifreDogruMuDondur.sifreDogruMu(sifre)){
                System.out.println(sayac + " denemede gecerli sifre girdiniz...");
                sormayaDevamEdeyimMi = false;
            }

            sayac++;
        }


    }
}
