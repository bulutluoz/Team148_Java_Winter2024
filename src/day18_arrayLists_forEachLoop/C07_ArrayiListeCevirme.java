package day18_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,5,6,2,3,4,1,2,3,4,5,6,7,8};


        // array'in elementlerini kullanarak bir list olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int each :arr){

            sayilar.add(each);

        }

        System.out.println("Sayilar listesi : " + sayilar);



        // Arrays class'inda bu cevirme islemini yapan hazir bir method var
        // ANCAK 2 buyuk dezavantaji oldugu icin GENELDE kullanilmaz
        // 1. list'in en buyuk avantaji olan ekleme ve remove yapilamaz
        // 2. Java array ve list'de yapilan tum degisikleri ortak olarak kabul eder

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Arrayden list : " + arraydenList);

        // arraydenList.add(5); // UnsupportedOperationException
        // arraydenList.remove(3); // UnsupportedOperationException


        arr[0] = 20;


        System.out.println("Arrayden list : " + arraydenList);


    }
}
