package day16_arrays_MultiDimensioanalArrays;

import java.util.Arrays;

public class C05_TumElementleriKontrolEtme {

    public static void main(String[] args) {

        int[][] arr = { {2,3,7},{3,5},{4},{1,2,3,6,8} };

        // arr'deki cift sayilarin toplamini yazdirin

        int ciftSayilarinToplami = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] %2 == 0){

                    ciftSayilarinToplami += arr[i][j];

                }

            }
        }
        System.out.println(ciftSayilarinToplami); // 22

        // arr'deki tek sayilardan en buyuk olani yazdirin
        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }

        int enBuyukTekSayi = Integer.MIN_VALUE ;
        // en buyuk tek sayiyi ariyoruz,
        // gecici atadigimiz bu degeri EN KUCUK deger olarak atadik

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if ( arr[i][j] %2 != 0  && arr[i][j] >enBuyukTekSayi){

                    enBuyukTekSayi = arr[i][j];
                }

            }

        }

        System.out.println("Array'deki en buyuk tek sayi : " + enBuyukTekSayi);


        // arr'deki tum sayilari 1 artirin

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                arr[i][j] +=1 ;

            }

        }
        // { {2,3,7},{3,5},{4},{1,2,3,6,8} }
        System.out.println(Arrays.deepToString(arr));

        // [[3, 4, 8], [4, 6], [5], [2, 3, 4, 7, 9]]



        // arr'deki tum tek sayilari ve cift sayilari ayri ayri toplayip
        // ciftSayilarToplami - tekSayilarToplamini yazdirin


        ciftSayilarinToplami = 0;
        int tekSayilarinToplami = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] %2 == 0 ){
                    ciftSayilarinToplami += arr[i][j];
                }else{
                    tekSayilarinToplami += arr[i][j];
                }

            }

        }

        System.out.println("Cift sayilarin ve tek sayilarin toplamlari arasindaki fark : "+ (ciftSayilarinToplami - tekSayilarinToplami)); // 1

    }
}
