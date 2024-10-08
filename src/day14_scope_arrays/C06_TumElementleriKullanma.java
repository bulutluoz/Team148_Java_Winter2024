package day14_scope_arrays;

import java.util.Arrays;

public class C06_TumElementleriKullanma {


    public static void main(String[] args) {

        int[] sayilar = {4,7,1,3,4,8,0,1};


        // sayilar array'ini yazdirin

        System.out.println(Arrays.toString(sayilar)); // [4, 7, 1, 3, 4, 8, 0, 1]


        // sayilar array'inin tum elementlerini yan yana yazdirin

        /*
            EGER bir array'in tum elementleri ile
            istenen bir islem yapacaksak
            for loop kullaniriz
         */


        for (int i = 0; i < sayilar.length ; i++) {

            System.out.print(sayilar[i] + " ");

        }

        // sayilar array'indeki tum elementlerin toplamini yazdirin

        int toplam=0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];
        }

        System.out.println("Tum elementlerin toplami : " + toplam); // 28


        // sayilar array'indeki cift sayilarin carpimini yazdirin

        int carpim = 1;

        for (int i = 0; i < sayilar.length ; i++) {

            if ( sayilar[i] % 2 == 0){
                carpim *= sayilar[i];
            }

        }

        System.out.println("Cift elementlerin carpimi : " + carpim); // 0









    }



}
