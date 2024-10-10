package day16_arrays_MultiDimensioanalArrays;

import java.util.Arrays;

public class C01_BinarySearch {

    public static void main(String[] args) {


        String[] harfler = {"k","e","t","r","n"};

        // sort() kullanmadan binarySearch() kullanilirsa
        // sonucun dogru yada yanlis olduguna emin olamayiz
        System.out.println(Arrays.binarySearch(harfler, "k")); // 0
        System.out.println(Arrays.binarySearch(harfler, "e")); // -1
        System.out.println(Arrays.binarySearch(harfler, "t")); // 2
        System.out.println(Arrays.binarySearch(harfler, "r")); // -3
        System.out.println(Arrays.binarySearch(harfler, "n")); // -3


        Arrays.sort(harfler); // [e, k, n, r, t]

        System.out.println(Arrays.binarySearch(harfler, "k")); // 1
        System.out.println(Arrays.binarySearch(harfler, "e")); // 0
        System.out.println(Arrays.binarySearch(harfler, "t")); // 4
        System.out.println(Arrays.binarySearch(harfler, "r")); // 3
        System.out.println(Arrays.binarySearch(harfler, "n")); // 2

        // olmayan bir harf sorulursa ?

        System.out.println(Arrays.binarySearch(harfler, "a")); // -1
        System.out.println(Arrays.binarySearch(harfler, "b")); // -1
        System.out.println(Arrays.binarySearch(harfler, "g")); // -2
        System.out.println(Arrays.binarySearch(harfler, "s")); // -5




    }
}
