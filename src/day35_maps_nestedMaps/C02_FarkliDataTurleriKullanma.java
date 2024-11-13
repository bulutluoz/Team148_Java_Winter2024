package day35_maps_nestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FarkliDataTurleriKullanma {

    public static void main(String[] args) {

        String str = "Ali";

        // Integer sayi = str;
        Integer sayi = 20;

        // List<String> isimler = str ;
        List<String> isimler = new ArrayList<>();

        Object obj = str;
        obj = sayi;
        obj = isimler;

        // Non-primitive data turlerinde casting
        // SADECE parent-child iliskisi olan class'larda olur

        // str = (String) obj;



        List<Object> elementler = new ArrayList<>();

        elementler.add(20);
        elementler.add(true);
        elementler.add('a');
        elementler.add("Esra");

        int[] arr = {2,4,6};

        elementler.add(arr);


        // Data turunu Object secmek, elementleri eklemede bize cok kolaylik saglar
        // AMMMMAAA elementleri kullanirken surekli casting gerekebilir
        // surekli olarak kullanmak istedigimiz elementin data turunu kontrol etmeli
        // ve Object data turunden istedigimiz data turune Cast etmeliyiz


        System.out.println(elementler); // [20, true, a, Esra, [I@e580929]

        // elementler listesindeki 4.index'deki array'i yazdirin

        System.out.println(
                Arrays.toString((int[]) elementler.get(4))
        ); // [2, 4, 6]


        // elementler listesindeki 3.indexdeki ismin uzunlugunu yazdirin

        System.out.println(
                ((String) elementler.get(3)).length()
        ); // 4


        // elementler listesindeki 0.indexdeki sayiyi 5 artirin

        elementler.set(0,  (Integer)elementler.get(0) + 5            );

        System.out.println(elementler); // [25, true, a, Esra, [I@e580929]



    }
}
