package day33_collections_maps;

import java.util.Set;
import java.util.TreeSet;

public class C02_Set {

    public static void main(String[] args) {

        Set<Integer> sayilar = new TreeSet<>();
        sayilar.add(56);
        sayilar.add(45);
        sayilar.add(56);
        sayilar.add(56);
        sayilar.add(23);
        sayilar.add(56);
        sayilar.add(2);

        System.out.println(sayilar); //  [2, 23, 45, 56]


    }
}
