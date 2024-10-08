package day14_scope_arrays;

public class C05_Length {

    public static void main(String[] args) {

        String str = "Java Candir";

        int[] arr = {3,5,7,9,1,2};

        System.out.println(   str.length()   ); // 11 String'deki karakter sayisi (method)

        System.out.println(   arr.length     ); // 6 array'deki element sayisi ( variable )


        // String'in son karakterini yazdirin
        System.out.println(str.charAt(str.length() - 1)); // r


        // arr'nin son elementini yazdirin
        System.out.println(arr[arr.length - 1]); // 2


        // String'in sondan 3. elementini yazdirin
        System.out.println(str.charAt(str.length() - 3)); // d


        // arr'nin sondan 3. elementini yazdirin
        System.out.println(arr[arr.length - 3]); // 9


    }
}
