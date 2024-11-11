package day33_collections_maps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_ArraydenTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        // Verilen bir array'de tekrar eden sayi varsa
        // tekrar eden sayilari silip,
        // array'i her sayidan sadece 1 tane bulunacak sekilde kaydedin
        // ornek input : {2,3,4,5,2,4,2,2,4,2,4,3,5,1}
        //       output : [1,2,3,4,5]

        int[] arr = {2,3,4,5,2,4,2,2,4,2,4,3,5,1};


        Set<Integer> benzersizSet = new HashSet<>();

        for (int each :arr){
            benzersizSet.add(each);
        }

        System.out.println("Set : "+ benzersizSet); //  [1, 2, 3, 4, 5]

        arr = new int[benzersizSet.size()];

        // Set index kullanmaz

        int index = 0;

        for(Integer each : benzersizSet){

            arr[index] = each;
            index++;
        }


        System.out.println("Array'in son hali : " + Arrays.toString(arr));





    }
}
