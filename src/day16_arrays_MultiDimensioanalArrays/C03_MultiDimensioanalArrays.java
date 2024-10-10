package day16_arrays_MultiDimensioanalArrays;

import java.util.Arrays;

public class C03_MultiDimensioanalArrays {

    public static void main(String[] args) {

        // Array'lerde herhangi bir yazdirma islemi yapacagimiz zaman
        // ne yazdirdigimizi iyi bilmeliyiz
        // eger bir String veya primitive bir deger yazdiracaksak direk sout
        // eger yazdirmak istedigimiz sey tek katli bir array ise Arrays.toString(arr[3])
        // eger yazdirmak istedigimiz sey multiDimensioanlArray ise

        int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };

        System.out.println(arr.length); // 4

        System.out.println(arr[0].length); // 3

        System.out.println(arr[2][0]); // 4

        System.out.println( arr[3][3] ); // 6

        System.out.println( arr[1] ); // {3,5} ==>[I@2752f6e2

        System.out.println(Arrays.toString(arr[3])); // {1,2,3,6,8} ==> [1, 2, 3, 6, 8]

        System.out.println(  Arrays.toString(arr)  );
        // [[I@e580929, [I@2752f6e2, [I@1cd072a9, [I@7c75222b]

        System.out.println(Arrays.deepToString(arr)); // [[2, 3, 7], [3, 5], [4], [1, 2, 3, 6, 8]]



    }
}
