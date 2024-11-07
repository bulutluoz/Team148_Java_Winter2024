package day32_Iterator_Collections;

import java.util.Arrays;

public class P01_Iterator {
    public static void main(String[] args) {

        int [] arr={3,5,7,9};
          //her bir elamanını 2 arttıralım

        for (int i = 0; i < arr.length; i++) {

            arr[i]+=2;

        }

        System.out.println(Arrays.toString(arr));// [5, 7, 9, 11]


        //index kullanmadan her bir elamanı 2 arttıralım

        for (int each:arr){
            each+=2;
        }

        System.out.println(Arrays.toString(arr)); // [5, 7, 9, 11]

    }
}
