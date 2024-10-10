package day16_arrays_MultiDimensioanalArrays;

public class C06_SonElementlerinToplami {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin toplaminini
        // yazdiran bir method olusturun.

        int[][] arr = { {2,3,7,1,2},{3,5,1,2},{4,1,2},{1,2,3,6,8,1,2},{2} };


        // Tum elementleri elden gecirecek miyiz?

        int sonElementlerinToplami = 0;

        for (int i = 0; i < arr.length; i++) {


           sonElementlerinToplami += arr[i][arr[i].length-1] ;

        }

        System.out.println(sonElementlerinToplami); // 24


















    }
}
