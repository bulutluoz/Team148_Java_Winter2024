package day18_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        /*
            1- for loop
               baslangic ve sonuc biliniyorsa, tekrar sayisi biliniyorsa

            2- while loop
               tekrar sayisi belli degilse

            3- do-while loop
               loop body'nin en az 1 kere calismasi gereken durumlarda

            4- Cok ozel bir kullanim icin olusturulmustur
               ama o kullanimda cok ideal'dir

               For-each loop birden fazla eleman barindiran yapilardaki
               TUM ELEMENTLERI siralama olmaksizin (index kullanmadan) bize getirir
         */



        int[] arr = {3,4,5,2,3,4,5,1,2,3};
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,8,5,6,7,4,2,3,4,5,6,4,5,4,3));

        // arr'deki elementlerin toplamini yazdirin
        int toplam =0 ;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println("arraydeki elementlerin toplami : " + toplam);


        toplam =0;

        for ( int each  :  arr){

            toplam += each;

        }

        System.out.println("arraydeki elementlerin toplami : " + toplam);




        // sayilar listesindeki  cift sayilari toplayin

        toplam = 0;

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 == 0){
                toplam += sayilar.get(i);
            }

        }

        System.out.println("Listedeki cift sayilarin toplami : " + toplam);

        toplam = 0;

        for ( Integer each : sayilar){

            if ( each % 2 == 0){
                toplam += each;
            }

        }

        System.out.println("Listedeki cift sayilarin toplami : " + toplam);


    }
}
