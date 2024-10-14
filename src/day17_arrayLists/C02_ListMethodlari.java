package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>(Arrays.asList(5,7,2,9,1,2,5,9,3));

        System.out.println(sayilar); // [5, 7, 2, 9, 1, 2, 5, 9, 3]


        // listede kac element oldugunu yazdirin
        System.out.println(sayilar.size()); // 9


        // listede element olarak 7'nin var olup olmadigini yazdirin
        System.out.println(sayilar.contains(7)); // true
        System.out.println(sayilar.contains(17)); // false

        // listede varsa 2'nin ilk index'ini yazdirin
        System.out.println(sayilar.indexOf(2)); // 2

        // listede varsa 2'nin son kullanilma index'ini yazdirin
        System.out.println(sayilar.lastIndexOf(2)); // 5

        // listede varsa 11'in ilk index'ini yazdirin
        System.out.println(sayilar.indexOf(11)); // -1

        // listede 2 icin asagidaki cumlelerden uygun olani yazdirin
        // listede 2 yok
        // listede 2 sadece 1 tane var
        // listede 2 1'den fazla var

        if (sayilar.indexOf(2) == -1){
            System.out.println("listede 2 yok");
        } else if ( sayilar.indexOf(2) == sayilar.lastIndexOf(2)) {
            System.out.println("listede 2 sadece 1 tane var");
        }else {
            System.out.println("listede 2 1'den fazla var");
        }


        sayilar.clear();
        System.out.println(sayilar); // []

    }
}
