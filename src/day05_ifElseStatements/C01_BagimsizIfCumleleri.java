package day05_ifElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi isteyin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // eger 1.sayi daha buyukse, "Girilen ilk sayi daha buyuk" yazdirin

        if (sayi1 > sayi2){
            System.out.println("Girilen ilk sayi daha buyuk");
        }

        // eger 2.sayi cif sayi ise "Girilen 2.sayi cift" yazdirin

        if ( sayi2 % 2 == 0){
            System.out.println("Girilen 2.sayi cift");
        }

        // sayi1 pozitifse "Pozitif sayilar guzeldir"

        if (sayi1 > 0){
            System.out.println("Pozitif sayilar guzeldir");
        }

    }
}
