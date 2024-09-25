package day07_ternary_switchStatements_stringManipulations;

import java.util.Scanner;

public class C03_SwitchStatements {

    public static void main(String[] args) {

        /*
            Switch statements
            switch parantezine yazilan variable'in alabilecegi degerlere gore
            case'ler olusturur

            switch parantezine boolean,long,float ve double variable'lar yazilamaz
            bunun disindaki data turleri olabilir String, char, short, byte, int...

            switch calismaya basladiginda
            girilen degere uygun olan case'e gider ve calismaya baslar

            eger break; ile karsilasirsa durur
            break; ile karsilasmazsa switch'in sonuna kadar calisir

         */

        // kullanicidan rakam olarak gun numarasini alip
        // gun ismini yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz...");
        int gunNo = scanner.nextInt();

        switch ( gunNo ){

            case 1: // gunNo'nun degerinin 1 olmasi durumunda
                System.out.println("Gunlerden pazartesi");
                break;
            case 2:
                System.out.println("Gunlerden sali");
                break;
            case 3:
                System.out.println("Gunlerden carsamba");
                break;
            case 4:
                System.out.println("Gunlerden persembe");
                break;
            case 5:
                System.out.println("Gunlerden cuma");
                break;
            case 6:
                System.out.println("Gunlerden cumartesi");
                break;
            case 7:
                System.out.println("Gunlerden pazar");
                break;
            default: // yazilan case'lerden hicbirine uygun olmayan degerler
                System.out.println("Girilen deger gecersiz");

        }









    }
}
