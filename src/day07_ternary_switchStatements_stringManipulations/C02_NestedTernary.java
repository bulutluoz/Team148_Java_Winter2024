package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C02_NestedTernary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        System.out.println(

               sayi > 0

               ?

               sayi % 2 == 0 ? "Cift sayi" : "Cift sayi degil" // sayi pozitif ise calisacak kodlar

                :

                sayi>=-999 && sayi<=-100 ? "3 basamakli sayi" : "3 basamakli sayi degil" // sayi pozitif degilse calisacak kodlar

        );


        // System.out.println( sayi > 0 ? sayi % 2 == 0 ? "Cift sayi":"Cift sayi degil":sayi>=-999 && sayi<=-100 ?"3 basamakli sayi":"3 basamakli sayi degil");

    }
}
