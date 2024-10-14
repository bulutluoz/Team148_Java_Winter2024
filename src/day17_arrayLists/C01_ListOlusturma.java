package day17_arrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ListOlusturma {

    public static void main(String[] args) {

        int[] arr = {3,5,6};
        String[] isimler = new String[5];

        // arr ve isimler'in data turu Array'dir.
        // int ve String bu array'lerin icine koyacagimiz elementlerin data turudur

        // List<String> metinler = new List();
        // 'List' is abstract; cannot be instantiated
        // List abstract bir yapi oldugundan direkt obje OLUSTURULAMAZ

        List<String> harfler1 = new ArrayList<>();
        List<String> harfler2 = new ArrayList<String>();
        ArrayList<String> harfler3 = new ArrayList<>();

        // List<int> sayilar= new ArrayList<>();
        // Type argument cannot be of primitive type

        List<Integer> sayilar= new ArrayList<>();

        System.out.println(sayilar); // []

        sayilar.add(4);
        sayilar.add(7);
        sayilar.add(9);

        System.out.println(sayilar); // [4, 7, 9]

        sayilar.add(1,8);

        System.out.println(sayilar); // [4, 8, 7, 9]

        sayilar.add(0,3); // [3, 4, 8, 7, 9]

        System.out.println(sayilar); // [3, 4, 8, 7, 9]

        // eger List olusturulurken konulacak elementler belli ise
        // Arrays class'indan asList() ile direkt eklenebilir

        List<Integer> ekListe = new ArrayList<>(Arrays.asList(20,30,40));

        System.out.println(ekListe); // [20, 30, 40]


        sayilar.addAll(ekListe);

        System.out.println(sayilar); // [3, 4, 8, 7, 9, 20, 30, 40]
        System.out.println(ekListe); // [20, 30, 40]


        String str = "java candir";
        str.toUpperCase();

        System.out.println(str); // java candir


        System.out.println(ekListe); // [20, 30, 40]

        ekListe.add(50);

        System.out.println(ekListe); // [20, 30, 40, 50]

        /*
            String'de method ile yapilan degisiklikler
            atama olmazsa kalici degisiklik OLMAZ

            ama Array ve ArrayList icin
            method ile yapilan degisiklikler KALICI olur
            atama yapmaya gerek kalmaz
         */

    }
}
