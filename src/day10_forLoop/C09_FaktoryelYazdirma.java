package day10_forLoop;

import java.util.Scanner;

public class C09_FaktoryelYazdirma {

    public static void main(String[] args) {

        // Kullanicidan 18’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //	Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 18'den kucuk pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        int faktoryelDegeri = 1 ;


        System.out.print(sayi + "! = ");

        for (int i = sayi; i >=1 ; i--) {

            if (i>1)System.out.print(i+" * ");
            else System.out.print(i);

            faktoryelDegeri *= i ;
        }
        System.out.print(" = " + faktoryelDegeri);






    }
}
