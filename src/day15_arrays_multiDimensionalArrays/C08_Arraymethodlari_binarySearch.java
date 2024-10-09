package day15_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C08_Arraymethodlari_binarySearch {


    public static void main(String[] args) {

        String[] harfler = {"d","d","t","w","d","w","t","a","z","a"};


        // verilen bir array'de a harfinin var olup olmadigini yazdirin

        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"a");
        // Aradiginiz harf, array'de 2 kere kullanilmis


        C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(harfler,"x");
        // Aradiginiz harf, array'de kullanilmamis


        int[] sayilar = {3,4,7,9,1,12};

        // sayilar array'inde 8'in var olup olmadigini kontrol edin
        // C01_ElemanArama.arraydekiArananElemaninSayisiniYazdir(sayilar,8);
        // method call icin kullanilan argumentler (sayilar ve 8)
        // method parametreleri ile uyumlu degil ( String[] ve String arananHarf)

        System.out.println(Arrays.binarySearch(sayilar, 3)); // 0
        System.out.println(Arrays.binarySearch(sayilar, 4)); // 1
        System.out.println(Arrays.binarySearch(sayilar, 7)); // 2
        System.out.println(Arrays.binarySearch(sayilar, 9)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 1)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 12)); // 5


        /*
            Arrays.binarySearch() bir array'de aranan elementin
            hangi index'de oldugunu verir

            ANCAKKKK bu method'dan once sort() calistirilmalidir
         */

        Arrays.sort(sayilar); // [1, 3, 4, 7, 9, 12]

        System.out.println(Arrays.binarySearch(sayilar, 3)); // 1
        System.out.println(Arrays.binarySearch(sayilar, 4)); // 2
        System.out.println(Arrays.binarySearch(sayilar, 7)); // 3
        System.out.println(Arrays.binarySearch(sayilar, 9)); // 4
        System.out.println(Arrays.binarySearch(sayilar, 1)); // 0
        System.out.println(Arrays.binarySearch(sayilar, 12)); // 5



        // olmayan bir eleman arandiginda ise
        // olsaydi bulunacagi SIRALAMAYI - olarak verir
        // index kullanilsaydi -0 diyemeyecegimiz icin index degil SIRALAMAYI verir

        System.out.println(Arrays.binarySearch(sayilar, 10)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 5)); // -4
        System.out.println(Arrays.binarySearch(sayilar, 0)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 40)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 10000)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 234510)); // -7
    }
}
