package day17_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_TumElementleriArtirma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(4,6,1,9,3));

        // sayilar listesindeki tum elementleri 4 artirin

        listeninElementleriniArtir(sayilar,4);

        System.out.println("Listenin son hali : " + sayilar); // [8, 10, 5, 13, 7]

        // elementleri tekrar 1 artirin

        listeninElementleriniArtir(sayilar,1);

        System.out.println("Listenin son hali : " + sayilar); // [9, 11, 6, 14, 8]








//        // listedeki tum elementleri 3 artirin
//
//        for (int i = 0; i < sayilar.size() ; i++) {
//
//            // i.index'deki elementi alip
//            int eskiDeger = sayilar.get(i);
//            // uzerine 3 ekleyip,
//            int yeniDeger = eskiDeger+3;
//            // i.index'deki elementi bu yeni deger olarak update edecegiz
//            sayilar.set(i, yeniDeger);
//
//        }
//
//        System.out.println(sayilar); // [7, 9, 4, 12, 6]




    }


    // verilen Integer bir listedeki tum elementleri
    // istenen bir deger kadar artirip donduren
    // bir method olusturun.

    public static List<Integer> listeninElementleriniArtir( List<Integer> eskiListe, int artisMiktari  ){

        for (int i = 0; i < eskiListe.size() ; i++) {

            // i.index'deki elementi alip
            int eskiDeger = eskiListe.get(i);
            // uzerine artis miktari ekleyip,
            int yeniDeger = eskiDeger+artisMiktari;
            // i.index'deki elementi bu yeni deger olarak update edecegiz
            eskiListe.set(i, yeniDeger);

        }

        return eskiListe;

    }
}
