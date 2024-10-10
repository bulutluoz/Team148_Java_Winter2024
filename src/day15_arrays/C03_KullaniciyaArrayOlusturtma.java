package day15_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip
        // array’i olusturun

        Scanner scanner = new Scanner(System.in);

        System.out.println("Array'e konulacak eleman sayisini giriniz...");
        int arrLength = scanner.nextInt();

        int[] sayilar = new int[arrLength];



        for (int i = 0; i <arrLength ; i++) {

            System.out.println("Array'e konulacak bir tamsayi giriniz");

            sayilar[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(sayilar));

    }


    // Kullanicidan array’in boyutunu ve elementlerini alip
    // array’i olusturan ve bize donduren bir method olusturun.

    public static int[] arrayOlustur(){
    // method signature = methodIsmi + parametrelerin data turu
    //                  = arrayOlustur + ""
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array'e konulacak eleman sayisini giriniz...");
        int arrLength = scanner.nextInt();

        int[] sayilar = new int[arrLength];



        for (int i = 0; i <arrLength ; i++) {

            System.out.println("Array'e konulacak bir tamsayi giriniz");

            sayilar[i] = scanner.nextInt();

        }

        return sayilar;
    }


    public static String[] stringArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Array'e konulacak eleman sayisini giriniz...");
        int arrLength = scanner.nextInt();

        String[] metinler = new String[arrLength];
        scanner.nextLine();

        for (int i = 0; i <arrLength ; i++) {

            System.out.println("Array'e konulacak bir metin giriniz");

            metinler[i] = scanner.nextLine();

        }

        return metinler;
    }




}
