package day32_Iterator_Collections;

import java.util.LinkedList;
import java.util.List;

public class P07_LinkedList {

    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);
        sayilar.add(60);

        System.out.println(sayilar.hashCode()); // 59911,69211,1857301

        // boş list'lerin hashCode() her zaman 1 dir


    }
}
